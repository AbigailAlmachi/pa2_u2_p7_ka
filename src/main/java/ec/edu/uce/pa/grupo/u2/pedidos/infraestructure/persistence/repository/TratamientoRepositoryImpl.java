package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Tratamiento;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.TratamientoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class TratamientoRepositoryImpl implements TratamientoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Tratamiento tratamiento) {
        this.entityManager.persist(tratamiento);
    }

    @Override
    public Tratamiento read(Long id) {
        return this.entityManager.find(Tratamiento.class, id);
    }

    @Override
    public void update(Tratamiento tratamiento) {
        this.entityManager.merge(tratamiento);
    }

    @Override
    public void delete(Long id) {
        Tratamiento tratamiento = this.read(id);
        this.entityManager.remove(tratamiento);
    }
}