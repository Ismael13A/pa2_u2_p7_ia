package ec.edu.uce.pa.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "equipos")
public class Equipo {

    @Id 
    @SequenceGenerator (name = "seq_equipo", sequenceName = "seq_equipo", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_equipo")
    @Column (name = "equ_id")
    private Integer id;

    @Column (name = "equ_nombre")
    private String nombreEquipo;

    @Column (name = "equ_ciudad")
    private String ciudad;

    @Column (name = "equ_dueno")
    private String dueno;
    
    @Column (name = "equ_numero_jugadores")
    private Integer numeroJugadores;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDueno() {
        return dueno;
    }
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    public Integer getNumeroJugadores() {
        return numeroJugadores;
    }
    public void setNumeroJugadores(Integer numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
    

}
