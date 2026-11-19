package ec.edu.uce.pa.grupo.u2.pedidos.application;

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

    public void guardar(Pedido pedido){
        this.pedidoRepoitory.create(pedido);
    }

    public Pedido buscarPorId(Integer id){
        return this.pedidoRepoitory.read(id);
    }

    public void actualizar(Pedido pedido){
        this.pedidoRepoitory.update(pedido);
    }

    public void eliminar(Integer id){
        this.pedidoRepoitory.delete(id);
    }

}
