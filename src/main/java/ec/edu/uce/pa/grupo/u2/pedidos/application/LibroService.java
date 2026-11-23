package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Libro;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.LibroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class LibroService {

    @Inject
    private LibroRepository libroRepository;

    @Transactional
    public void guardar(Libro libro) {
        this.libroRepository.create(libro);
    }

    @Transactional
    public Libro buscar(Long id) {
        return this.libroRepository.read(id);
    }

    @Transactional
    public void actualizar(Libro libro) {
        this.libroRepository.update(libro);
    }

    @Transactional
    public void eliminar(Long id) {
        this.libroRepository.delete(id);
    }
}