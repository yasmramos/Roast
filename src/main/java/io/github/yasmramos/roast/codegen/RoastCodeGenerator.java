package io.github.yasmramos.roast.codegen;

import io.github.yasmramos.roast.parser.RoastBaseVisitor;
import io.github.yasmramos.roast.parser.RoastParser.*;
import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.objectweb.asm.Opcodes.*;

public class RoastCodeGenerator extends RoastBaseVisitor<Void> {
    private final String outputDirectory;
    private ClassWriter cw;
    private GeneratorAdapter ga;
    private Method currentMethod;
    private Map<String, Integer> localVariables;
    private int localIndex;

    public RoastCodeGenerator(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    @Override
    public Void visitProgram(ProgramContext ctx) {
        String className = "RoastProgram";
        if (ctx.fileName != null) {
            className = ctx.fileName.getText().replace(".roast", "");
        }

        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cw.visit(V17, ACC_PUBLIC | ACC_SUPER, className, null, "java/lang/Object", null);

        // Generate constructor
        generateConstructor();

        // Visit all declarations
        for (DeclarationContext decl : ctx.declaration()) {
            visitDeclaration(decl);
        }

        cw.visitEnd();

        // Write class file
        try {
            File dir = new File(outputDirectory);
            if (!dir.exists()) dir.mkdirs();
            File classFile = new File(dir, className + ".class");
            FileOutputStream fos = new FileOutputStream(classFile);
            fos.write(cw.toByteArray());
            fos.close();
            System.out.println("Generated: " + classFile.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException("Failed to write class file", e);
        }

        return null;
    }

    private void generateConstructor() {
        Method init = Method.getMethod("void <init> ()");
        GeneratorAdapter adapter = new GeneratorAdapter(ACC_PUBLIC, init, cw);
        adapter.loadThis();
        adapter.invokeConstructor(Type.getType(Object.class), Method.getMethod("void <init> ()"));
        adapter.returnValue();
        adapter.endMethod();
    }

    @Override
    public Void visitDeclaration(DeclarationContext ctx) {
        if (ctx.functionDecl() != null) {
            visitFunctionDecl(ctx.functionDecl());
        }
        // TODO: Add support for class declarations, variable declarations at top level
        return null;
    }

    @Override
    public Void visitFunctionDecl(FunctionDeclContext ctx) {
        localVariables = new HashMap<>();
        localIndex = 0;

        String methodName = ctx.IDENTIFIER().getText();
        boolean isMain = methodName.equals("main");

        // Build method descriptor
        StringBuilder desc = new StringBuilder("(");
        if (isMain) {
            desc.append("[Ljava/lang/String;");
        } else {
            for (ParameterContext param : ctx.parameterList().parameter()) {
                desc.append(getTypeDescriptor(param.type()));
            }
        }
        desc.append(")");
        desc.append(getTypeDescriptor(ctx.type()));

        int access = ACC_PUBLIC | ACC_STATIC;
        if (isMain) {
            access |= ACC_PUBLIC | ACC_STATIC;
        }

        currentMethod = new Method(methodName, desc.toString());
        ga = new GeneratorAdapter(access, currentMethod, cw);
        ga.startMethod();

        // Allocate local variables for parameters
        if (isMain) {
            localVariables.put("args", localIndex++);
        } else {
            for (ParameterContext param : ctx.parameterList().parameter()) {
                String paramName = param.IDENTIFIER().getText();
                localVariables.put(paramName, localIndex++);
            }
        }

        // Visit function body
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }

        // Ensure return for non-void methods
        Type returnType = getType(ctx.type());
        if (!returnType.equals(Type.VOID_TYPE)) {
            // If no explicit return found, push default value (simplified)
            // In a real compiler, semantic analysis should ensure all paths return
        } else {
            ga.returnValue();
        }

        ga.endMethod();
        return null;
    }

    @Override
    public Void visitBlock(BlockContext ctx) {
        for (StatementContext stmt : ctx.statement()) {
            visitStatement(stmt);
        }
        return null;
    }

    @Override
    public Void visitStatement(StatementContext ctx) {
        if (ctx.varDecl() != null) {
            visitVarDecl(ctx.varDecl());
        } else if (ctx.returnStmt() != null) {
            visitReturnStmt(ctx.returnStmt());
        } else if (ctx.expressionStmt() != null) {
            visitExpressionStmt(ctx.expressionStmt());
        } else if (ctx.ifStmt() != null) {
            visitIfStmt(ctx.ifStmt());
        }
        return null;
    }

    @Override
    public Void visitVarDecl(VarDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        localVariables.put(name, localIndex++);

        Type type = getType(ctx.type());
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        } else {
            // Default initialization
            if (type.equals(Type.INT_TYPE)) {
                ga.push(0);
            } else if (type.equals(Type.DOUBLE_TYPE)) {
                ga.push(0.0);
            } else if (type.equals(Type.BOOLEAN_TYPE)) {
                ga.push(false);
            } else {
                ga.push((String) null);
            }
        }
        ga.storeLocal(localVariables.get(name));
        return null;
    }

    @Override
    public Void visitReturnStmt(ReturnStmtContext ctx) {
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        ga.returnValue();
        return null;
    }

