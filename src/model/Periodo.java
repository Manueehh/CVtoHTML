package model;

public class Periodo {
    private String inicio;
    private String fin;

    public Periodo(String inicio, String fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Periodo() {
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    @Override
    public String toString() {
        return "Periodo [" + inicio + "->" + fin + "]";
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

}
