package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Materia;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.MateriaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class MateriaRepositoryImpl implements MateriaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Materia materia) {
        this.entityManager.persist(materia);
    }

    @Override
    public Materia read(Long id) {
        return this.entityManager.find(Materia.class, id);
    }

    @Override
    public void update(Materia materia) {
        this.entityManager.merge(materia);
    }

    @Override
    public void delete(Long id) {
        Materia materia = this.read(id);
        this.entityManager.remove(materia);
    }
}