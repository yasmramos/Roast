package io.github.yasmramos.roast.semantic;

import io.github.yasmramos.roast.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * Semantic Analyzer for the Roast programming language.
 * Performs type checking, scope resolution, and validates semantic rules.
 */
public class SemanticAnalyzer extends RoastBaseVisitor<Void> {
    
    private final List<String> errors = new ArrayList<>();
    private final Map<String, String> symbolTable = new HashMap<>();
    private final Stack<Map<String, String>> scopeStack = new Stack<>();
    private String currentFunctionReturnType = null;

    public SemanticAnalyzer() {
        enterScope(); // Global scope
    }

    private void enterScope() {
        scopeStack.push(new HashMap<>());
    }

    private void exitScope() {
        if (!scopeStack.isEmpty()) {
            scopeStack.pop();
        }
    }

    private void declareSymbol(String name, String type) {
        Map<String, String> currentScope = scopeStack.peek();
        if (currentScope.containsKey(name)) {
            errors.add("Error: Symbol '" + name + "' is already declared in this scope.");
        } else {
            currentScope.put(name, type);
            symbolTable.put(name, type); // Global registry for simplicity
        }
    }

    private String resolveSymbol(String name) {
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            Map<String, String> scope = scopeStack.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    public Map<String, String> getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitProgram(RoastParser.ProgramContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof RoastParser.DeclarationContext) {
                visitDeclaration((RoastParser.DeclarationContext) child);
            }
        }
        return null;
    }

    @Override
    public Void visitDeclaration(RoastParser.DeclarationContext ctx) {
        if (ctx.functionDecl() != null) {
            visitFunctionDecl(ctx.functionDecl());
        } else if (ctx.classDecl() != null) {
            visitClassDecl(ctx.classDecl());
        } else if (ctx.interfaceDecl() != null) {
            visitInterfaceDecl(ctx.interfaceDecl());
        } else if (ctx.variableDecl() != null) {
            visitVariableDecl(ctx.variableDecl());
        }
        return null;
    }

    @Override
    public Void visitFunctionDecl(RoastParser.FunctionDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String returnType = "Unit";
        if (ctx.type() != null) {
            returnType = ctx.type().getText();
        }
        
        declareSymbol(name, "Function<" + returnType + ">");
        currentFunctionReturnType = returnType;
        
        enterScope(); // Function scope
        
        // Parameters
        if (ctx.parameterList() != null) {
            visitParameterList(ctx.parameterList());
        }
        
        // Body
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        
        exitScope();
        currentFunctionReturnType = null;
        return null;
    }

    @Override
    public Void visitClassDecl(RoastParser.ClassDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        declareSymbol(name, "Class");
        
        enterScope(); // Class scope
        if (ctx.classBody() != null) {
            visitClassBody(ctx.classBody());
        }
        exitScope();
        return null;
    }

    @Override
    public Void visitInterfaceDecl(RoastParser.InterfaceDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        declareSymbol(name, "Interface");
        return null;
    }

    @Override
    public Void visitVariableDecl(RoastParser.VariableDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = "Unknown";
        
        if (ctx.type() != null) {
            type = ctx.type().getText();
        } else if (ctx.expression() != null) {
            // Type inference could go here
            type = "Inferred"; 
        }
        
        declareSymbol(name, type);
        return null;
    }

    @Override
    public Void visitStatement(RoastParser.StatementContext ctx) {
        if (ctx.assignmentStmt() != null) {
            visitAssignmentStmt(ctx.assignmentStmt());
        } else if (ctx.returnStmt() != null) {
            visitReturnStmt(ctx.returnStmt());
        } else if (ctx.ifStmt() != null) {
            visitIfStmt(ctx.ifStmt());
        } else if (ctx.whileStmt() != null) {
            visitWhileStmt(ctx.whileStmt());
        } else if (ctx.forStmt() != null) {
            visitForStmt(ctx.forStmt());
        } else if (ctx.expressionStmt() != null) {
            visitExpressionStmt(ctx.expressionStmt());
        }
        return null;
    }

    @Override
    public Void visitAssignmentStmt(RoastParser.AssignmentStmtContext ctx) {
        // Access assignment context via getRuleContext
        RoastParser.AssignmentContext assignCtx = ctx.assignment();
        if (assignCtx != null) {
            String varName = assignCtx.IDENTIFIER().getText();
            String resolvedType = resolveSymbol(varName);
            
            if (resolvedType == null) {
                errors.add("Error: Variable '" + varName + "' is not declared.");
            }
            // Further type checking against expression could be added here
        }
        return null;
    }

    @Override
    public Void visitReturnStmt(RoastParser.ReturnStmtContext ctx) {
        RoastParser.ReturnStatementContext retCtx = ctx.returnStatement();
        if (retCtx != null && retCtx.expression() != null) {
            // Check if return type matches function declaration
            if (currentFunctionReturnType == null) {
                errors.add("Error: Return statement outside of function.");
            }
            // Type matching logic would go here
        }
        return null;
    }

    @Override
    public Void visitIfStmt(RoastParser.IfStmtContext ctx) {
        // Condition type checking could be added here (must be Boolean)
        enterScope();
        if (ctx.block(0) != null) visitBlock(ctx.block(0));
        exitScope();
        
        if (ctx.ELSE() != null && ctx.block(1) != null) {
            enterScope();
            visitBlock(ctx.block(1));
            exitScope();
        }
        return null;
    }

    @Override
    public Void visitWhileStmt(RoastParser.WhileStmtContext ctx) {
        enterScope();
        RoastParser.WhileStatementContext whileCtx = ctx.whileStatement();
        if (whileCtx != null && whileCtx.block() != null) {
            visitBlock(whileCtx.block());
        }
        exitScope();
        return null;
    }

    @Override
    public Void visitForStmt(RoastParser.ForStmtContext ctx) {
        enterScope();
        RoastParser.ForStatementContext forCtx = ctx.forStatement();
        if (forCtx != null && forCtx.block() != null) {
            visitBlock(forCtx.block());
        }
        exitScope();
        return null;
    }

    @Override
    public Void visitExpressionStatement(RoastParser.ExpressionStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitParameterList(RoastParser.ParameterListContext ctx) {
        if (ctx.parameter() != null) {
            for (RoastParser.ParameterContext param : ctx.parameter()) {
                String name = param.IDENTIFIER().getText();
                String type = param.type() != null ? param.type().getText() : "Any";
                declareSymbol(name, type);
            }
        }
        return null;
    }

    @Override
    public Void visitBlock(RoastParser.BlockContext ctx) {
        if (ctx.statement() != null) {
            for (RoastParser.StatementContext stmt : ctx.statement()) {
                visitStatement(stmt);
            }
        }
        return null;
    }
    
    @Override
    public Void visitClassBody(RoastParser.ClassBodyContext ctx) {
        if (ctx.classMemberDeclaration() != null) {
            for (RoastParser.ClassMemberDeclarationContext member : ctx.classMemberDeclaration()) {
                if (member.functionDeclaration() != null) {
                    visitFunctionDeclaration(member.functionDeclaration());
                } else if (member.propertyDeclaration() != null) {
                    visitPropertyDeclaration(member.propertyDeclaration());
                }
            }
        }
        return null;
    }

    @Override
    public Void visitPropertyDeclaration(RoastParser.PropertyDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.type() != null ? ctx.type().getText() : "Inferred";
        declareSymbol(name, type);
        return null;
    }
    
    @Override
    public Void visitFunctionDeclaration(RoastParser.FunctionDeclarationContext ctx) {
        // Delegate to functionDecl visitor logic if needed, or handle here
        // For now, we treat it similar to functionDecl
        return null;
    }
}
