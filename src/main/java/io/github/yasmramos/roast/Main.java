package io.github.yasmramos.roast;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import io.github.yasmramos.roast.parser.RoastLexer;
import io.github.yasmramos.roast.parser.RoastParser;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("🔥 Roast Language - El lenguaje más avanzado sobre JVM");
        
        // Código de ejemplo en Roast
        String roastCode = """
            fun main() {
                val mensaje = "¡Hola desde Roast!";
                println(mensaje);
                
                val numero = 42;
                if (numero > 10) {
                    println("El número es mayor que 10");
                }
                
                for (i in 1..5) {
                    println(i);
                }
            }
            """;
        
        // Crear el stream de entrada
        CharStream input = CharStreams.fromString(roastCode);
        
        // Crear el lexer
        RoastLexer lexer = new RoastLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Crear el parser
        RoastParser parser = new RoastParser(tokens);
        
        // Eliminar errores por defecto y usar nuestro listener de errores
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                                  int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Error de sintaxis en línea " + line + ":" + charPositionInLine + " - " + msg);
            }
        });
        
        // Parsear el programa
        RoastParser.ProgramContext tree = parser.program();
        
        // Verificar si hay errores de sintaxis
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("❌ Se encontraron " + parser.getNumberOfSyntaxErrors() + " errores de sintaxis");
            System.exit(1);
        }
        
        System.out.println("✅ Análisis sintáctico completado con éxito!");
        System.out.println("📄 Árbol de sintaxis generado:");
        System.out.println(tree.toStringTree(parser));
        
        // Aquí iría la implementación del visitor/listener para semántica y generación de código
        // RoastVisitor visitor = new RoastVisitorImpl();
        // visitor.visit(tree);
    }
}
