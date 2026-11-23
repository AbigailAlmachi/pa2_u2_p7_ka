package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Libro;

public interface LibroRepository {
    void create(Libro libro);
    Libro read(Long id);
    void update(Libro libro);
    void delete(Long id);
}