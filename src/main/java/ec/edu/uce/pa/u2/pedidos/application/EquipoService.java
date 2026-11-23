package ec.edu.uce.pa.u2.pedidos.application;


import ec.edu.uce.pa.u2.pedidos.domain.model.Equipo;
import ec.edu.uce.pa.u2.pedidos.domain.repository.EquipoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class EquipoService {

    
    @Inject 
    private EquipoRepository equipoRepository;

    public void guardar(Equipo equipo) {
        this.equipoRepository.create(equipo);
    }

    public Equipo buscarPorId (Integer id) {
        return this.equipoRepository.read(id);
    }

    public void actualizar (Equipo equipo) {
        this.equipoRepository.update(equipo);
    }

    public void eliminar (Integer id) {
        this.equipoRepository.delete(id);
    }

}
