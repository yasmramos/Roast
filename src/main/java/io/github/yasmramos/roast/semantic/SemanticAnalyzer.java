package io.github.yasmramos.roast.semantic;

import io.github.yasmramos.roast.parser.RoastBaseVisitor;
import io.github.yasmramos.roast.parser.RoastParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Semantic analyzer for the Roast language.
 * Performs type checking and scope resolution.
 */
public class SemanticAnalyzer extends RoastBaseVisitor<Void> {
    private final SymbolTable symbolTable = new SymbolTable();
    private final List<String> errors = new ArrayList<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public List<String> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    @Override
    public Void visitProgram(RoastParser.ProgramContext ctx) {
        // Visit all statements in the program
        for (int i = 0; i < ctx.statement().size(); i++) {
            RoastParser.StatementContext stmt = ctx.statement(i);
            if (stmt instanceof RoastParser.VarDeclStmtContext) {
                visitVarDeclStmt((RoastParser.VarDeclStmtContext) stmt);
            } else if (stmt instanceof RoastParser.FuncDeclStmtContext) {
                visitFuncDeclStmt((RoastParser.FuncDeclStmtContext) stmt);
            } else if (stmt instanceof RoastParser.ClassDeclStmtContext) {
                visitClassDeclStmt((RoastParser.ClassDeclStmtContext) stmt);
            } else if (stmt instanceof RoastParser.AssignmentStmtContext) {
                visitAssignmentStmt((RoastParser.AssignmentStmtContext) stmt);
            } else if (stmt instanceof RoastParser.ExprStmtContext) {
                visitExprStmt((RoastParser.ExprStmtContext) stmt);
            } else if (stmt instanceof RoastParser.IfStmtContext) {
                visitIfStmt((RoastParser.IfStmtContext) stmt);
            } else if (stmt instanceof RoastParser.WhileStmtContext) {
                visitWhileStmt((RoastParser.WhileStmtContext) stmt);
            } else if (stmt instanceof RoastParser.ForStmtContext) {
                visitForStmt((RoastParser.ForStmtContext) stmt);
            } else if (stmt instanceof RoastParser.ReturnStmtContext) {
                visitReturnStmt((RoastParser.ReturnStmtContext) stmt);
            }
        }
        return null;
    }

    @Override
    public Void visitVarDeclStmt(RoastParser.VarDeclStmtContext ctx) {
        // Handle variable declaration statements
        if (ctx.variableDeclaration() != null) {
            visitVariableDeclaration(ctx.variableDeclaration());
        }
        return null;
    }

    private Void visitVariableDeclaration(RoastParser.VariableDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = "var"; // Default type inference
        
        // Check for type in typed variable declarations
        if (ctx instanceof RoastParser.TypedVarContext) {
            RoastParser.TypedVarContext typedVar = (RoastParser.TypedVarContext) ctx;
            if (typedVar.type() != null) {
                type = typedVar.type().getText();
            }
        } else if (ctx instanceof RoastParser.ImmutableVarContext) {
            type = "val";
        } else if (ctx instanceof RoastParser.MutableVarContext) {
            type = "var";
        }
        
        boolean isMutable = !(ctx instanceof RoastParser.ImmutableVarContext);
        
        if (!symbolTable.defineSymbol(name, type, isMutable)) {
            addError(ctx, "Variable '" + name + "' is already defined in this scope");
        } else {
            // Mark as initialized if there's an initializer
            if (ctx.expression() != null) {
                Symbol symbol = symbolTable.resolveSymbol(name);
                if (symbol != null) {
                    symbol.setInitialized(true);
                }
            }
        }
        
        return null;
    }

    @Override
    public Void visitFuncDeclStmt(RoastParser.FuncDeclStmtContext ctx) {
        // Handle different function declaration types
        if (ctx instanceof RoastParser.FunctionDefContext) {
            RoastParser.FunctionDefContext funcDef = (RoastParser.FunctionDefContext) ctx;
            return visitFunctionDef(funcDef);
        } else if (ctx instanceof RoastParser.ExternalFuncContext) {
            RoastParser.ExternalFuncContext extFunc = (RoastParser.ExternalFuncContext) ctx;
            return visitExternalFunc(extFunc);
        } else if (ctx instanceof RoastParser.InlineFuncContext) {
            RoastParser.InlineFuncContext inlineFunc = (RoastParser.InlineFuncContext) ctx;
            return visitInlineFunc(inlineFunc);
        } else if (ctx instanceof RoastParser.TailRecFuncContext) {
            RoastParser.TailRecFuncContext tailRecFunc = (RoastParser.TailRecFuncContext) ctx;
            return visitTailRecFunc(tailRecFunc);
        } else if (ctx instanceof RoastParser.SuspendFuncContext) {
            RoastParser.SuspendFuncContext suspendFunc = (RoastParser.SuspendFuncContext) ctx;
            return visitSuspendFunc(suspendFunc);
        }
        return null;
    }
    
    private Void visitFunctionDef(RoastParser.FunctionDefContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String returnType = "Unit";
        
        if (ctx.type() != null) {
            returnType = ctx.type().getText();
        }
        
        if (!symbolTable.defineSymbol(name, "function(" + returnType + ")", false)) {
            addError(ctx, "Function '" + name + "' is already defined in this scope");
        } else {
            // Enter function scope
            symbolTable.enterScope();
            
            // Register parameters
            if (ctx.parameters() != null) {
                for (RoastParser.ParameterContext param : ctx.parameters().parameter()) {
                    visitParameter(param);
                }
            }
            
            // Visit function body
            if (ctx.block() != null) {
                visitBlock(ctx.block());
            } else if (ctx.expression() != null) {
                visitExpression(ctx.expression());
            }
            
            // Exit function scope
            symbolTable.exitScope();
        }
        
        return null;
    }
    
