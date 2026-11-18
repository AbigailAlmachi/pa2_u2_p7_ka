package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

public class Materia {

    private String id;
    private String nombre;
    private String codigo;
    private String credito;
    private String carrera;

    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getCredito() {
        return credito;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setCredito(String credito) {
        this.credito = credito;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    

}
