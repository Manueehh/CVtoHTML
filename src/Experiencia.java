import java.util.List;

public class Experiencia {
    private List<ExperienciaItem> trabajos;

    public Experiencia(List<ExperienciaItem> trabajos) {
        this.trabajos = trabajos;
    }

    public List<ExperienciaItem> getTrabajos() {
        return trabajos;
    }

    @Override
    public String toString() {
        return "Experiencia [trabajos=" + trabajos + "]";
    }

    
}
