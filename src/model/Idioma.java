package model;

public class Idioma {
    private String dialecto;
    private String nivel_idioma;
    private boolean certificado;
    private String bandera;

    public Idioma() {
    }

    public String getDialecto() {
        return dialecto;
    }

    public void setDialecto(String dialecto) {
        this.dialecto = dialecto;
    }

    public String getNivel_idioma() {
        return nivel_idioma;
    }

    public void setNivel_idioma(String nivel_idioma) {
        this.nivel_idioma = nivel_idioma;
    }

    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Idioma [dialecto=" + dialecto + ", nivel_idioma=" + nivel_idioma + ", certificado=" + certificado
                + ", bandera=" + bandera + "]";
    }
}
