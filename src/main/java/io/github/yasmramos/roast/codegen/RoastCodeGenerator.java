package io.github.yasmramos.roast.codegen;

import io.github.yasmramos.roast.parser.RoastBaseVisitor;
import io.github.yasmramos.roast.parser.RoastParser.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.objectweb.asm.Opcodes.*;

/**
 * Code Generator for Roast Language using ASM library.
 * Transforms AST into JVM bytecode (.class files).
 */
public class RoastCodeGenerator extends RoastBaseVisitor<Void> {
    
    private final String outputDir;
    private ClassWriter cw;
    private MethodVisitor mv;
    private String currentClassName;
    private int localVarIndex;
    private Map<String, Integer> localVarSlots;
    private Stack<Label> breakLabels;
    private Stack<Label> continueLabels;
    
    public RoastCodeGenerator(String outputDir) {
        this.outputDir = outputDir;
        this.breakLabels = new Stack<>();
        this.continueLabels = new Stack<>();
    }
    
    @Override
    public Void visitProgram(ProgramContext ctx) {
        String fileName = ctx.start.getInputStream().getSourceName();
        if (fileName.endsWith(".roast")) {
            currentClassName = fileName.substring(0, fileName.length() - 6);
        } else {
            currentClassName = "RoastProgram";
        }
        
        currentClassName = currentClassName.replace('/', '.').replace('\\', '.');
        
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        
        cw.visit(V17, ACC_PUBLIC | ACC_SUPER, 
                 currentClassName.replace('.', '/'), 
                 null, 
                 "java/lang/Object", 
                 null);
        
        generateStaticInitializer();
        
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        
        writeClassFile();
        
        return null;
    }
    
    private void generateStaticInitializer() {
        MethodVisitor clinit = cw.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.visitCode();
        clinit.visitInsn(RETURN);
        clinit.visitMaxs(0, 0);
        clinit.visitEnd();
    }
    