    @Override
    public Void visitExpressionStmt(ExpressionStmtContext ctx) {
        visitExpression(ctx.expression());
        // Pop result if not used
        ga.pop();
        return null;
    }

    @Override
    public Void visitIfStmt(IfStmtContext ctx) {
        Label elseLabel = new Label();
        Label endLabel = new Label();

        visitExpression(ctx.condition);
        ga.ifZCmp(GeneratorAdapter.EQ, elseLabel);

        visitBlock(ctx.thenBlock);
        ga.goTo(endLabel);

        ga.mark(elseLabel);
        if (ctx.elseBlock != null) {
            visitBlock(ctx.elseBlock);
        }

        ga.mark(endLabel);
        return null;
    }

    @Override
    public Void visitExpression(ExpressionContext ctx) {
        if (ctx instanceof BinaryOpContext) {
            visitBinaryOp((BinaryOpContext) ctx);
        } else if (ctx instanceof LiteralExprContext) {
            visitLiteral(((LiteralExprContext) ctx).literal());
        } else if (ctx.IDENTIFIER() != null && ctx.getChildCount() == 1) {
            String name = ctx.IDENTIFIER().getText();
            if (localVariables.containsKey(name)) {
                ga.loadLocal(localVariables.get(name));
            } else {
                // Assume static field or error
                throw new RuntimeException("Undefined variable: " + name);
            }
        } else if (ctx instanceof FuncCallExprContext) {
            FuncCallExprContext funcCall = (FuncCallExprContext) ctx;
            visitFunctionCall(funcCall.functionCall());
        }
        return null;
    }

    @Override
    public Void visitBinaryOp(BinaryOpContext ctx) {
        visitExpression(ctx.left);
        visitExpression(ctx.right);

        String op = ctx.op.getText();
        switch (op) {
            case "+":
                ga.visitInsn(Opcodes.IADD); // Simplified for Int
                break;
            case "-":
                ga.visitInsn(Opcodes.ISUB);
                break;
            case "*":
                ga.visitInsn(Opcodes.IMUL);
                break;
            case "/":
                ga.visitInsn(Opcodes.IDIV);
                break;
            case "==":
                ga.ifICmp(GeneratorAdapter.EQ, new Label()); // Simplified
                break;
            default:
                throw new RuntimeException("Unsupported operator: " + op);
        }
        return null;
    }

    @Override
    public Void visitLiteral(LiteralContext ctx) {
        if (ctx.IntLiteral() != null) {
            ga.push(Integer.parseInt(ctx.IntLiteral().getText()));
        } else if (ctx.StringLit() != null) {
            String str = ctx.StringLit().getText();
            ga.push(str.substring(1, str.length() - 1)); // Remove quotes
        } else if (ctx.BoolLit() != null) {
            ga.push(Boolean.parseBoolean(ctx.BoolLit().getText()));
        }
        return null;
    }

    @Override
    public Void visitCallExpr(CallExprContext ctx) {
        String funcName = ctx.IDENTIFIER().getText();
        
        // Push arguments
        if (ctx.argumentList() != null) {
            for (ExpressionContext arg : ctx.argumentList().expression()) {
                visitExpression(arg);
            }
        }

        // For now, assume static calls in the same class or java.lang.System.out.println
        if ("println".equals(funcName)) {
            // Special handling for println
            ga.getField("java/lang/System", "out", "Ljava/io/PrintStream;");
            ga.swap();
            ga.invokeVirtual(Type.getType("Ljava/io/PrintStream;"), 
                new Method("println", Type.VOID_TYPE, new Type[]{Type.getType(Object.class)}));
        } else {
            // Static call in current class
            ga.invokeStatic(Type.getType("LRoastProgram;"), 
                new Method(funcName, getMethodDescriptor(ctx), getArgumentTypes(ctx)));
        }
        return null;
    }

    private Type[] getArgumentTypes(CallExprContext ctx) {
        if (ctx.argumentList() == null) {
            return new Type[0];
        }
        // Simplified: assume all are Object for dynamic calls or infer from context
        Type[] args = new Type[ctx.argumentList().expression().size()];
        for (int i = 0; i < args.length; i++) {
            args[i] = Type.getType(Object.class); // Placeholder
        }
        return args;
    }

    private String getMethodDescriptor(CallExprContext ctx) {
        // Simplified descriptor generation
        return "(Ljava/lang/Object;)V"; // Placeholder
    }

    private Type getType(TypeContext ctx) {
        if (ctx == null) return Type.VOID_TYPE;
        String typeName = ctx.getText();
        switch (typeName) {
            case "Int": return Type.INT_TYPE;
            case "Double": return Type.DOUBLE_TYPE;
            case "String": return Type.getType(String.class);
            case "Boolean": return Type.BOOLEAN_TYPE;
            case "Unit": return Type.VOID_TYPE;
            default: return Type.getType(Object.class);
        }
    }

    private String getTypeDescriptor(TypeContext ctx) {
        if (ctx == null) return "V";
        String typeName = ctx.getText();
        switch (typeName) {
            case "Int": return "I";
            case "Double": return "D";
            case "String": return "Ljava/lang/String;";
            case "Boolean": return "Z";
            case "Unit": return "V";
            default: return "Ljava/lang/Object;";
        }
    }
}
