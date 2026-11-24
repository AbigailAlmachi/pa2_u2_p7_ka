package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    public void create(Pedido pedido);

    public Optional<Pedido> read(String id);

    public Optional<Pedido> readByNumber(String numero);

    public List<Pedido> readAll();

    public void update(Pedido pedido);

    public void delete(String id);
}
