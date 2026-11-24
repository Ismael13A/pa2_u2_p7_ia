package ec.edu.uce.pa.u2.pedidos.domain.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Estudiante;

public interface EstudianteRepository {
    //Cread
    public void create (Estudiante estudiante);
    //Read por id
    public Estudiante read (Integer id);
    //Update
    public void update (Estudiante estudiante);
    //Delete
    public void delete (Integer id);

}
