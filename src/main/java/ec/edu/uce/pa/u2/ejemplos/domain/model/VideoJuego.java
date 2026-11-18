package ec.edu.uce.pa.u2.ejemplos.domain.model;

public class VideoJuego {

private Integer id;
private String nombre;
private String empresaDesarrolladora;
private String genero;
private Double precio;

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
public String getEmpresaDesarrolladora() {
    return empresaDesarrolladora;
}
public void setEmpresaDesarrolladora(String empresaDesarrolladora) {
    this.empresaDesarrolladora = empresaDesarrolladora;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public Double getPrecio() {
    return precio;
}
public void setPrecio(Double precio) {
    this.precio = precio;
}

}
