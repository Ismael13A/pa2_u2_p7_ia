package ec.edu.uce.pa.u2.pedidos.domain.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.VideoJuego;

public interface VideoJuegoRepository {

     //Cread
    public void create (VideoJuego videojuego);
    //Read por id
    public VideoJuego read (Integer id);
    //Update
    public void update (VideoJuego videojuego);
    //Delete
    public void delete (Integer id);

}
