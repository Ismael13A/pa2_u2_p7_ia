package ec.edu.uce.pa.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //Que esta clase es adminsitrada por Jakarta Persistence API
@Table (name="pedidos")//nombre de la tabla en la base de datos
public class Pedido {
    
    @Id
    @SequenceGenerator (name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1) 
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "pedido_seq")//para generar el id de manera automatica
    @Column (name ="pedd_id")//nombre de la columna en la base de datos
    private Integer id;

    @Column (name ="pedd_producto")//nombre de la columna en la base de datos
    private String producto;

    @Column (name ="pedd_precio")//nombre de la columna en la base de datos
    private Double precio;

    @Column (name ="pedd_fecha")//nombre de la columna en la base de datos
    private LocalDateTime fecha;
    @Column (name ="pedd_numero")
    private String numero;
    
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", producto=" + producto + ", precio=" + precio + ", fecha=" + fecha + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

     public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
     public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

}
