package ec.edu.uce.pa.grupo.u2.pedidos.application;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Mascota;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.MascotaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MascotaService {

    @Inject
    private MascotaRepository mascotaRepository;

    @Transactional
    public void guardar(Mascota mascota) {
        this.mascotaRepository.create(mascota);
    }

    @Transactional
    public Mascota buscar(Long id) {
        return this.mascotaRepository.read(id);
    }

    @Transactional
    public void actualizar(Mascota mascota) {
        this.mascotaRepository.update(mascota);
    }

    @Transactional
    public void eliminar(Long id) {
        this.mascotaRepository.delete(id);
    }
}