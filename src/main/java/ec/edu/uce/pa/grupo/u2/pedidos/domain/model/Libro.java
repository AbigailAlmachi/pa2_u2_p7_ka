package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

public class Libro {

    private String id;
    private String titulo;
    private String autor;
    private String editorial;
    private double precio;
    
    public String getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public double getPrecio() {
        return precio;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    
}
