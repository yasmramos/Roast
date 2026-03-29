package io.github.yasmramos.roast.visitor;

import io.github.yasmramos.roast.parser.RoastBaseVisitor;
import io.github.yasmramos.roast.parser.RoastParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * AST Visitor for the Roast programming language.
 * This visitor traverses the parse tree and performs semantic analysis,
 * type checking, and scope resolution.
 */
public class RoastAstVisitor extends RoastBaseVisitor<Void> {
    
    private final Map<String, SymbolInfo> symbolTable = new HashMap<>();
    private final List<String> errors = new ArrayList<>();
    private final List<String> warnings = new ArrayList<>();
    private int currentScope = 0;
    private final Stack<Map<String, SymbolInfo>> scopeStack = new Stack<>();
    
    public RoastAstVisitor() {
        scopeStack.push(new HashMap<>());
    }
    
    /**
     * Represents a symbol in the symbol table.
     */
    public static class SymbolInfo {
        public enum SymbolKind {
            VARIABLE, FUNCTION, CLASS, INTERFACE, PARAMETER, FIELD
        }
        
        private final String name;
        private final SymbolKind kind;
        private final String type;
        private final int scope;
        private boolean isMutable;
        private boolean isInitialized;
        
        public SymbolInfo(String name, SymbolKind kind, String type, int scope) {
            this.name = name;
            this.kind = kind;
            this.type = type;
            this.scope = scope;
            this.isMutable = true; // Default to mutable (var)
            this.isInitialized = false;
        }
        
        public String getName() { return name; }
        public SymbolKind getKind() { return kind; }
        public String getType() { return type; }
        public int getScope() { return scope; }
        public boolean isMutable() { return isMutable; }
        public void setMutable(boolean mutable) { isMutable = mutable; }
        public boolean isInitialized() { return isInitialized; }
        public void setInitialized(boolean initialized) { isInitialized = initialized; }
    }
    
    @Override
    public Void visitProgram(RoastParser.ProgramContext ctx) {
        System.out.println("=== Starting AST Traversal ===");
        enterScope();
        
        // Visit all declarations in the program
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ctx.getChild(i).accept(this);
        }
        
        exitScope();
        System.out.println("=== AST Traversal Complete ===");
        
        if (!errors.isEmpty()) {
            System.err.println("\nCompilation failed with " + errors.size() + " error(s):");
            for (String error : errors) {
                System.err.println("  ERROR: " + error);
            }
        } else {
            System.out.println("\n✓ No semantic errors found!");
        }
        
        if (!warnings.isEmpty()) {
            System.out.println("\nWarnings (" + warnings.size() + "):");
            for (String warning : warnings) {
                System.out.println("  WARNING: " + warning);
            }
        }
        