    private Void visitExternalFunc(RoastParser.ExternalFuncContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String returnType = "Unit";
        
        if (ctx.type() != null) {
            returnType = ctx.type().getText();
        }
        
        if (!symbolTable.defineSymbol(name, "external_function(" + returnType + ")", false)) {
            addError(ctx, "Function '" + name + "' is already defined in this scope");
        }
        
        return null;
    }
    
    private Void visitInlineFunc(RoastParser.InlineFuncContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String returnType = "Unit";
        
        if (ctx.type() != null) {
            returnType = ctx.type().getText();
        }
        
        if (!symbolTable.defineSymbol(name, "inline_function(" + returnType + ")", false)) {
            addError(ctx, "Function '" + name + "' is already defined in this scope");
        } else {
            symbolTable.enterScope();
            
            if (ctx.parameters() != null) {
                for (RoastParser.ParameterContext param : ctx.parameters().parameter()) {
                    visitParameter(param);
                }
            }
            
            if (ctx.block() != null) {
                visitBlock(ctx.block());
            } else if (ctx.expression() != null) {
                visitExpression(ctx.expression());
            }
            
            symbolTable.exitScope();
        }
        
        return null;
    }
    
    private Void visitTailRecFunc(RoastParser.TailRecFuncContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String returnType = "Unit";
        
        if (ctx.type() != null) {
            returnType = ctx.type().getText();
        }
        
        if (!symbolTable.defineSymbol(name, "tailrec_function(" + returnType + ")", false)) {
            addError(ctx, "Function '" + name + "' is already defined in this scope");
        } else {
            symbolTable.enterScope();
            
            if (ctx.parameters() != null) {
                for (RoastParser.ParameterContext param : ctx.parameters().parameter()) {
                    visitParameter(param);
                }
            }
            
            if (ctx.block() != null) {
                visitBlock(ctx.block());
            } else if (ctx.expression() != null) {
                visitExpression(ctx.expression());
            }
            
            symbolTable.exitScope();
        }
        
        return null;
    }
    
    private Void visitSuspendFunc(RoastParser.SuspendFuncContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String returnType = "Unit";
        
        if (ctx.type() != null) {
            returnType = ctx.type().getText();
        }
        
        if (!symbolTable.defineSymbol(name, "suspend_function(" + returnType + ")", false)) {
            addError(ctx, "Function '" + name + "' is already defined in this scope");
        } else {
            symbolTable.enterScope();
            
            if (ctx.parameters() != null) {
                for (RoastParser.ParameterContext param : ctx.parameters().parameter()) {
                    visitParameter(param);
                }
            }
            
            if (ctx.block() != null) {
                visitBlock(ctx.block());
            } else if (ctx.expression() != null) {
                visitExpression(ctx.expression());
            }
            
            symbolTable.exitScope();
        }
        
        return null;
    }

    private Void visitParameter(RoastParser.ParameterContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = "Any";
        
        if (ctx.type() != null) {
            type = ctx.type().getText();
        }
        
        if (!symbolTable.defineSymbol(name, type, false)) {
            addError(ctx, "Parameter '" + name + "' is already defined");
        }
        
        return null;
    }

    private Void visitFunctionBody(RoastParser.FunctionBodyContext ctx) {
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        } else if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        return null;
    }

    @Override
    public Void visitBlock(RoastParser.BlockContext ctx) {
        symbolTable.enterScope();
        
        if (ctx.statement() != null) {
            for (RoastParser.StatementContext stmt : ctx.statement()) {
                visitStatement(stmt);
            }
        }
        
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitClassDeclaration(RoastParser.ClassDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        
        if (!symbolTable.defineSymbol(name, "class", false)) {
            addError(ctx, "Class '" + name + "' is already defined in this scope");
        } else {
            // Enter class scope
            symbolTable.enterScope();
            
            // Visit class members
            if (ctx.classBody() != null) {
                visitClassBody(ctx.classBody());
            }
            
            // Exit class scope
            symbolTable.exitScope();
        }
        
        return null;
    }

    @Override
    public Void visitClassBody(RoastParser.ClassBodyContext ctx) {
        if (ctx.classMember() != null) {
            for (RoastParser.ClassMemberContext member : ctx.classMember()) {
                visitClassMember(member);
            }
        }
        return null;
    }

    @Override
    public Void visitClassMember(RoastParser.ClassMemberContext ctx) {
        if (ctx.variableDeclaration() != null) {
            visitVariableDeclaration(ctx.variableDeclaration());
        } else if (ctx.functionDeclaration() != null) {
            visitFunctionDeclaration(ctx.functionDeclaration());
        }
        return null;
    }

    @Override
    public Void visitIdentifierExpression(RoastParser.IdentifierExpressionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol symbol = symbolTable.resolveSymbol(name);
        
        if (symbol == null) {
            addError(ctx, "Undefined variable: '" + name + "'");
        } else if (!symbol.isInitialized()) {
            addError(ctx, "Variable '" + name + "' is used before initialization");
        }
        
        return null;
    }

    @Override
    public Void visitAssignmentExpression(RoastParser.AssignmentExpressionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Symbol symbol = symbolTable.resolveSymbol(name);
        
        if (symbol == null) {
            addError(ctx, "Undefined variable in assignment: '" + name + "'");
        } else if (!symbol.isMutable()) {
            addError(ctx, "Cannot assign to immutable variable: '" + name + "'");
        } else {
            visitExpression(ctx.expression());
            symbol.setInitialized(true);
        }
        
        return null;
    }

    private void addError(ParseTree ctx, String message) {
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        errors.add(String.format("Error at %d:%d - %s", line, column, message));
    }

    @Override
    protected Void defaultResult() {
        return null;
    }
}
