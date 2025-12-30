package model;

import java.util.List;

public class Experiencia {
    private List<ExperienciaItem> experiencias;

    public Experiencia(List<ExperienciaItem> experiencias) {
        this.experiencias = experiencias;
    }

    public List<ExperienciaItem> getExperiencias() {
        return experiencias;
    }

    @Override
    public String toString() {
        return "Experiencia [experiencias=" + experiencias + "]";
    }
}
