import java.util.List;

public class Persona {
    private String nombre;
    private String puesto;
    private String ubicacion;
    private String email;
    private String telefono;

    private String fecha_nacimiento;
    private Integer edad;

    private String imagenPerfil;
    private String imagenFondo;
    
    private List<String> enlaces;
    public Persona(String nombre, String puesto, String ubicacion, String email, String telefono,
            String fecha_nacimiento, Integer edad, String imagenPerfil, String imagenFondo, List<String> enlaces) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.ubicacion = ubicacion;
        this.email = email;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.imagenPerfil = imagenPerfil;
        this.imagenFondo = imagenFondo;
        this.enlaces = enlaces;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public Integer getEdad() {
        return edad;
    }
    public String getImagenPerfil() {
        return imagenPerfil;
    }
    public String getImagenFondo() {
        return imagenFondo;
    }
    public List<String> getEnlaces() {
        return enlaces;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", puesto=" + puesto + ", ubicacion=" + ubicacion + ", email=" + email
                + ", telefono=" + telefono + ", fecha_nacimiento=" + fecha_nacimiento + ", edad=" + edad
                + ", imagenPerfil=" + imagenPerfil + ", imagenFondo=" + imagenFondo + ", enlaces" + enlaces + "]";
    }
}
