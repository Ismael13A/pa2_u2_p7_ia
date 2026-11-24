package ec.edu.uce.pa.u2.pedidos.domain.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Jugador;

public interface JugadorRepository {
    //Cread
    public void create (Jugador jugador);
    //Read por id
    public Jugador read (Integer id);
    //Update
    public void update (Jugador jugador);
    //Delete
    public void delete (Integer id);

}
