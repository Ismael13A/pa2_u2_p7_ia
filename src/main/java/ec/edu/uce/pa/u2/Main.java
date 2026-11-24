package ec.edu.uce.pa.u2;

import java.time.LocalDateTime;
import java.util.Optional;

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
        pedido.setProducto("producto 2");
        pedido.setPrecio(500.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);
 
        //READ (find)
       // Pedido pedido2 = this.pedidoService.buscarPorId(2);
        
        //UPDATE (update)
        System.out.println("Valor anterior: " + pedido);
        pedido.setPrecio(300.00);
        this.pedidoService.actualizar(pedido);
       
        System.out.println("Pedido actualizado: " + this.pedidoService.buscarPorId(2));
 
        //DELETE (delete)
        this.pedidoService.eliminar(2);

        Optional<Pedido> pedido2 = this.pedidoService.buscarPorId(2);
        if(pedido2.isPresent()) {
            System.out.println("Pedido encontrado: " + pedido2.get());
        } else {
            System.out.println("Pedido no encontrado");
        }

        //READBYNUMBER

        pedido.setNumero("PED-0001");
         this.pedidoService.actualizar(pedido);

        Optional <Pedido> pedidoByNumer=this.pedidoService.buscarPorNumero("PED-0001");
        if(pedidoByNumer.isPresent()){
            System.out.println("Pedido encotnrado por numero:"+pedidoByNumer.get());

        }else{
               System.out.println("Pedido no encontrado");

        }

        return 0;
 
    }

}
