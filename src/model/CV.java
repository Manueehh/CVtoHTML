package model;

import java.util.List;
import java.util.Map;

public class CV {
    private String identificador;
    private Persona datosPersonales;
    private Map<String, List<? extends Formacion>> formacion;
    private List<ExperienciaItem> experiencia;
    private List<HardSkill> hardSkills;
    private SoftSkill softSkills;
    private List<Idioma> idiomas;
    private List<Proyecto> portfolio;

    public CV(String identificador, Persona datosPersonales, Map<String, List<? extends Formacion>> formacion,
            List<ExperienciaItem> experiencia, List<HardSkill> hardSkills, SoftSkill softSkills,
            List<Idioma> idiomas, List<Proyecto> portfolio) {
        this.identificador = identificador;
        this.datosPersonales = datosPersonales;
        this.formacion = formacion;
        this.experiencia = experiencia;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
        this.idiomas = idiomas;
        this.portfolio = portfolio;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public Map<String, List<? extends Formacion>> getFormacion() {
        return formacion;
    }

    public List<ExperienciaItem> getExperiencia() {
        return experiencia;
    }

    public List<HardSkill> getHardSkills() {
        return hardSkills;
    }

    public SoftSkill getSoftSkills() {
        return softSkills;
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    public List<Proyecto> getPortfolio() {
        return portfolio;
    }

    @Override
    public String toString() {
        return "CV [identificador=" + identificador + ", datosPersonales=" + datosPersonales + ", formacion="
                + formacion + ", experiencia=" + experiencia + ", hardSkills=" + hardSkills + ", softSkills="
                + softSkills + ", idiomas=" + idiomas + ", portfolio=" + portfolio + "]";
    }
}
