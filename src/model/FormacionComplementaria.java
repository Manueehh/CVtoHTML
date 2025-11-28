package model;

public class FormacionComplementaria extends Formacion {
    private Integer horas;
    private String descripcion;
    private Integer anoFinal;
    private boolean certificado;

    public FormacionComplementaria(String titulo, String centro, Integer horas, String descripcion, Integer anoFinal,
            boolean certificado) {
        super(titulo, centro);
        this.horas = horas;
        this.descripcion = descripcion;
        this.anoFinal = anoFinal;
        this.certificado = certificado;
    }

    public Integer getHoras() {
        return horas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getAnoFinal() {
        return anoFinal;
    }

    public boolean isCertificado() {
        return certificado;
    }

    @Override
    public String toString() {
        return "FormacionComplementaria [titulo=" + titulo + ", centro=" + centro + ", horas=" + horas
                + ", descripcion=" + descripcion + ", anoFinal=" + anoFinal + ", certificado=" + certificado + "]";
    }
}
