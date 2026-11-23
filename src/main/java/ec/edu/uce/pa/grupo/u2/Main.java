package ec.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;

import ec.edu.uce.pa.grupo.u2.pedidos.application.AutorService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.LibroService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.MascotaService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.MateriaService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.TratamientoService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Autor;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Libro;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Mascota;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Materia;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Tratamiento;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Inject
    private AutorService autorService;

    @Inject
    private LibroService libroService;

    @Inject
    private MascotaService mascotaService;

    @Inject
    private MateriaService materiaService;

    @Inject
    private TratamientoService tratamientoService;

    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello from Quarkus!");

        // Pedido
        Pedido pedido = new Pedido();
        pedido.setProducto("Laptop Lenovo IdeaPad");
        pedido.setPrecio(750.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);
        System.out.println("Pedido guardado");

        // Autor
        Autor autor = new Autor();
        autor.setNombre("Jorge Icaza");
        autor.setNacionalidad("Ecuatoriana");
        autor.setFechaNacimiento("1906-07-10");
        autor.setFechaFallecimiento("1978-05-26");
        this.autorService.guardar(autor);
        System.out.println("Autor guardado");

        // Libro
        Libro libro = new Libro();
        libro.setTitulo("Huasipungo");
        libro.setAutor("Jorge Icaza");
        libro.setEditorial("Editorial Sudamericana");
        libro.setPrecio(18.9);
        this.libroService.guardar(libro);
        System.out.println("Libro guardado");

        // Mascota
        Mascota mascota = new Mascota();
        mascota.setNombre("Luna");
        mascota.setRaza("Siames");
        mascota.setColor("Crema");
        mascota.setEdad(2);
        this.mascotaService.guardar(mascota);
        System.out.println("Mascota guardada");

        // Materia
        Materia materia = new Materia();
        materia.setNombre("Bases de Datos");
        materia.setCodigo("BD1");
        materia.setCarrera("Ingenieria en Sistemas");
        materia.setCredito("5");
        this.materiaService.guardar(materia);
        System.out.println("Materia guardada");

        // Tratamiento
        Tratamiento tratamiento = new Tratamiento();
        tratamiento.setNombre("Fisioterapia lumbar");
        tratamiento.setDescripcion("Sesion de rehabilitacion para la zona lumbar");
        tratamiento.setDuracion("60 minutos");
        tratamiento.setValor(35.0);
        this.tratamientoService.guardar(tratamiento);
        System.out.println("Tratamiento guardado");

        return 0;
    }
}