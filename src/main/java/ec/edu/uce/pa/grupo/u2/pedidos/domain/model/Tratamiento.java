package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

public class Tratamiento {

    private String id;
    private String nombre;
    private String descripcion;
    private double valor;
    private String duracion;
    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getValor() {
        return valor;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    
}
