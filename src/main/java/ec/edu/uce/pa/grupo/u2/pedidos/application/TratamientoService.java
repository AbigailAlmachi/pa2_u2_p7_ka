package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Tratamiento;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.TratamientoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TratamientoService {

    @Inject
    private TratamientoRepository tratamientoRepository;

    @Transactional
    public void guardar(Tratamiento tratamiento) {
        this.tratamientoRepository.create(tratamiento);
    }

    @Transactional
    public Tratamiento buscar(Long id) {
        return this.tratamientoRepository.read(id);
    }

    @Transactional
    public void actualizar(Tratamiento tratamiento) {
        this.tratamientoRepository.update(tratamiento);
    }

    @Transactional
    public void eliminar(Long id) {
        this.tratamientoRepository.delete(id);
    }
}