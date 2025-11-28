import java_cup.runtime.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Main para ejecutar el parser JFlex + CUP
 * Equivalente funcional al Main de ANTLR
 */
public class MainCup {

    public static void main(String[] args) {
        try {
            String archivoEntrada = "data/cv_entradas.txt";

            // 1. Crear el lexer JFlex compatible con CUP
            FileReader reader = new FileReader(archivoEntrada);
            LexerCup lexer = new LexerCup(reader);

            // 2. Crear el parser CUP
            CupParser parser = new CupParser(lexer);

            // 3. Parsear el archivo
            System.out.println("=== Iniciando parsing con JFlex + CUP ===");
            Symbol result = parser.parse();

            if (result != null && result.value != null) {
                System.out.println("✓ Parsing completado exitosamente!");
            } else {
                System.out.println("✓ Parsing completado (sin errores sintácticos)");
            }

            CvProcessor.Result procesado = CvProcessor.parseWithAntlr(archivoEntrada);
            CvProcessor.render(procesado);

            reader.close();

        } catch (Exception e) {
            System.err.println("Error durante el procesamiento:");
            e.printStackTrace();
        }
    }
}
