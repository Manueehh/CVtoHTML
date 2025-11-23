import java.util.List;
import java.util.Map;

public class CV {
    private String identificador;
    private Persona informacionPersonal;

    private Map<String, List<? extends Formacion>> formacion; 
    private List<ExperienciaItem> experiencia;

    private List<HardSkill> hardSkills;
    private SoftSkill softSkills;

    private List<Idioma> idiomas;

    private List<Proyecto> portfolio;

    public CV(String identificador,Persona informacionPersonal,Map<String, List<? extends Formacion>> formacion,List<ExperienciaItem> experiencia,List<HardSkill> hardSkills,SoftSkill softSkills,List<Idioma> idiomas,List<Proyecto> portfolio) {
        this.identificador = identificador;
        this.informacionPersonal = informacionPersonal;
        this.formacion = formacion;
        this.experiencia = experiencia;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
        this.idiomas = idiomas;
        this.portfolio = portfolio;
    }

    public String getIdentificador() {return identificador;}
    public void setIdentificador(String identificador) { this.identificador = identificador;}

    public Persona getInformacionPersonal() { return informacionPersonal; }
    public void setInformacionPersonal(Persona informacionPersonal) { this.informacionPersonal = informacionPersonal; }

    public Map<String, List<? extends Formacion>> getFormacion() { return formacion; }
    public void setFormacion(Map<String, List<? extends Formacion>> formacion) { this.formacion = formacion; }

    public List<ExperienciaItem> getExperiencia() { return experiencia; }
    public void setExperiencia(List<ExperienciaItem> experiencia) { this.experiencia = experiencia; }

    public List<HardSkill> getHardSkills() { return hardSkills; }
    public void setHardSkills(List<HardSkill> hardSkills) { this.hardSkills = hardSkills; }

    public SoftSkill getSoftSkills() { return softSkills; }
    public void setSoftSkills(SoftSkill softSkills) { this.softSkills = softSkills; }

    public List<Idioma> getIdiomas() { return idiomas; }
    public void setIdiomas(List<Idioma> idiomas) { this.idiomas = idiomas; }

    public List<Proyecto> getPortfolio() { return portfolio; }
    public void setPortfolio(List<Proyecto> portfolio) { this.portfolio = portfolio; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n==================== CV ====================\n");

        sb.append("\n--- INFORMACIÓN PERSONAL ---\n");
        sb.append(informacionPersonal).append("\n");

        sb.append("\n--- FORMACIÓN ---\n");
        formacion.forEach((tipo, lista) -> {
            sb.append("· ").append(tipo).append(":\n");
            lista.forEach(f -> sb.append("    - ").append(f).append("\n"));
        });

        sb.append("\n--- EXPERIENCIA ---\n");
        experiencia.forEach(exp -> sb.append("· ").append(exp).append("\n"));

        sb.append("\n--- HARD SKILLS ---\n");
        hardSkills.forEach(h -> sb.append("· ").append(h).append("\n"));

        sb.append("\n--- SOFT SKILLS ---\n");
        sb.append("· ").append(softSkills).append("\n");

        sb.append("\n--- IDIOMAS ---\n");
        idiomas.forEach(i -> sb.append("· ").append(i).append("\n"));

        sb.append("\n--- PORTFOLIO ---\n");
        portfolio.forEach(p -> sb.append("· ").append(p).append("\n"));

        sb.append("============================================\n");

        return sb.toString();
    }

}
