import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
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
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CVParser parser = new CVParser(tokens);

        ParseTree tree = parser.cv_grupo();

        CVBuilderVisitor visitor = new CVBuilderVisitor();
        List<CV> cvs = visitor.visitCv_grupo((CVParser.Cv_grupoContext) tree);
        Map<String, String> variables = visitor.getVariablesGlobales();

        return new Result(cvs, variables);
    }

    public static void render(Result result) throws IOException {
        Map<String, String> variablesGlobales = result.getVariablesGlobales();
        List<CV> cvs = result.getCvs();

        System.out.println("\n==================== VARIABLES GLOBALES ====================");
        variablesGlobales.forEach((k, v) -> System.out.println(k + " = " + v));

        RuntimeTypeAdapterFactory<Formacion> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
                .of(Formacion.class, "tipo")
                .registerSubtype(FormacionOficial.class, "oficial")
                .registerSubtype(FormacionComplementaria.class, "complementaria");

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(runtimeTypeAdapterFactory)
                .setPrettyPrinting()
                .create();

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
    }
}
