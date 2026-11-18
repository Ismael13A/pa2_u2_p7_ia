package ec.edu.uce.pa.u2.ejemplos.domain.model;

public class Jugador {

    private Integer id;
    private String nombre;
    private String apellido;
    private String posicion;
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
