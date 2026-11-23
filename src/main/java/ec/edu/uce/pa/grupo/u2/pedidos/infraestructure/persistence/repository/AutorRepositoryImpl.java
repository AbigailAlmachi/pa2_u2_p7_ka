package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Autor;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.AutorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class AutorRepositoryImpl implements AutorRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Autor autor) {
        this.entityManager.persist(autor);
    }

    @Override
    public Autor read(Long id) {
        return this.entityManager.find(Autor.class, id);
    }

    @Override
    public void update(Autor autor) {
        this.entityManager.merge(autor);
    }

    @Override
    public void delete(Long id) {
        Autor autor = this.read(id);
        this.entityManager.remove(autor);
    }
}