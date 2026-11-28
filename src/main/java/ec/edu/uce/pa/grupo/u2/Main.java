package ec.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("Hello from Quarkus!");
        Pedido pedido = new Pedido();

        pedido.setProducto("Laptop HP");
        pedido.setPrecio(850.50);
        pedido.setFecha(LocalDateTime.now());
        pedido.setNumero("PED-001");

        pedidoService.guardar(pedido);

        /* 
        Optional<Pedido> pedido2 = this.pedidoService.buscarPorId("2");

    
        if (pedido2.isPresent()) {
            System.out.println("Pedido encontrado: " + pedido2.get());
        } else {
            System.out.println("Pedido no encontrado");
        }

        Optional<Pedido> pedidoByNumber =
                this.pedidoService.buscarPorNumero("PED-001");

        if (pedidoByNumber.isPresent()) {
            System.out.println("Pedido encontrado por numero: " + pedidoByNumber.get());
        } else {
            System.out.println("Pedido no encontrado por numero");
        }
            
        
        List<Pedido> lp = this.pedidoService.buscarTodos();

        lp.forEach(System.out::println);*/

         Optional<Pedido> pedidoByNumberNativo =
                this.pedidoService.buscarPorNumeroNativo("PED-001");

        if (pedidoByNumberNativo.isPresent()) {
            System.out.println("Pedido encontrado por numero: " + pedidoByNumberNativo.get());
        } else {
            System.out.println("Pedido no encontrado por numero");
        }

         List<Pedido> lp = this.pedidoService.buscarTodosNativo();

        lp.forEach(System.out::println);

        return 0;
    }
}
