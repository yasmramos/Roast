package io.github.yasmramos.roast;

import io.github.yasmramos.roast.parser.RoastLexer;
import io.github.yasmramos.roast.parser.RoastParser;
import io.github.yasmramos.roast.visitor.RoastAstVisitor;
import io.github.yasmramos.roast.semantic.SemanticAnalyzer;
import io.github.yasmramos.roast.codegen.RoastCodeGenerator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

/**
 * Main class for the Roast programming language compiler.
 * Roast is an advanced JVM language with modern features.
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Roast Language Compiler v1.0");
        System.out.println("=============================");
        
        if (args.length == 0) {
            System.out.println("Usage: roast <file.roast>");
            System.out.println("No input file provided. Running REPL mode...");
            runREPL();
            return;
        }
        
        String fileName = args[0];
        compileFile(fileName);
    }
    
    private static void runREPL() {
        System.out.println("Roast REPL - Type 'exit' to quit");
        try {
            CharStream input = CharStreams.fromStream(System.in);
            RoastLexer lexer = new RoastLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RoastParser parser = new RoastParser(tokens);
            
            // Simple REPL loop would go here
            System.out.println("REPL mode initialized (basic implementation)");
        } catch (IOException e) {
            System.err.println("Error initializing REPL: " + e.getMessage());
        }
    }
    
    private static void compileFile(String fileName) {
        try {
            System.out.println("Compiling: " + fileName);
            
            // Load the source file
            CharStream input = CharStreams.fromFileName(fileName);
            
            // Create lexer
            RoastLexer lexer = new RoastLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Create parser
            RoastParser parser = new RoastParser(tokens);
            
            // Remove default error listeners
            parser.removeErrorListeners();
            lexer.removeErrorListeners();
            
            // Add custom error listener
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, 
                                       Object offendingSymbol, 
                                       int line, 
                                       int charPositionInLine, 
                                       String msg, 
                                       RecognitionException e) {
                    System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });
            
            // Parse the program
            RoastParser.ProgramContext tree = parser.program();
            
            // Check for syntax errors
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Compilation failed with " + parser.getNumberOfSyntaxErrors() + " syntax error(s)");
                System.exit(1);
            }
            
            System.out.println("Syntax analysis successful!");
            System.out.println("Parsed " + tree.getChildCount() + " top-level declaration(s)");
            
            // Walk the parse tree using our AST Visitor
            System.out.println("\n--- Starting AST Traversal ---");
            RoastAstVisitor visitor = new RoastAstVisitor();
            visitor.visitProgram(tree);
            
            // Perform semantic analysis
            System.out.println("\n--- Starting Semantic Analysis ---");
            SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer();
            semanticAnalyzer.visitProgram(tree);
            
            if (semanticAnalyzer.hasErrors()) {
                System.err.println("\nSemantic Analysis Failed:");
                for (String error : semanticAnalyzer.getErrors()) {
                    System.err.println("  " + error);
                }
                System.err.println("\nCompilation failed with " + semanticAnalyzer.getErrors().size() + " semantic error(s)");
                System.exit(1);
            }
            
            System.out.println("Semantic analysis completed successfully!");
            System.out.println("Symbol Table Contents:");
            System.out.println(semanticAnalyzer.getSymbolTable());
            
            // Generate bytecode
            System.out.println("\n--- Starting Code Generation ---");
            String outputDir = "build/generated/roast";
            RoastCodeGenerator codeGenerator = new RoastCodeGenerator(outputDir);
            codeGenerator.visitProgram(tree);
            
            System.out.println("\n✓ Compilation completed successfully!");
            System.out.println("Bytecode generated in: " + outputDir);
            
        } catch (Exception e) {
            System.err.println("Error compiling file: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
