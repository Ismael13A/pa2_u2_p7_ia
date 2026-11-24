package ec.edu.uce.pa.u2;

import java.time.LocalDateTime;

import ec.edu.uce.pa.u2.pedidos.application.DispositivoService;
import ec.edu.uce.pa.u2.pedidos.application.EquipoService;
import ec.edu.uce.pa.u2.pedidos.application.EstudianteService;
import ec.edu.uce.pa.u2.pedidos.application.JugadorService;
import ec.edu.uce.pa.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.u2.pedidos.application.VideoJuegoService;
import ec.edu.uce.pa.u2.pedidos.domain.model.Dispositivo;
import ec.edu.uce.pa.u2.pedidos.domain.model.Equipo;
import ec.edu.uce.pa.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject 
    private PedidoService pedidoService;
    @Inject 
    private DispositivoService dispositivoService;
    @Inject 
    private EquipoService equipoService;
    @Inject 
    private EstudianteService estudianteService;
    @Inject 
    private JugadorService jugadorService;
    @Inject 
    private VideoJuegoService videoJuegoService;

    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello, Quarkus!");
        Pedido pedido = new Pedido();
        pedido.setProducto("Televisor");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);

        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setMarca("Samsung");
        dispositivo.setColor("Rojo");
        dispositivo.setModelo("A13");
        dispositivo.setPrecio(100.0);
        this.dispositivoService.guardar(dispositivo);

        Equipo equipo = new Equipo();
        equipo.setCiudad("Cayambe");
        equipo.setDueno("Jorge");
        equipo.setNombreEquipo("Firmes FC");
        equipo.setNumeroJugadores(26);


    

        return 0;
    }

}
