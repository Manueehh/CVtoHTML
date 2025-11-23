import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            String archivoEntrada = "data/cv_entradas.txt";
            String archivoSalida = "data/salida.txt";

            // 1. Leer archivo de entrada
            CharStream input = CharStreams.fromFileName(archivoEntrada);

            // 2. Inicializar lexer
            LexerPersona lexer = new LexerPersona(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 3. Inicializar parser
            CVParser parser = new CVParser(tokens);

            // 4. Parsear usando la regla inicial
            ParseTree tree = parser.cv_grupo();

            // 5. Crear visitor y procesar el árbol
            CVBuilderVisitor visitor = new CVBuilderVisitor();
            List<CV> cvs = visitor.visitCv_grupo((CVParser.Cv_grupoContext) tree);

            // 6. Mostrar variables globales
            Map<String, String> variablesGlobales = visitor.getVariablesGlobales();
            System.out.println("\n==================== VARIABLES GLOBALES ====================");
            variablesGlobales.forEach((k, v) -> System.out.println(k + " = " + v));

            // 7. Mostrar cada CV procesado
            System.out.println("\n==================== CVs PROCESADOS ====================");
            for (CV cv : cvs) {
                System.out.println(cv);
            }

            // 8. Guardar en archivo de salida
            try (PrintWriter pw = new PrintWriter(new FileWriter(archivoSalida))) {
                pw.println("==================== VARIABLES GLOBALES ====================");
                variablesGlobales.forEach((k, v) -> pw.println(k + " = " + v));

                pw.println("\n==================== CVs PROCESADOS ====================");
                for (CV cv : cvs) {
                    pw.println(cv);
                }
            }

            System.out.println("\nProcesamiento completado. Salida guardada en: " + archivoSalida);
            System.out.println("Total de CVs procesados: " + cvs.size());

        } catch (Exception e) {
            System.err.println("Error durante el procesamiento:");
            e.printStackTrace();
        }
    }
}
