package model;

import java.util.List;

public class ExperienciaItem {
    private String empresa;
    private String puesto;
    private String ubicacion;

    private Periodo periodo;
    private String jornada;
    private String descripcion;
    private String responsabilidades;
    private String logros;

    private List<Tecnologia> tecnologias;

    public ExperienciaItem(String empresa, String puesto, String ubicacion, Periodo periodo, String jornada,
            String descripcion, String responsabilidades, String logros, List<Tecnologia> tecnologias) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.ubicacion = ubicacion;
        this.periodo = periodo;
        this.jornada = jornada;
        this.descripcion = descripcion;
        this.responsabilidades = responsabilidades;
        this.logros = logros;
        this.tecnologias = tecnologias;
    }

    public ExperienciaItem() {
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public String getJornada() {
        return jornada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }

    @Override
    public String toString() {
        String tecString = (tecnologias != null) ? tecnologias.toString() : "[]";
        return "ExperienciaItem [empresa=" + empresa + ", puesto=" + puesto + ", ubicacion=" + ubicacion + ", periodo="
                + periodo.toString() + ", jornada=" + jornada + ", descripcion=" + descripcion + ", responsabilidades="
                + responsabilidades + ", logros=" + logros + ", tecnologias=" + tecString + "]";
    }

}
