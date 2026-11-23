package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Autor;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.AutorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AutorService {

    @Inject
    private AutorRepository autorRepository;

    @Transactional
    public void guardar(Autor autor) {
        this.autorRepository.create(autor);
    }

    @Transactional
    public Autor buscar(Long id) {
        return this.autorRepository.read(id);
    }

    @Transactional
    public void actualizar(Autor autor) {
        this.autorRepository.update(autor);
    }

    @Transactional
    public void eliminar(Long id) {
        this.autorRepository.delete(id);
    }
}