        return null;
    }
    
    @Override
    public Void visitClassDeclaration(RoastParser.ClassDeclarationContext ctx) {
        String className = ctx.className.getText();
        int line = ctx.getStart().getLine();
        
        System.out.println("[Line " + line + "] Processing class: " + className);
        
        // Check for duplicate class definition
        if (scopeStack.peek().containsKey(className)) {
            addError("Duplicate class definition: '" + className + "' at line " + line);
            return null;
        }
        
        // Add class to symbol table
        SymbolInfo classInfo = new SymbolInfo(className, SymbolInfo.SymbolKind.CLASS, "class", currentScope);
        scopeStack.peek().put(className, classInfo);
        
        // Process type parameters if present
        if (ctx.typeParameters() != null) {
            visitTypeParameters(ctx.typeParameters());
        }
        
        // Process primary constructor parameters
        if (ctx.primaryConstructor() != null) {
            visitPrimaryConstructor(ctx.primaryConstructor(), className);
        }
        
        // Process superclass
        if (ctx.superclass() != null) {
            visitSuperclass(ctx.superclass());
        }
        
        // Process class body
        if (ctx.classBody() != null) {
            enterScope(); // Class body creates a new scope
            visitClassBody(ctx.classBody(), className);
            exitScope();
        }
        
        return null;
    }
    
    @Override
    public Void visitFunctionDeclaration(RoastParser.FunctionDeclarationContext ctx) {
        // Handle different types of function declarations (InlineFunc, SuspendFunc, etc.)
        String functionName = "";
        int line = ctx.getStart().getLine();
        
        if (ctx instanceof RoastParser.InlineFuncContext) {
            RoastParser.InlineFuncContext inlineCtx = (RoastParser.InlineFuncContext) ctx;
            functionName = inlineCtx.IDENTIFIER().getText();
            System.out.println("  [Line " + line + "] Processing inline function: " + functionName);
            processFunctionDetails(inlineCtx.parameters(), inlineCtx.type(), inlineCtx.block(), inlineCtx.expression(), functionName, line);
        } else if (ctx instanceof RoastParser.SuspendFuncContext) {
            RoastParser.SuspendFuncContext suspendCtx = (RoastParser.SuspendFuncContext) ctx;
            functionName = suspendCtx.IDENTIFIER().getText();
            System.out.println("  [Line " + line + "] Processing suspend function: " + functionName);
            processFunctionDetails(suspendCtx.parameters(), suspendCtx.type(), suspendCtx.block(), suspendCtx.expression(), functionName, line);
        } else {
            // Generic function declaration - try to get identifier from children
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) instanceof org.antlr.v4.runtime.tree.TerminalNode) {
                    org.antlr.v4.runtime.tree.TerminalNode node = (org.antlr.v4.runtime.tree.TerminalNode) ctx.getChild(i);
                    if (node.getSymbol().getType() == RoastParser.IDENTIFIER) {
                        functionName = node.getText();
                        break;
                    }
                }
            }
            if (!functionName.isEmpty()) {
                System.out.println("  [Line " + line + "] Processing function: " + functionName);
            }
        }
        
        return null;
    }
    
    private void processFunctionDetails(RoastParser.ParametersContext params, RoastParser.TypeContext returnType, 
                                        RoastParser.BlockContext block, RoastParser.ExpressionContext expression,
                                        String functionName, int line) {
        // Check for duplicate function in current scope (simplified - doesn't handle overloading)
        if (scopeStack.peek().containsKey(functionName)) {
            SymbolInfo existing = scopeStack.peek().get(functionName);
            if (existing.getKind() == SymbolInfo.SymbolKind.FUNCTION) {
                addWarning("Function '" + functionName + "' already defined in this scope (overloading not fully supported yet)");
            }
        }
        
        // Add function to symbol table
        String returnTypeStr = returnType != null ? returnType.getText() : "Unit";
        SymbolInfo funcInfo = new SymbolInfo(functionName, SymbolInfo.SymbolKind.FUNCTION, returnTypeStr, currentScope);
        scopeStack.peek().put(functionName, funcInfo);
        
        // Process function parameters
        if (params != null) {
            visitFunctionParameters(params);
        }
        
        // Process function body
        enterScope(); // Function body creates a new scope
        if (block != null) {
            visitBlock(block);
        } else if (expression != null) {
            visitExpression(expression);
        }
        exitScope();
    }
    
    private void visitBlock(RoastParser.BlockContext ctx) {
        if (ctx.statement() != null) {
            for (RoastParser.StatementContext stmtCtx : ctx.statement()) {
                stmtCtx.accept(this);
            }
        }
    }
    
    @Override
    public Void visitVariableDeclaration(RoastParser.VariableDeclarationContext ctx) {
        String varName = "";
        int line = ctx.getStart().getLine();
        boolean isVal = false;
        boolean isVar = false;
        String type = "inferred";
        
        // Handle different types of variable declarations
        if (ctx instanceof RoastParser.ImmutableVarContext) {
            RoastParser.ImmutableVarContext immutableCtx = (RoastParser.ImmutableVarContext) ctx;
            varName = immutableCtx.IDENTIFIER().getText();
            isVal = true;
            System.out.println("  [Line " + line + "] Processing immutable variable (val): " + varName);
            
            if (immutableCtx.expression() != null) {
                visitExpression(immutableCtx.expression());
            }
        } else if (ctx instanceof RoastParser.MutableVarContext) {
            RoastParser.MutableVarContext mutableCtx = (RoastParser.MutableVarContext) ctx;
            varName = mutableCtx.IDENTIFIER().getText();
            isVar = true;
            System.out.println("  [Line " + line + "] Processing mutable variable (var): " + varName);
            
            if (mutableCtx.expression() != null) {
                visitExpression(mutableCtx.expression());
            }
        } else if (ctx instanceof RoastParser.TypedVarContext) {
            RoastParser.TypedVarContext typedCtx = (RoastParser.TypedVarContext) ctx;
            varName = typedCtx.IDENTIFIER().getText();
            type = typedCtx.type() != null ? typedCtx.type().getText() : "inferred";
            isVar = false; // Typed without var/val keyword - default to immutable
            System.out.println("  [Line " + line + "] Processing typed variable: " + varName + " : " + type);
            
            if (typedCtx.expression() != null) {
                visitExpression(typedCtx.expression());
            }
        } else {
            // Try to get identifier from children
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) instanceof org.antlr.v4.runtime.tree.TerminalNode) {
                    org.antlr.v4.runtime.tree.TerminalNode node = (org.antlr.v4.runtime.tree.TerminalNode) ctx.getChild(i);
                    if (node.getSymbol().getType() == RoastParser.IDENTIFIER) {
                        varName = node.getText();
                        break;
                    }
                }
            }
            if (!varName.isEmpty()) {
                System.out.println("  [Line " + line + "] Processing variable: " + varName);
            }
        }
        
        if (!varName.isEmpty()) {
            // Check for duplicate variable in current scope
            if (scopeStack.peek().containsKey(varName)) {
                addError("Variable '" + varName + "' already defined in this scope at line " + line);
                return null;
            }
            
            // Add variable to symbol table
            SymbolInfo.SymbolKind kind = SymbolInfo.SymbolKind.VARIABLE;
            SymbolInfo varInfo = new SymbolInfo(varName, kind, type, currentScope);
            varInfo.setMutable(isVar);
            scopeStack.peek().put(varName, varInfo);
            varInfo.setInitialized(true); // Initialized if we got here
        }
        
        return null;
    }
    
    @Override
    public Void visitAssignment(RoastParser.AssignmentContext ctx) {
        String varName = ctx.assignmentTarget().getText();
        int line = ctx.getStart().getLine();
        
        System.out.println("  [Line " + line + "] Processing assignment to: " + varName);
        
        // Find variable in symbol table
        SymbolInfo varInfo = findSymbol(varName);
        if (varInfo == null) {
            addError("Undefined variable: '" + varName + "' at line " + line);
            return null;
        }
        
        // Check if variable is mutable
        if (!varInfo.isMutable()) {
            addError("Cannot assign to immutable variable '" + varName + "' at line " + line);
            return null;
        }
        
        // Process assigned expression
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        
        varInfo.setInitialized(true);
        return null;
    }
    
    @Override
    public Void visitIfStatement(RoastParser.IfStatementContext ctx) {
        int line = ctx.getStart().getLine();
        System.out.println("  [Line " + line + "] Processing if statement");
        
        // Process condition
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        
        // Process then branch
        if (ctx.statement(0) != null) {
            enterScope();
            ctx.statement(0).accept(this);
            exitScope();
        }
        
        // Process else branch if present
        if (ctx.ELSE() != null && ctx.statement(1) != null) {
            enterScope();
            ctx.statement(1).accept(this);
            exitScope();
        }
        
        return null;
    }
    
    @Override
    public Void visitWhileStatement(RoastParser.WhileStatementContext ctx) {
        int line = ctx.getStart().getLine();
        System.out.println("  [Line " + line + "] Processing while loop");
        
        // Process condition
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        
        // Process loop body
        if (ctx.statement() != null) {
            enterScope();
            ctx.statement().accept(this);
            exitScope();
        }
        
        return null;
    }
    
    @Override
    public Void visitForStatement(RoastParser.ForStatementContext ctx) {
        int line = ctx.getStart().getLine();
        String loopVar = ctx.loopVariable.getText();
        
        System.out.println("  [Line " + line + "] Processing for loop with variable: " + loopVar);
        
        enterScope(); // For loop creates a new scope for the loop variable
        
        // Add loop variable to symbol table
        SymbolInfo loopVarInfo = new SymbolInfo(loopVar, SymbolInfo.SymbolKind.VARIABLE, "inferred", currentScope);
        scopeStack.peek().put(loopVar, loopVarInfo);
        
        // Process iterable expression
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        
        // Process loop body
        if (ctx.statement() != null) {
            ctx.statement().accept(this);
        }
        
        exitScope();
        return null;
    }
    
    @Override
    public Void visitReturnStatement(RoastParser.ReturnStatementContext ctx) {
        int line = ctx.getStart().getLine();
        System.out.println("  [Line " + line + "] Processing return statement");
        
        // Process return expression if present
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        
        return null;
    }
    
    @Override
    public Void visitExpression(RoastParser.ExpressionContext ctx) {
        // Handle different types of expressions
        if (ctx.literal() != null) {
            visitLiteral(ctx.literal());
        } else if (ctx.identifier() != null) {
            String identifier = ctx.identifier().getText();
            int line = ctx.getStart().getLine();
            
            // Check if identifier is defined
            SymbolInfo symbol = findSymbol(identifier);
            if (symbol == null && !isBuiltInType(identifier)) {
                addWarning("Potentially undefined identifier: '" + identifier + "' at line " + line);
            }
        } else if (ctx.functionCall() != null) {
            visitFunctionCall(ctx.functionCall());
        } else if (ctx.binaryOp != null) {
            // Binary operation - visit both operands
            if (ctx.expression(0) != null) visitExpression(ctx.expression(0));
            if (ctx.expression(1) != null) visitExpression(ctx.expression(1));
        }
        
        return null;
    }
    
    @Override
    public Void visitFunctionCall(RoastParser.FunctionCallContext ctx) {
        String functionName = ctx.functionName.getText();
        int line = ctx.getStart().getLine();
        
        System.out.println("    [Line " + line + "] Processing function call: " + functionName);
        
        // Check if function is defined
        SymbolInfo funcInfo = findSymbol(functionName);
        if (funcInfo == null && !isBuiltInFunction(functionName)) {
            addWarning("Potentially undefined function: '" + functionName + "' at line " + line);
        }
        
        // Process arguments
        if (ctx.functionArguments() != null) {
            visitFunctionArguments(ctx.functionArguments());
        }
        
        return null;
    }
    
    @Override
    public Void visitLiteral(RoastParser.LiteralContext ctx) {
        if (ctx.STRING_LITERAL() != null) {
            System.out.println("    Found string literal: " + ctx.STRING_LITERAL().getText());
        } else if (ctx.INT_LITERAL() != null) {
            System.out.println("    Found integer literal: " + ctx.INT_LITERAL().getText());
        } else if (ctx.FLOAT_LITERAL() != null) {
            System.out.println("    Found float literal: " + ctx.FLOAT_LITERAL().getText());
        } else if (ctx.BOOLEAN_LITERAL() != null) {
            System.out.println("    Found boolean literal: " + ctx.BOOLEAN_LITERAL().getText());
        } else if (ctx.NULL_LITERAL() != null) {
            System.out.println("    Found null literal");
        }
        return null;
    }
    
    // Helper methods
    
    private void visitPrimaryConstructor(RoastParser.PrimaryConstructorContext ctx, String className) {
        System.out.println("    Processing primary constructor for class: " + className);
        
        if (ctx.constructorParameters() != null) {
            for (RoastParser.ConstructorParameterContext paramCtx : ctx.constructorParameters().constructorParameter()) {
                String paramName = paramCtx.parameterName.getText();
                String paramType = paramCtx.typeAnnotation() != null ? 
                                  paramCtx.typeAnnotation().getText().replace(":", "").trim() : "inferred";
                
                System.out.println("      Constructor parameter: " + paramName + ": " + paramType);
                
                // Add parameter to class scope
                SymbolInfo paramInfo = new SymbolInfo(paramName, SymbolInfo.SymbolKind.PARAMETER, paramType, currentScope);
                paramInfo.setMutable(paramCtx.VAR() != null);
                scopeStack.peek().put(paramName, paramInfo);
            }
        }
    }
    
    private void visitClassBody(RoastParser.ClassBodyContext ctx, String className) {
        if (ctx.classMemberDeclaration() != null) {
            for (RoastParser.ClassMemberDeclarationContext memberCtx : ctx.classMemberDeclaration()) {
                if (memberCtx.propertyDeclaration() != null) {
                    visitPropertyDeclaration(memberCtx.propertyDeclaration(), className);
                } else if (memberCtx.functionDeclaration() != null) {
                    visitFunctionDeclaration(memberCtx.functionDeclaration());
                } else if (memberCtx.initBlock() != null) {
                    visitInitBlock(memberCtx.initBlock());
                }
            }
        }
    }
    
    private void visitPropertyDeclaration(RoastParser.PropertyDeclarationContext ctx, String className) {
        String propName = ctx.IDENTIFIER().getText();
        int line = ctx.getStart().getLine();
        boolean isVal = ctx.VAL() != null;
        
        System.out.println("    [Line " + line + "] Processing property: " + propName + 
                          " in class " + className + " (" + (isVal ? "val" : "var") + ")");
        
        String propType = ctx.type() != null ? 
                         ctx.type().getText() : "inferred";
        
        SymbolInfo.SymbolKind kind = SymbolInfo.SymbolKind.FIELD;
        SymbolInfo propInfo = new SymbolInfo(propName, kind, propType, currentScope);
        propInfo.setMutable(!isVal);
        scopeStack.peek().put(propName, propInfo);
        
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
            propInfo.setInitialized(true);
        }
    }
    
    private void visitInitBlock(RoastParser.InitializerBlockContext ctx) {
        System.out.println("    Processing init block");
        enterScope();
        if (ctx.block() != null) {
            visitBlock(ctx.block());
        }
        exitScope();
    }
    
    private void visitCodeBlock(RoastParser.BlockContext ctx) {
        if (ctx.statement() != null) {
            for (RoastParser.StatementContext stmtCtx : ctx.statement()) {
                stmtCtx.accept(this);
            }
        }
    }
    
    private void visitFunctionParameters(RoastParser.ParametersContext ctx) {
        if (ctx.parameter() != null) {
            for (RoastParser.ParameterContext paramCtx : ctx.parameter()) {
                String paramName = paramCtx.IDENTIFIER().getText();
                String paramType = paramCtx.type() != null ? 
                                  paramCtx.type().getText() : "inferred";
                
                System.out.println("      Function parameter: " + paramName + ": " + paramType);
                
                SymbolInfo paramInfo = new SymbolInfo(paramName, SymbolInfo.SymbolKind.PARAMETER, paramType, currentScope);
                scopeStack.peek().put(paramName, paramInfo);
            }
        }
    }
    
    private void visitFunctionBody(RoastParser.FunctionBodyContext ctx) {
        if (ctx.codeBlock() != null) {
            visitCodeBlock(ctx.codeBlock());
        } else if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
    }
    
    private void visitFunctionArguments(RoastParser.FunctionArgumentsContext ctx) {
        if (ctx.expression() != null) {
            for (RoastParser.ExpressionContext argCtx : ctx.expression()) {
                visitExpression(argCtx);
            }
        }
    }
    
    private void visitTypeParameters(RoastParser.TypeParametersContext ctx) {
        System.out.println("    Processing type parameters");
        // Type parameter handling would go here
    }
    
    private void visitSuperclass(RoastParser.SuperclassContext ctx) {
        String superclassName = ctx.className.getText();
        System.out.println("    Extends: " + superclassName);
        
        // Check if superclass exists
        SymbolInfo superClassInfo = findSymbol(superclassName);
        if (superClassInfo == null) {
            addWarning("Superclass '" + superclassName + "' is not defined");
        } else if (superClassInfo.getKind() != SymbolInfo.SymbolKind.CLASS) {
            addError("'" + superclassName + "' is not a class");
        }
    }
    
    private void enterScope() {
        currentScope++;
        scopeStack.push(new HashMap<>());
        System.out.println("  Entering scope level " + currentScope);
    }
    
    private void exitScope() {
        if (scopeStack.size() > 1) {
            scopeStack.pop();
            System.out.println("  Exiting scope level " + currentScope);
            currentScope--;
        }
    }
    
    private SymbolInfo findSymbol(String name) {
        // Search from innermost scope to outermost
        for (int i = scopeStack.size() - 1; i >= 0; i--) {
            Map<String, SymbolInfo> scope = scopeStack.get(i);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }
        return null;
    }
    
    private boolean isBuiltInType(String type) {
        Set<String> builtInTypes = new HashSet<>(Arrays.asList(
            "Int", "Long", "Float", "Double", "Boolean", "String", "Char", 
            "Byte", "Short", "Unit", "Any", "Any?", "Nothing"
        ));
        return builtInTypes.contains(type);
    }
    
    private boolean isBuiltInFunction(String name) {
        Set<String> builtInFunctions = new HashSet<>(Arrays.asList(
            "print", "println", "toString", "equals", "hashCode", 
            "rangeTo", "until", "step"
        ));
        return builtInFunctions.contains(name);
    }
    
    private void addError(String message) {
        errors.add(message);
        System.err.println("ERROR: " + message);
    }
    
    private void addWarning(String message) {
        warnings.add(message);
        System.out.println("WARNING: " + message);
    }
    
    public List<String> getErrors() {
        return Collections.unmodifiableList(errors);
    }
    
    public List<String> getWarnings() {
        return Collections.unmodifiableList(warnings);
    }
    
    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
