package model;

public abstract class Formacion {
    protected String titulo;
    protected String centro;

    public Formacion(String titulo, String centro) {
        this.titulo = titulo;
        this.centro = centro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCentro() {
        return centro;
    }

    @Override
    public abstract String toString();
}
