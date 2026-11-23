package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Mascota;

public interface MascotaRepository {
    void create(Mascota mascota);
    Mascota read(Long id);
    void update(Mascota mascota);
    void delete(Long id);
}