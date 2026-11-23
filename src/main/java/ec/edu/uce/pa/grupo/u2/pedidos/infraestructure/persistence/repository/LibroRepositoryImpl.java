package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Libro;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.LibroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class LibroRepositoryImpl implements LibroRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Libro libro) {
        this.entityManager.persist(libro);
    }

    @Override
    public Libro read(Long id) {
        return this.entityManager.find(Libro.class, id);
    }

    @Override
    public void update(Libro libro) {
        this.entityManager.merge(libro);
    }

    @Override
    public void delete(Long id) {
        Libro libro = this.read(id);
        this.entityManager.remove(libro);
    }
}