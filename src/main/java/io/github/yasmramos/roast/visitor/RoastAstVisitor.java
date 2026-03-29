package io.github.yasmramos.roast.visitor;

import io.github.yasmramos.roast.parser.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * AST Visitor for the Roast programming language.
 * Traverses the parse tree to build an internal representation or perform initial analysis.
 */
public class RoastAstVisitor extends RoastBaseVisitor<Void> {

    @Override
    public Void visitProgram(RoastParser.ProgramContext ctx) {
        System.out.println("Visiting Program: " + ctx.getChildCount() + " declarations");
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
        System.out.println("  -> Function: " + name);
        return visitChildren(ctx);
    }

    @Override
    public Void visitClassDecl(RoastParser.ClassDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        System.out.println("  -> Class: " + name);
        return visitChildren(ctx);
    }

    @Override
    public Void visitInterfaceDecl(RoastParser.InterfaceDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        System.out.println("  -> Interface: " + name);
        return visitChildren(ctx);
    }

    @Override
    public Void visitVariableDecl(RoastParser.VariableDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        System.out.println("  -> Variable: " + name);
        return visitChildren(ctx);
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
        System.out.println("    -> Assignment Statement");
        return visitChildren(ctx);
    }

    @Override
    public Void visitReturnStmt(RoastParser.ReturnStmtContext ctx) {
        System.out.println("    -> Return Statement");
        return visitChildren(ctx);
    }

    @Override
    public Void visitIfStmt(RoastParser.IfStmtContext ctx) {
        System.out.println("    -> If Statement");
        return visitChildren(ctx);
    }

    @Override
    public Void visitWhileStmt(RoastParser.WhileStmtContext ctx) {
        System.out.println("    -> While Statement");
        return visitChildren(ctx);
    }

    @Override
    public Void visitForStmt(RoastParser.ForStmtContext ctx) {
        System.out.println("    -> For Statement");
        return visitChildren(ctx);
    }

    @Override
    public Void visitExpressionStmt(RoastParser.ExpressionStmtContext ctx) {
        System.out.println("    -> Expression Statement");
        return visitChildren(ctx);
    }
}
