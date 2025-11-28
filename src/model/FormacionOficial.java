package model;

public class FormacionOficial extends Formacion {
    private String facultad;
    private Integer anoFinal;
    private String planEstudios;

    public FormacionOficial(String titulo, String centro, String facultad, Integer anoFinal, String planEstudios) {
        super(titulo, centro);
        this.facultad = facultad;
        this.anoFinal = anoFinal;
        this.planEstudios = planEstudios;
    }

    public String getFacultad() {
        return facultad;
    }

    public Integer getAnoFinal() {
        return anoFinal;
    }

    public String getPlanEstudios() {
        return planEstudios;
    }

    @Override
    public String toString() {
        return "FormacionOficial [titulo=" + titulo + ", centro=" + centro + ", facultad=" + facultad + ", anoFinal="
                + anoFinal + ", planEstudios=" + planEstudios + "]";
    }
}
