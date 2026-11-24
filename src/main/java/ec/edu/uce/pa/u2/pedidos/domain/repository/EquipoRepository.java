package ec.edu.uce.pa.u2.pedidos.domain.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Equipo;

public interface EquipoRepository {
     //Cread
    public void create (Equipo equipo);
    //Read por id
    public Equipo read (Integer id);
    //Update
    public void update (Equipo equipo);
    //Delete
    public void delete (Integer id);

}
