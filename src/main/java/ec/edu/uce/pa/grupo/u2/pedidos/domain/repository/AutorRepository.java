package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Autor;

public interface AutorRepository {
    void create(Autor autor);
    Autor read(Long id);
    void update(Autor autor);
    void delete(Long id);
}