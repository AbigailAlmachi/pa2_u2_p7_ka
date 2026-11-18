package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

public class Mascota {

    private String id;
    private String nombre;
    private String raza;
    private int edad;
    private String color;

    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public int getEdad() {
        return edad;
    }
    public String getColor() {
        return color;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
