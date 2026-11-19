package ec.edu.uce.pa.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name = "dispositivos")
public class Dispositivo {

    @Id 
    @SequenceGenerator (name = "seq_dispositivo", sequenceName = "seq_dispositivo", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_dispositivo")
    @Column (name = "dis_id")
    private Integer id;

    @Column (name = "dis_marca")
    private String marca;

    @Column (name = "dis_modelo")
    private String modelo;

    @Column (name = "dis_color")
    private String color;

    @Column (name = "dis_precio")
    private Double precio;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
