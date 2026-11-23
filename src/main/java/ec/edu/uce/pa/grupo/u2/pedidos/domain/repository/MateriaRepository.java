package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Materia;

public interface MateriaRepository {
    void create(Materia materia);
    Materia read(Long id);
    void update(Materia materia);
    void delete(Long id);
}