package io.github.yasmramos.roast.visitor;

import io.github.yasmramos.roast.parser.RoastBaseVisitor;
import io.github.yasmramos.roast.parser.RoastParser;

/**
 * AST Visitor for printing the structure of Roast programs.
 */
public class RoastAstVisitor extends RoastBaseVisitor<Void> {
    
    private int indentLevel = 0;
    
    private void printIndent() {
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("  ");
        }
    }
    
    private void println(String text) {
        printIndent();
        System.out.println(text);
    }

    @Override
    public Void visitProgram(RoastParser.ProgramContext ctx) {
        println("Program");
        indentLevel++;
        for (int i = 0; i < ctx.statement().size(); i++) {
            visitStatement(ctx.statement(i));
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visitVarDeclStmt(RoastParser.VarDeclStmtContext ctx) {
        if (ctx.variableDeclaration() != null) {
            visitVariableDeclaration(ctx.variableDeclaration());
        }
        return null;
    }

    private Void visitVariableDeclaration(RoastParser.VariableDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String mutability = ctx instanceof RoastParser.MutableVarContext ? "var" : "val";
        println(mutability + " " + name);
        indentLevel++;
        if (ctx.typeAnnotation() != null) {
            println("Type: " + ctx.typeAnnotation().getText());
        }
        if (ctx.expression() != null) {
            println("Initializer:");
            indentLevel++;
            visitExpression(ctx.expression());
            indentLevel--;
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visitFuncDeclStmt(RoastParser.FuncDeclStmtContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        println("Function: " + name);
        indentLevel++;
        
        // Handle parameters
        if (ctx.parameters() != null) {
            println("Parameters:");
            indentLevel++;
            for (RoastParser.ParameterContext param : ctx.parameters().parameter()) {
                String paramName = param.IDENTIFIER().getText();
                String paramType = param.type() != null ? 
                                   param.type().getText() : "inferred";
                println(paramName + ": " + paramType);
            }
            indentLevel--;
        }
        
        // Handle return type
        if (ctx instanceof RoastParser.FunctionDefContext) {
            RoastParser.FunctionDefContext funcDef = (RoastParser.FunctionDefContext) ctx;
            if (funcDef.type() != null) {
                println("Return Type: " + funcDef.type().getText());
            }
            
            // Visit function body
            if (funcDef.block() != null) {
                println("Body:");
                indentLevel++;
                visitBlock(funcDef.block());
                indentLevel--;
            } else if (funcDef.expression() != null) {
                println("Expression Body:");
                indentLevel++;
                visitExpression(funcDef.expression());
                indentLevel--;
            }
        }
        
        indentLevel--;
        return null;
    }

    @Override
    public Void visitClassDeclStmt(RoastParser.ClassDeclStmtContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        println("Class: " + name);
        indentLevel++;
        
        if (ctx.classBody() != null) {
            println("Members:");
            indentLevel++;
            for (RoastParser.ClassMemberContext member : ctx.classBody().classMember()) {
                if (member.variableDeclaration() != null) {
                    visitVariableDeclaration(member.variableDeclaration());
                } else if (member.functionDeclaration() != null) {
                    visitFunctionDeclaration(member.functionDeclaration());
                }
            }
            indentLevel--;
        }
        
        indentLevel--;
        return null;
    }

    @Override
    public Void visitAssignmentStmt(RoastParser.AssignmentStmtContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        println("Assignment: " + name);
        indentLevel++;
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visitExprStmt(RoastParser.ExprStmtContext ctx) {
        println("Expression Statement:");
        indentLevel++;
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        indentLevel--;
        return null;
    }

    @Override
    public Void visitIfStmt(RoastParser.IfStmtContext ctx) {
        println("If Statement");
        indentLevel++;
        println("Condition:");
        indentLevel++;
        if (ctx.expression(0) != null) {
            visitExpression(ctx.expression(0));
        }
        indentLevel--;
        println("Then Branch:");
        indentLevel++;
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        indentLevel--;
        indentLevel--;
        return null;
    }

    @Override
    public Void visitWhileStmt(RoastParser.WhileStmtContext ctx) {
        println("While Loop");
        indentLevel++;
        println("Condition:");
        indentLevel++;
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        indentLevel--;
        println("Body:");
        indentLevel++;
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        indentLevel--;
        indentLevel--;
        return null;
    }

    @Override
    public Void visitForStmt(RoastParser.ForStmtContext ctx) {
        println("For Loop");
        indentLevel++;
        if (ctx.IDENTIFIER() != null) {
            println("Iterator: " + ctx.IDENTIFIER().getText());
        }
        println("Collection:");
        indentLevel++;
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        indentLevel--;
        println("Body:");
        indentLevel++;
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        indentLevel--;
        indentLevel--;
        return null;
    }

    @Override
    public Void visitReturnStmt(RoastParser.ReturnStmtContext ctx) {
        println("Return");
        indentLevel++;
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        indentLevel--;
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

    private Void visitBlock(RoastParser.BlockContext ctx) {
        println("Block");
        indentLevel++;
        if (ctx.statement() != null) {
            for (RoastParser.StatementContext stmt : ctx.statement()) {
                visitStatement(stmt);
            }
        }
        indentLevel--;
        return null;
    }

    private Void visitStatement(RoastParser.StatementContext ctx) {
        if (ctx instanceof RoastParser.VarDeclStmtContext) {
            visitVarDeclStmt((RoastParser.VarDeclStmtContext) ctx);
        } else if (ctx instanceof RoastParser.FuncDeclStmtContext) {
            visitFuncDeclStmt((RoastParser.FuncDeclStmtContext) ctx);
        } else if (ctx instanceof RoastParser.ClassDeclStmtContext) {
            visitClassDeclStmt((RoastParser.ClassDeclStmtContext) ctx);
        } else if (ctx instanceof RoastParser.AssignmentStmtContext) {
            visitAssignmentStmt((RoastParser.AssignmentStmtContext) ctx);
        } else if (ctx instanceof RoastParser.ExprStmtContext) {
            visitExprStmt((RoastParser.ExprStmtContext) ctx);
        } else if (ctx instanceof RoastParser.IfStmtContext) {
            visitIfStmt((RoastParser.IfStmtContext) ctx);
        } else if (ctx instanceof RoastParser.WhileStmtContext) {
            visitWhileStmt((RoastParser.WhileStmtContext) ctx);
        } else if (ctx instanceof RoastParser.ForStmtContext) {
            visitForStmt((RoastParser.ForStmtContext) ctx);
        } else if (ctx instanceof RoastParser.ReturnStmtContext) {
            visitReturnStmt((RoastParser.ReturnStmtContext) ctx);
        }
        return null;
    }

    private Void visitFunctionDeclaration(RoastParser.FunctionDeclarationContext ctx) {
        String name = null;
        
        // Get identifier from specific context type
        if (ctx instanceof RoastParser.FunctionDefContext) {
            name = ((RoastParser.FunctionDefContext) ctx).IDENTIFIER().getText();
        } else if (ctx instanceof RoastParser.ExternalFuncContext) {
            name = ((RoastParser.ExternalFuncContext) ctx).IDENTIFIER().getText();
        } else if (ctx instanceof RoastParser.InlineFuncContext) {
            name = ((RoastParser.InlineFuncContext) ctx).IDENTIFIER().getText();
        } else if (ctx instanceof RoastParser.TailRecFuncContext) {
            name = ((RoastParser.TailRecFuncContext) ctx).IDENTIFIER().getText();
        } else if (ctx instanceof RoastParser.SuspendFuncContext) {
            name = ((RoastParser.SuspendFuncContext) ctx).IDENTIFIER().getText();
        }
        
        if (name == null) {
            return null;
        }
        
        println("Method: " + name);
        indentLevel++;
        
        // Handle parameters based on context type
        if (ctx instanceof RoastParser.FunctionDefContext) {
            RoastParser.FunctionDefContext funcDef = (RoastParser.FunctionDefContext) ctx;
            if (funcDef.parameters() != null) {
                println("Parameters:");
                indentLevel++;
                for (RoastParser.ParameterContext param : funcDef.parameters().parameter()) {
                    String paramName = param.IDENTIFIER().getText();
                    String paramType = param.type() != null ? 
                                       param.type().getText() : "inferred";
                    println(paramName + ": " + paramType);
                }
                indentLevel--;
            }
            
            if (funcDef.block() != null) {
                println("Body:");
                indentLevel++;
                visitBlock(funcDef.block());
                indentLevel--;
            } else if (funcDef.expression() != null) {
                println("Expression Body:");
                indentLevel++;
                visitExpression(funcDef.expression());
                indentLevel--;
            }
        } else if (ctx instanceof RoastParser.ExternalFuncContext) {
            RoastParser.ExternalFuncContext extFunc = (RoastParser.ExternalFuncContext) ctx;
            if (extFunc.parameters() != null) {
                println("Parameters:");
                indentLevel++;
                for (RoastParser.ParameterContext param : extFunc.parameters().parameter()) {
                    String paramName = param.IDENTIFIER().getText();
                    String paramType = param.type() != null ? 
                                       param.type().getText() : "inferred";
                    println(paramName + ": " + paramType);
                }
                indentLevel--;
            }
        } else if (ctx instanceof RoastParser.InlineFuncContext) {
            RoastParser.InlineFuncContext inlineFunc = (RoastParser.InlineFuncContext) ctx;
            if (inlineFunc.parameters() != null) {
                println("Parameters:");
                indentLevel++;
                for (RoastParser.ParameterContext param : inlineFunc.parameters().parameter()) {
                    String paramName = param.IDENTIFIER().getText();
                    String paramType = param.type() != null ? 
                                       param.type().getText() : "inferred";
                    println(paramName + ": " + paramType);
                }
                indentLevel--;
            }
            
            if (inlineFunc.block() != null) {
                println("Body:");
                indentLevel++;
                visitBlock(inlineFunc.block());
                indentLevel--;
            } else if (inlineFunc.expression() != null) {
                println("Expression Body:");
                indentLevel++;
                visitExpression(inlineFunc.expression());
                indentLevel--;
            }
        } else if (ctx instanceof RoastParser.TailRecFuncContext) {
            RoastParser.TailRecFuncContext tailRecFunc = (RoastParser.TailRecFuncContext) ctx;
            if (tailRecFunc.parameters() != null) {
                println("Parameters:");
                indentLevel++;
                for (RoastParser.ParameterContext param : tailRecFunc.parameters().parameter()) {
                    String paramName = param.IDENTIFIER().getText();
                    String paramType = param.type() != null ? 
                                       param.type().getText() : "inferred";
                    println(paramName + ": " + paramType);
                }
                indentLevel--;
            }
            
            if (tailRecFunc.block() != null) {
                println("Body:");
                indentLevel++;
                visitBlock(tailRecFunc.block());
                indentLevel--;
            } else if (tailRecFunc.expression() != null) {
                println("Expression Body:");
                indentLevel++;
                visitExpression(tailRecFunc.expression());
                indentLevel--;
            }
        } else if (ctx instanceof RoastParser.SuspendFuncContext) {
            RoastParser.SuspendFuncContext suspendFunc = (RoastParser.SuspendFuncContext) ctx;
            if (suspendFunc.parameters() != null) {
                println("Parameters:");
                indentLevel++;
                for (RoastParser.ParameterContext param : suspendFunc.parameters().parameter()) {
                    String paramName = param.IDENTIFIER().getText();
                    String paramType = param.type() != null ? 
                                       param.type().getText() : "inferred";
                    println(paramName + ": " + paramType);
                }
                indentLevel--;
            }
            
            if (suspendFunc.block() != null) {
                println("Body:");
                indentLevel++;
                visitBlock(suspendFunc.block());
                indentLevel--;
            } else if (suspendFunc.expression() != null) {
                println("Expression Body:");
                indentLevel++;
                visitExpression(suspendFunc.expression());
                indentLevel--;
            }
        }
        
        indentLevel--;
        return null;
    }

    private Void visitExpression(RoastParser.ExpressionContext ctx) {
        if (ctx == null) {
            return null;
        }
        
        // Simple representation based on context type
        String exprText = ctx.getText();
        if (exprText.length() > 50) {
            exprText = exprText.substring(0, 50) + "...";
        }
        println("Expression: " + exprText);
        return null;
    }

    @Override
    protected Void defaultResult() {
        return null;
    }
}
