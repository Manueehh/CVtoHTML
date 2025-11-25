import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            String archivoEntrada = "data/cv_entradas.txt";

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
            RuntimeTypeAdapterFactory<Formacion> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory.of(Formacion.class, "tipo").registerSubtype(FormacionOficial.class, "oficial").registerSubtype(FormacionComplementaria.class, "complementaria");
            Gson gson = new GsonBuilder().registerTypeAdapterFactory(runtimeTypeAdapterFactory).setPrettyPrinting().create();
            System.out.println("\n==================== CVs PROCESADOS ====================");
            for (CV cv : cvs) {
                System.out.println(cv);
                String json = gson.toJson(cv);
                String filename = "data/cvs/cv_" + cv.getIdentificador() + ".json";

                Path ruta = Paths.get(filename);
                Files.write(ruta, json.getBytes(StandardCharsets.UTF_8));

                System.out.println("Archivo generado: " + ruta.toAbsolutePath());
            }

            System.out.println("Total de CVs procesados: " + cvs.size());

        } catch (Exception e) {
            System.err.println("Error durante el procesamiento:");
            e.printStackTrace();
        }
    }
}
