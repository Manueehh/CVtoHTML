public class Main {

    public static void main(String[] args) {
        try {
            String archivoEntrada = "data/cv_entradas.txt";

            CvProcessor.Result result = CvProcessor.parseWithAntlr(archivoEntrada);
            CvProcessor.render(result);

        } catch (Exception e) {
            System.err.println("Error durante el procesamiento:");
            e.printStackTrace();
        }
    }
}
