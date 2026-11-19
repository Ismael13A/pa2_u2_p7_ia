package ec.edu.uce.pa.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "videojuegos")
public class VideoJuego {

@Id 
@SequenceGenerator (name = "seq_videojuego", sequenceName = "seq_videojuego", allocationSize = 1)
@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_videojuego")
@Column (name = "vid_id")
private Integer id;

@Column (name = "vid_nombre")
private String nombre;

@Column (name = "vid_empresa_desarrolladora")
private String empresaDesarrolladora;

@Column (name = "vid_genero")
private String genero;

@Column (name = "vid_precio")
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
