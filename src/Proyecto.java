import java.util.List;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private String tdesarrollo;
    private List<Tecnologia> tecnologias;
    private String rol;
    private String estado;
    private List<String> enlaces;
    
    public Proyecto(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTdesarrollo() {
        return tdesarrollo;
    }

    public void setTdesarrollo(String tdesarrollo) {
        this.tdesarrollo = tdesarrollo;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<String> enlaces) {
        this.enlaces = enlaces;
    }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", descripcion=" + descripcion + ", tdesarrollo=" + tdesarrollo
                + ", tecnologias=" + tecnologias + ", rol=" + rol + ", estado=" + estado + ", enlaces=" + enlaces + "]";
    }

    
}
