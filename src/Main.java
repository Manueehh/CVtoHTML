public class Main {

    private static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            String archivoEntrada = "data/cv_entradas.txt";
            String outputDir = "data/portfolios";

            System.out.println("CV to HTML Portfolio Generator");
            System.out.println("Archivo de entrada: " + archivoEntrada);
            System.out.println("Directorio de salida: " + outputDir);

            // 1. Parsear CVs
            System.out.println("\\nParseando CVs...");
            CvProcessor.Result result = CvProcessor.parseWithAntlr(archivoEntrada);

            // 2. Mostrar información (opcional, para debugging)
            // CvProcessor.render(result);

            // 3. Generar portfolios HTML
            CvProcessor.renderToHTML(result, outputDir);

            System.out.println("Proceso completado exitosamente!");

        } catch (Exception e) {
            System.err.println("Error durante el procesamiento");
            e.printStackTrace();
        }
    }
}
