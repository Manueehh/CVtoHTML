import java_cup.runtime.*;

import java.io.*;

public class MainCup {

    public static void main(String[] args) {
        try {
            String archivoEntrada = "data/cv_entradas.txt";

            FileReader reader = new FileReader(archivoEntrada);
            LexerCup lexer = new LexerCup(reader);

            CupParser parser = new CupParser(lexer);
            System.out.println("Iniciando parsing con JFlex + CUP");
            Symbol result = parser.parse();

            if (parser.hasErrors()) {
                System.err.println("\nEl archivo contiene errores.");
                System.err.println("No se generará HTML debido a los errores encontrados.");
                System.exit(1);
            }

            if (result != null && result.value != null) {
                System.out.println("✅ Parsing completado exitosamente");
            } else {
                System.out.println("✅ Parsing completado (sin errores sintácticos)");
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
