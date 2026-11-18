package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;
    private String fechaFallecimiento;

    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getFechaFallecimiento() {
        return fechaFallecimiento;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaFallecimiento(String fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }


    
}
