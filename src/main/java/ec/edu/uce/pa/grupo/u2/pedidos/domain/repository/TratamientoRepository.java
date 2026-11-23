package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Tratamiento;

public interface TratamientoRepository {
    void create(Tratamiento tratamiento);
    Tratamiento read(Long id);
    void update(Tratamiento tratamiento);
    void delete(Long id);
}