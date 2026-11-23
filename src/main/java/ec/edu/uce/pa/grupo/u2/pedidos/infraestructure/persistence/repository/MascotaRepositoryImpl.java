package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Mascota;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.MascotaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class MascotaRepositoryImpl implements MascotaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Mascota mascota) {
        this.entityManager.persist(mascota);
    }

    @Override
    public Mascota read(Long id) {
        return this.entityManager.find(Mascota.class, id);
    }

    @Override
    public void update(Mascota mascota) {
        this.entityManager.merge(mascota);
    }

    @Override
    public void delete(Long id) {
        Mascota mascota = this.read(id);
        this.entityManager.remove(mascota);
    }
}