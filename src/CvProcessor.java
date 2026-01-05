import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import model.*;
import util.CustomErrorListener;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public final class CvProcessor {

    private CvProcessor() {
    }

    public static final class Result {
        private final List<CV> cvs;
        private final Map<String, String> variablesGlobales;

        public Result(List<CV> cvs, Map<String, String> variablesGlobales) {
            this.cvs = cvs;
            this.variablesGlobales = variablesGlobales;
        }

        public List<CV> getCvs() {
            return cvs;
        }

        public Map<String, String> getVariablesGlobales() {
            return variablesGlobales;
        }
    }

    public static Result parseWithAntlr(String archivoEntrada) throws IOException {
        CharStream input = CharStreams.fromFileName(archivoEntrada);
        LexerPersona lexer = new LexerPersona(input);

        lexer.removeErrorListeners();
        CustomErrorListener lexerErrorListener = new CustomErrorListener();
        lexer.addErrorListener(lexerErrorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CVParser parser = new CVParser(tokens);

        parser.removeErrorListeners();
        CustomErrorListener parserErrorListener = new CustomErrorListener();
        parser.addErrorListener(parserErrorListener);

        ParseTree tree = parser.cv_grupo();

        if (lexerErrorListener.hasErrors() || parserErrorListener.hasErrors()) {
            System.err.println("\nEl archivo contiene errores de sintaxis.");
            System.err.println("No se generará HTML debido a los errores encontrados.\n");
            throw new RuntimeException("Errores de sintaxis detectados");
        }

        CVBuilderVisitor visitor = new CVBuilderVisitor();
        List<CV> cvs = visitor.visitCv_grupo((CVParser.Cv_grupoContext) tree);
        Map<String, String> variables = visitor.getVariablesGlobales();
        visitor.getWarnings().forEach(System.out::println);

        if (!visitor.getErrors().isEmpty()) {
            System.err.println("\nErrores semánticos detectados:");
            visitor.getErrors().forEach(System.err::println);
            throw new RuntimeException("Errores semánticos detectados");
        }

        return new Result(cvs, variables);
    }

    public static void renderToHTML(Result result, String outputDir) throws IOException {
        List<CV> cvs = result.getCvs();

        // Crear directorio de salida si no existe
        Path outputPath = Paths.get(outputDir);
        if (!Files.exists(outputPath)) {
            Files.createDirectories(outputPath);
        }

        System.out.println("\\n==================== GENERANDO PORTFOLIOS HTML ====================");

        PortfolioHTMLGenerator generator = new PortfolioHTMLGenerator();

        for (CV cv : cvs) {
            String identificador = cv.getIdentificador();
            String filename = outputDir + "/portfolio_" + identificador + ".html";

            System.out.println("Generando portfolio para: " + identificador);

            try {
                generator.saveToFile(cv, filename);
                System.out.println("Portfolio HTML generado: " + Paths.get(filename).toAbsolutePath());
            } catch (Exception e) {
                System.err.println("Error generando portfolio para " + identificador + ": " + e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println("\\n==================== RESUMEN ====================");
        System.out.println("Total de portfolios generados: " + cvs.size());
        System.out.println("Directorio de salida: " + outputPath.toAbsolutePath());
    }

    public static void render(Result result) {
        Map<String, String> variablesGlobales = result.getVariablesGlobales();
        List<CV> cvs = result.getCvs();

        System.out.println("\\n==================== VARIABLES GLOBALES ====================");
        variablesGlobales.forEach((k, v) -> System.out.println(k + " = " + v));

        System.out.println("\\n==================== CVs PROCESADOS ====================");
        for (CV cv : cvs) {
            System.out.println("\\n--- CV: " + cv.getIdentificador() + " ---");
            System.out.println(cv);
            System.out.println();
        }

        System.out.println("Total de CVs procesados: " + cvs.size());
    }
}
