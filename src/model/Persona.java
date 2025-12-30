package model;

import java.util.List;

public class Persona {
    private String nombre;
    private String puesto;
    private String ubicacion;
    private String email;
    private String telefono;
    private String fechaNacimiento;
    private Integer edad;
    private String imagenPerfil;
    private String imagenFondo;
    private List<String> enlaces;

    public Persona(String nombre, String puesto, String ubicacion, String email, String telefono,
            String fechaNacimiento, Integer edad, String imagenPerfil, String imagenFondo, List<String> enlaces) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.ubicacion = ubicacion;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.imagenPerfil = imagenPerfil;
        this.imagenFondo = imagenFondo;
        this.enlaces = enlaces;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(String imagenFondo) {
        this.imagenFondo = imagenFondo;
    }

    public List<String> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<String> enlaces) {
        this.enlaces = enlaces;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", puesto=" + puesto + ", ubicacion=" + ubicacion + ", email=" + email
                + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad
                + ", imagenPerfil=" + imagenPerfil + ", imagenFondo=" + imagenFondo + ", enlaces=" + enlaces + "]";
    }

}
