public class HardSkill {
    private Tecnologia lenguaje;
    private String icono;
    private String descripcion;
    private String nivelHabilidad;
    public HardSkill(Tecnologia lenguaje, String icono, String descripcion, String nivelHabilidad) {
        this.lenguaje = lenguaje;
        this.icono = icono;
        this.descripcion = descripcion;
        this.nivelHabilidad = nivelHabilidad;
    }
    public Tecnologia getLenguaje() {
        return lenguaje;
    }
    public void setLenguaje(Tecnologia lenguaje) {
        this.lenguaje = lenguaje;
    }
    public String getIcono() {
        return icono;
    }
    public void setIcono(String icono) {
        this.icono = icono;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNivelHabilidad() {
        return nivelHabilidad;
    }
    public void setNivelHabilidad(String nivelHabilidad) {
        this.nivelHabilidad = nivelHabilidad;
    }
    @Override
    public String toString() {
        return "HardSkill [lenguaje=" + lenguaje.toString() + ", icono=" + icono + ", descripcion=" + descripcion
                + ", nivelHabilidad=" + nivelHabilidad + "]";
    }

    
}
