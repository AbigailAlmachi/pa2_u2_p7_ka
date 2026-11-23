package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Materia;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.MateriaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MateriaService {

    @Inject
    private MateriaRepository materiaRepository;

    @Transactional
    public void guardar(Materia materia) {
        this.materiaRepository.create(materia);
    }

    @Transactional
    public Materia buscar(Long id) {
        return this.materiaRepository.read(id);
    }

    @Transactional
    public void actualizar(Materia materia) {
        this.materiaRepository.update(materia);
    }

    @Transactional
    public void eliminar(Long id) {
        this.materiaRepository.delete(id);
    }
}