package ec.edu.uce.pa.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "jugadores")
public class Jugador {

    @Id 
    @SequenceGenerator (name = "seq_jugador", sequenceName = "seq_jugador", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_jugador")
    @Column (name = "jug_id")
    private Integer id;

    @Column (name = "jug_nombre")
    private String nombre;

    @Column (name = "jug_apellido")
    private String apellido;

    @Column (name = "jug_posicion")
    private String posicion;
    
    @Column (name = "jug_numero_camiseta")
    private Integer numeroCamiseta;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }
    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

}