    private void writeClassFile() {
        try {
            byte[] bytecode = cw.toByteArray();
            String classFileName = currentClassName.replace('.', '/') + ".class";
            
            java.io.File outFile = new java.io.File(outputDir, classFileName);
            outFile.getParentFile().mkdirs();
            
            FileOutputStream fos = new FileOutputStream(outFile);
            fos.write(bytecode);
            fos.close();
            
            System.out.println("Generated: " + outFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error writing class file: " + e.getMessage());
        }
    }
    
    @Override
    public Void visitFunctionDef(FunctionDefContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        
        StringBuilder descBuilder = new StringBuilder("(");
        for (ParameterContext param : ctx.parameters().parameter()) {
            descBuilder.append(getTypeDescriptor(param.type()));
        }
        descBuilder.append(")");
        
        if (ctx.type() != null) {
            descBuilder.append(getTypeDescriptor(ctx.type()));
        } else {
            descBuilder.append("V");
        }
        
        String methodDesc = descBuilder.toString();
        int access = ACC_PUBLIC | ACC_STATIC;
        
        mv = cw.visitMethod(access, methodName, methodDesc, null, null);
        mv.visitCode();
        
        localVarIndex = 0;
        localVarSlots = new HashMap<>();
        
        for (ParameterContext param : ctx.parameters().parameter()) {
            String paramName = param.IDENTIFIER().getText();
            localVarSlots.put(paramName, localVarIndex);
            localVarIndex += getSizeOfType(param.type());
        }
        
        if (ctx.block() != null) {
            visit(ctx.block());
        } else if (ctx.expression() != null) {
            visit(ctx.expression());
            Type returnType = getReturnType(ctx);
            mv.visitInsn(getReturnInstruction(returnType));
        } else {
            mv.visitInsn(RETURN);
        }
        
        mv.visitMaxs(localVarIndex, localVarIndex);
        mv.visitEnd();
        
        return null;
    }
    
    private Type getReturnType(FunctionDefContext ctx) {
        if (ctx.type() != null) {
            return parseType(ctx.type());
        }
        return Type.VOID_TYPE;
    }
    
    @Override
    public Void visitBlock(BlockContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof StatementContext) {
                visit((StatementContext) ctx.getChild(i));
            }
        }
        return null;
    }
    
    @Override
    public Void visitVarDeclStmt(VarDeclStmtContext ctx) {
        visit(ctx.variableDeclaration());
        return null;
    }
    
    @Override
    public Void visitImmutableVar(ImmutableVarContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ExpressionContext expr = ctx.expression();
        
        if (expr != null) {
            visit(expr);
            int slot = allocateLocal(name);
            Type type = inferTypeFromExpr(expr);
            mv.visitVarInsn(getStoreInstruction(type), slot);
        }
        return null;
    }
    
    @Override
    public Void visitMutableVar(MutableVarContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ExpressionContext expr = ctx.expression();
        
        if (expr != null) {
            visit(expr);
            int slot = allocateLocal(name);
            Type type = inferTypeFromExpr(expr);
            mv.visitVarInsn(getStoreInstruction(type), slot);
        }
        return null;
    }
    
    @Override
    public Void visitAssignmentStmt(AssignmentStmtContext ctx) {
        String varName = ctx.IDENTIFIER(0).getText();
        Integer slot = localVarSlots.get(varName);
        
        if (slot == null) {
            System.err.println("Error: Variable '" + varName + "' not found");
            return null;
        }
        
        visit(ctx.expression());
        Type type = inferTypeFromExpr(ctx.expression());
        mv.visitVarInsn(getStoreInstruction(type), slot);
        
        return null;
    }
    
    @Override
    public Void visitIfStmt(IfStmtContext ctx) {
        Label elseLbl = new Label();
        Label endLbl = new Label();
        
        visit(ctx.ifStatement().expression());
        mv.visitJumpInsn(IFEQ, elseLbl);
        
        visit(ctx.ifStatement().statement(0));
        
        mv.visitJumpInsn(GOTO, endLbl);
        
        mv.visitLabel(elseLbl);
        if (ctx.ifStatement().statement().size() > 1) {
            visit(ctx.ifStatement().statement(1));
        }
        
        mv.visitLabel(endLbl);
        
        return null;
    }
    
    @Override
    public Void visitWhileStmt(WhileStmtContext ctx) {
        Label startLbl = new Label();
        Label endLbl = new Label();
        
        breakLabels.push(endLbl);
        continueLabels.push(startLbl);
        
        mv.visitLabel(startLbl);
        
        visit(ctx.whileStatement().expression());
        mv.visitJumpInsn(IFEQ, endLbl);
        
        visit(ctx.whileStatement().statement());
        
        mv.visitJumpInsn(GOTO, startLbl);
        
        mv.visitLabel(endLbl);
        
        breakLabels.pop();
        continueLabels.pop();
        
        return null;
    }
    
    @Override
    public Void visitForStmt(ForStmtContext ctx) {
        Label startLbl = new Label();
        Label endLbl = new Label();
        
        breakLabels.push(endLbl);
        continueLabels.push(startLbl);
        
        String varName = ctx.forStatement().IDENTIFIER().getText();
        int varSlot = allocateLocal(varName);
        
        mv.visitInsn(ICONST_0);
        mv.visitVarInsn(ISTORE, varSlot);
        
        mv.visitLabel(startLbl);
        
        mv.visitVarInsn(ILOAD, varSlot);
        mv.visitIntInsn(BIPUSH, 10);
        mv.visitJumpInsn(IF_ICMPGE, endLbl);
        
        visit(ctx.forStatement().statement());
        
        mv.visitIincInsn(varSlot, 1);
        
        mv.visitJumpInsn(GOTO, startLbl);
        
        mv.visitLabel(endLbl);
        
        breakLabels.pop();
        continueLabels.pop();
        
        return null;
    }
    
    @Override
    public Void visitBreakStmt(BreakStmtContext ctx) {
        if (!breakLabels.isEmpty()) {
            mv.visitJumpInsn(GOTO, breakLabels.peek());
        }
        return null;
    }
    
    @Override
    public Void visitContinueStmt(ContinueStmtContext ctx) {
        if (!continueLabels.isEmpty()) {
            mv.visitJumpInsn(GOTO, continueLabels.peek());
        }
        return null;
    }
    
    @Override
    public Void visitReturnStmt(ReturnStmtContext ctx) {
        ReturnStatementContext retCtx = ctx.returnStatement();
        if (retCtx.expression() != null) {
            visit(retCtx.expression());
            Type type = inferTypeFromExpr(retCtx.expression());
            mv.visitInsn(getReturnInstruction(type));
        } else {
            mv.visitInsn(RETURN);
        }
        return null;
    }
    
    @Override
    public Void visitLiteralExpr(LiteralExprContext ctx) {
        LiteralContext literalCtx = ctx.literal();
        TerminalNode literal = null;
        
        // Get the first terminal node from the literal context
        for (int i = 0; i < literalCtx.getChildCount(); i++) {
            if (literalCtx.getChild(i) instanceof TerminalNode) {
                literal = (TerminalNode) literalCtx.getChild(i);
                break;
            }
        }
        
        if (literal == null) {
            return null;
        }
        
        if (literal.getText().matches("\\d+")) {
            int value = Integer.parseInt(literal.getText());
            if (value >= -1 && value <= 5) {
                mv.visitInsn(ICONST_0 + value);
            } else if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
                mv.visitIntInsn(BIPUSH, value);
            } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
                mv.visitIntInsn(SIPUSH, value);
            } else {
                mv.visitLdcInsn(value);
            }
        } else if (literalCtx instanceof DoubleLitContext) {
            double value = Double.parseDouble(literal.getText().replace("d", ""));
            mv.visitLdcInsn(value);
        } else if (literalCtx instanceof FloatLitContext) {
            float value = Float.parseFloat(literal.getText().replace("f", ""));
            mv.visitLdcInsn(value);
        } else if (literalCtx instanceof BoolLitContext) {
            mv.visitInsn(Boolean.parseBoolean(literal.getText()) ? ICONST_1 : ICONST_0);
        } else if (literalCtx instanceof StringLitContext) {
            String str = literal.getText();
            str = str.substring(1, str.length() - 1);
            mv.visitLdcInsn(str);
        } else if (literalCtx instanceof NullLitContext) {
            mv.visitInsn(ACONST_NULL);
        }
        
        return null;
    }
    
    @Override
    public Void visitAdditiveExpr(AdditiveExprContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        
        String op = ctx.getChild(1).getText();
        if ("+".equals(op)) {
            mv.visitInsn(IADD);
        } else if ("-".equals(op)) {
            mv.visitInsn(ISUB);
        }
        
        return null;
    }
    
    @Override
    public Void visitMultiplicativeExpr(MultiplicativeExprContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        
        String op = ctx.getChild(1).getText();
        if ("*".equals(op)) {
            mv.visitInsn(IMUL);
        } else if ("/".equals(op)) {
            mv.visitInsn(IDIV);
        } else if ("%".equals(op)) {
            mv.visitInsn(IREM);
        }
        
        return null;
    }
    
    @Override
    public Void visitComparisonExpr(ComparisonExprContext ctx) {
        visit(ctx.expression(0));
        visit(ctx.expression(1));
        
        String op = ctx.getChild(1).getText();
        Label trueLabel = new Label();
        Label endLabel = new Label();
        
        switch (op) {
            case "<":
                mv.visitJumpInsn(IF_ICMPLT, trueLabel);
                break;
            case ">":
                mv.visitJumpInsn(IF_ICMPGT, trueLabel);
                break;
            case "<=":
                mv.visitJumpInsn(IF_ICMPLE, trueLabel);
                break;
            case ">=":
                mv.visitJumpInsn(IF_ICMPGE, trueLabel);
                break;
        }
        
        mv.visitInsn(ICONST_0);
        mv.visitJumpInsn(GOTO, endLabel);
        
        mv.visitLabel(trueLabel);
        mv.visitInsn(ICONST_1);
        
        mv.visitLabel(endLabel);
        
        return null;
    }
    
    @Override
    public Void visitIdentifierExpr(IdentifierExprContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Integer slot = localVarSlots.get(name);
        
        if (slot != null) {
            mv.visitVarInsn(ILOAD, slot);
        } else {
            System.err.println("Warning: Variable '" + name + "' not found in local scope");
        }
        
        return null;
    }
    
    private int allocateLocal(String name) {
        if (localVarSlots.containsKey(name)) {
            return localVarSlots.get(name);
        }
        int slot = localVarIndex;
        localVarSlots.put(name, slot);
        localVarIndex++;
        return slot;
    }
    
    private String getTypeDescriptor(TypeContext typeCtx) {
        if (typeCtx == null) {
            return "V";
        }
        
        String typeName = typeCtx.getText().replace("?", "");
        
        switch (typeName) {
            case "Int": return "I";
            case "Long": return "J";
            case "Float": return "F";
            case "Double": return "D";
            case "Boolean": return "Z";
            case "Char": return "C";
            case "Byte": return "B";
            case "Short": return "S";
            case "String": return "Ljava/lang/String;";
            default: return "Ljava/lang/Object;";
        }
    }
    
    private Type parseType(TypeContext typeCtx) {
        if (typeCtx == null) {
            return Type.VOID_TYPE;
        }
        
        String typeName = typeCtx.getText().replace("?", "");
        
        switch (typeName) {
            case "Int": return Type.INT_TYPE;
            case "Long": return Type.LONG_TYPE;
            case "Float": return Type.FLOAT_TYPE;
            case "Double": return Type.DOUBLE_TYPE;
            case "Boolean": return Type.BOOLEAN_TYPE;
            case "Char": return Type.CHAR_TYPE;
            case "Byte": return Type.BYTE_TYPE;
            case "Short": return Type.SHORT_TYPE;
            case "String": return Type.getType("Ljava/lang/String;");
            default: return Type.getType("Ljava/lang/Object;");
        }
    }
    
    private int getSizeOfType(TypeContext typeCtx) {
        if (typeCtx == null) return 1;
        
        String typeName = typeCtx.getText().replace("?", "");
        if ("Long".equals(typeName) || "Double".equals(typeName)) {
            return 2;
        }
        return 1;
    }
    
    private Type inferTypeFromExpr(ExpressionContext expr) {
        if (expr instanceof LiteralExprContext) {
            LiteralContext literalCtx = ((LiteralExprContext) expr).literal();
            
            // Check the type by examining child nodes
            for (int i = 0; i < literalCtx.getChildCount(); i++) {
                if (literalCtx.getChild(i) instanceof TerminalNode) {
                    TerminalNode literal = (TerminalNode) literalCtx.getChild(i);
                    String text = literal.getText();
                    
                    if (text.matches("\\d+")) {
                        return Type.INT_TYPE;
                    } else if (text.contains(".") && text.toLowerCase().endsWith("f")) {
                        return Type.FLOAT_TYPE;
                    } else if (text.contains(".") || text.toLowerCase().endsWith("d")) {
                        return Type.DOUBLE_TYPE;
                    } else if ("true".equals(text) || "false".equals(text)) {
                        return Type.BOOLEAN_TYPE;
                    } else if (text.startsWith("\"")) {
                        return Type.getType("Ljava/lang/String;");
                    }
                } else if (literalCtx instanceof DoubleLitContext) {
                    return Type.DOUBLE_TYPE;
                } else if (literalCtx instanceof FloatLitContext) {
                    return Type.FLOAT_TYPE;
                } else if (literalCtx instanceof BoolLitContext) {
                    return Type.BOOLEAN_TYPE;
                } else if (literalCtx instanceof StringLitContext) {
                    return Type.getType("Ljava/lang/String;");
                }
            }
        } else if (expr instanceof AdditiveExprContext || expr instanceof MultiplicativeExprContext) {
            return Type.INT_TYPE;
        } else if (expr instanceof ComparisonExprContext || expr instanceof EqualityExprContext) {
            return Type.BOOLEAN_TYPE;
        }
        
        return Type.VOID_TYPE;
    }
    
    private int getStoreInstruction(Type type) {
        int sort = type.getSort();
        switch (sort) {
            case Type.BOOLEAN:
            case Type.CHAR:
            case Type.BYTE:
            case Type.SHORT:
            case Type.INT:
                return ISTORE;
            case Type.LONG:
                return LSTORE;
            case Type.FLOAT:
                return FSTORE;
            case Type.DOUBLE:
                return DSTORE;
            default:
                return ASTORE;
        }
    }
    
    private int getReturnInstruction(Type type) {
        if (type == null) return RETURN;
        
        int sort = type.getSort();
        switch (sort) {
            case Type.BOOLEAN:
            case Type.CHAR:
            case Type.BYTE:
            case Type.SHORT:
            case Type.INT:
                return IRETURN;
            case Type.LONG:
                return LRETURN;
            case Type.FLOAT:
                return FRETURN;
            case Type.DOUBLE:
                return DRETURN;
            case Type.VOID:
                return RETURN;
            default:
                return ARETURN;
        }
    }
}
