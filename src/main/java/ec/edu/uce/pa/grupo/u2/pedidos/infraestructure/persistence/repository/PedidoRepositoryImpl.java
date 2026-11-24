package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Optional<Pedido> read(String id) {
        Pedido pedido = this.entityManager.find(Pedido.class, id);
        return Optional.ofNullable(pedido);
    }

    @Override
    public Optional<Pedido> readByNumber(String numero) {
        TypedQuery<Pedido> query = this.entityManager.createQuery(
            "SELECT p FROM Pedido p WHERE p.numero = :numeroVariable",
            Pedido.class
        );

        query.setParameter("numeroVariable", numero);

        List<Pedido> resultados = query.getResultList();

        if (resultados.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(resultados.get(0));
    }

    @Override
    public List<Pedido> readAll() {
        TypedQuery<Pedido> query = this.entityManager.createQuery(
            "SELECT p FROM Pedido p",
            Pedido.class
        );

        return query.getResultList();
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(String id) {
        Optional<Pedido> pedido = this.read(id);
        pedido.ifPresent(this.entityManager::remove);
    }
}