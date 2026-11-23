package ec.edu.uce.pa.u2;

import java.time.LocalDateTime;

import ec.edu.uce.pa.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.u2.pedidos.domain.model.Pedido;
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
        System.out.println("Hello, Quarkus!");

        //CREATE (insert)
        
        Pedido pedido = new Pedido();
        pedido.setProducto("Televisor");
        pedido.setPrecio(100.0);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);
        
       //READ (buscar)
       Pedido pedido1 = this.pedidoService.buscarPorId(1);
       System.out.println("Pedido encontrado: " + pedido1);

       pedido.setPrecio(200.0);
       this.pedidoService.actualizar(pedido1);

       Pedido pedido2 = this.pedidoService.buscarPorId(1);
        System.out.println("Pedido Actualizado: " + pedido2);
        return 0;
    }

}
