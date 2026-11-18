package ec.edu.uce.pa.u2.ejemplos.domain.model;

public class Equipo {

    private Integer id;
    private String nombreEquipo;
    private String ciudad;
    private String dueno;
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
