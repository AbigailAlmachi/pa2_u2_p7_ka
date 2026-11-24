package ec.edu.uce.pa.grupo.u2;

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

        return 0;
    }
}
