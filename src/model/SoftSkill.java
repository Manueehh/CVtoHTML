package model;

import java.util.List;

public class SoftSkill {
    private List<String> habilidades;

    public SoftSkill(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public SoftSkill() {
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "SoftSkill [habilidades=" + habilidades + "]";
    }

}
