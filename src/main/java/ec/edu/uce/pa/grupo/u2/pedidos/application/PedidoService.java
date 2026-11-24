package ec.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PedidoService {

    @Inject
    private PedidoRepository pedidoRepoitory;

    public void guardar(Pedido pedido) {
        this.pedidoRepoitory.create(pedido);
    }

    public Optional<Pedido> buscarPorId(String id) {
        return this.pedidoRepoitory.read(id);
    }

    public Optional<Pedido> buscarPorNumero(String numero) {
        return this.pedidoRepoitory.readByNumber(numero);
    }

    public List<Pedido> buscarTodos() {
        return this.pedidoRepoitory.readAll();
    }

    public void actualizar(Pedido pedido) {
        this.pedidoRepoitory.update(pedido);
    }

    public void eliminar(String id) {
        this.pedidoRepoitory.delete(id);
    }
}
