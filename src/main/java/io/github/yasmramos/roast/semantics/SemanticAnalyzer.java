package io.github.yasmramos.roast.semantics;

import io.github.yasmramos.roast.parser.RoastParser;
import io.github.yasmramos.roast.parser.RoastParserBaseVisitor;
import java.util.*;

public class SemanticAnalyzer extends RoastParserBaseVisitor<Void> {

    private final SymbolTable symbolTable;
    private final List<String> errors;
    private String currentFunctionReturnType;

    public SemanticAnalyzer() {
        this.symbolTable = new SymbolTable();
        this.errors = new ArrayList<>();
        this.currentFunctionReturnType = null;
    }

    public List<String> getErrors() {
        return errors;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Void visitProgram(RoastParser.ProgramContext ctx) {
        symbolTable.enterScope(); // Global scope
        for (RoastParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitVarDeclaration(RoastParser.VarDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String declaredType = null;
        
        if (ctx.typeSpecifier() != null) {
            declaredType = ctx.typeSpecifier().getText();
        }

        String inferredType = null;
        if (ctx.expression() != null) {
            inferredType = inferType(ctx.expression());
        }

        String finalType = declaredType != null ? declaredType : inferredType;

        if (finalType == null) {
            errors.add("Error at line " + ctx.getStart().getLine() + ": Cannot infer type for variable '" + name + "'. Please provide an explicit type or an initializer.");
            return null;
        }

        if (declaredType != null && inferredType != null && !declaredType.equals(inferredType)) {
            if (!isTypeCompatible(declaredType, inferredType)) {
                errors.add("Error at line " + ctx.getStart().getLine() + ": Type mismatch. Declared '" + declaredType + "' but inferred '" + inferredType + "'.");
            }
        }

        if (!symbolTable.defineVariable(name, finalType)) {
            errors.add("Error at line " + ctx.getStart().getLine() + ": Variable '" + name + "' is already defined in this scope.");
        }

        return null;
    }

    @Override
    public Void visitAssignment(RoastParser.AssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        SymbolTable.Symbol symbol = symbolTable.resolveVariable(name);

        if (symbol == null) {
            errors.add("Error at line " + ctx.getStart().getLine() + ": Undefined variable '" + name + "'.");
            return null;
        }

        String exprType = inferType(ctx.expression());
        if (exprType != null && !isTypeCompatible(symbol.getType(), exprType)) {
            errors.add("Error at line " + ctx.getStart().getLine() + ": Type mismatch. Cannot assign '" + exprType + "' to '" + symbol.getType() + "'.");
        }

        return null;
    }

    @Override
    public Void visitFunctionDeclaration(RoastParser.FunctionDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        
        String returnType = "Unit"; 
        if (ctx.typeSpecifier() != null) {
            returnType = ctx.typeSpecifier().getText();
        }

        List<String> paramTypes = new ArrayList<>();
        symbolTable.enterScope(); // Function scope

        if (ctx.parameters() != null && ctx.parameters().parameter() != null) {
            for (RoastParser.ParameterContext param : ctx.parameters().parameter()) {
                String paramName = param.IDENTIFIER().getText();
                String paramType = "Any";
                if (param.typeSpecifier() != null) {
                    paramType = param.typeSpecifier().getText();
                } else {
                     errors.add("Error at line " + param.getStart().getLine() + ": Parameter '" + paramName + "' must have an explicit type.");
                }
                paramTypes.add(paramType);
                symbolTable.defineVariable(paramName, paramType);
            }
        }

        if (!symbolTable.defineFunction(name, paramTypes, returnType)) {
            errors.add("Error at line " + ctx.getStart().getLine() + ": Function '" + name + "' is already defined.");
        }

        currentFunctionReturnType = returnType;
        visit(ctx.functionBody());
        currentFunctionReturnType = null;

        symbolTable.exitScope();
        return null;
    }

    @Override
    public Void visitReturnStatement(RoastParser.ReturnStatementContext ctx) {
        if (currentFunctionReturnType == null) {
            errors.add("Error at line " + ctx.getStart().getLine() + ": Return statement outside of function.");
            return null;
        }

        if ("Unit".equals(currentFunctionReturnType)) {
            if (ctx.expression() != null) {
                errors.add("Error at line " + ctx.getStart().getLine() + ": Function returning Unit cannot return a value.");
            }
        } else {
            if (ctx.expression() == null) {
                errors.add("Error at line " + ctx.getStart().getLine() + ": Function returning '" + currentFunctionReturnType + "' must return a value.");
            } else {
                String exprType = inferType(ctx.expression());
                if (exprType != null && !isTypeCompatible(currentFunctionReturnType, exprType)) {
                    errors.add("Error at line " + ctx.getStart().getLine() + ": Return type mismatch. Expected '" + currentFunctionReturnType + "', found '" + exprType + "'.");
                }
            }
        }
        return null;
    }

    /**
     * Infers the type of an expression.
     */
    private String inferType(RoastParser.ExpressionContext ctx) {
        if (ctx == null) return "Unit";

        // Literal inference
        if (ctx.literal() != null) {
            return inferLiteralType(ctx.literal());
        }

        // Identifier inference
        if (ctx.primaryExpression() != null && ctx.primaryExpression().IDENTIFIER() != null) {
            String name = ctx.primaryExpression().IDENTIFIER().getText();
            SymbolTable.Symbol sym = symbolTable.resolveVariable(name);
            if (sym != null) {
                return sym.getType();
            }
            return "Any"; 
        }

        // Binary Operations
        if (ctx.binaryOperation() != null) {
            RoastParser.ExpressionContext left = ctx.binaryOperation().left;
            RoastParser.ExpressionContext right = ctx.binaryOperation().right;
            String leftType = inferType(left);
            String rightType = inferType(right);

            String op = ctx.binaryOperation().operator.getText();
            
            // Arithmetic
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
                if ("Int".equals(leftType) && "Int".equals(rightType)) return "Int";
                if ("Double".equals(leftType) || "Double".equals(rightType)) return "Double";
                if ("String".equals(leftType) && op.equals("+")) return "String";
                errors.add("Error at line " + ctx.getStart().getLine() + ": Invalid types for arithmetic operator '" + op + "': " + leftType + " and " + rightType);
                return "Any";
            }
            
            // Comparison
            if (op.equals("==") || op.equals("!=") || op.equals("<") || op.equals(">") || op.equals("<=") || op.equals(">=")) {
                 if (leftType.equals(rightType)) return "Boolean";
                 errors.add("Error at line " + ctx.getStart().getLine() + ": Comparison between incompatible types: " + leftType + " and " + rightType);
                 return "Boolean";
            }

            // Logical
            if (op.equals("&&") || op.equals("||")) {
                if ("Boolean".equals(leftType) && "Boolean".equals(rightType)) return "Boolean";
                errors.add("Error at line " + ctx.getStart().getLine() + ": Logical operators require Boolean operands.");
                return "Boolean";
            }
        }

        // Function Call
        if (ctx.functionCall() != null) {
            String funcName = ctx.functionCall().IDENTIFIER().getText();
            SymbolTable.Symbol func = symbolTable.resolveFunction(funcName);
            if (func != null) {
                return func.getType();
            }
            errors.add("Error at line " + ctx.getStart().getLine() + ": Undefined function '" + funcName + "'.");
            return "Any";
        }

        // Parenthesized expression
        if (ctx.parenthesizedExpression() != null) {
            return inferType(ctx.parenthesizedExpression().expression());
        }

        return "Any";
    }

    private String inferLiteralType(RoastParser.LiteralContext ctx) {
        if (ctx.INT_LITERAL() != null) return "Int";
        if (ctx.DOUBLE_LITERAL() != null) return "Double";
        if (ctx.STRING_LITERAL() != null) return "String";
        if (ctx.BOOLEAN_LITERAL() != null) return "Boolean";
        if (ctx.NULL_LITERAL() != null) return "Null";
        return "Any";
    }

    private boolean isTypeCompatible(String expected, String actual) {
        if (expected.equals(actual)) return true;
        if ("Any".equals(expected)) return true;
        if ("Number".equals(expected) && ("Int".equals(actual) || "Double".equals(actual))) return true;
        return false;
    }
}
