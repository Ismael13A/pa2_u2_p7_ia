package ec.edu.uce.pa.u2.pedidos.domain.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Dispositivo;

public interface DispositivoRepository {
    
    //Cread
    public void create (Dispositivo dispositivo);
    //Read por id
    public Dispositivo read (Integer id);
    //Update
    public void update (Dispositivo dispositivo);
    //Delete
    public void delete (Integer id);



}
