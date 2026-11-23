package ec.edu.uce.pa.u2.pedidos.application;

import ec.edu.uce.pa.u2.pedidos.domain.model.Dispositivo;
import ec.edu.uce.pa.u2.pedidos.domain.repository.DispositivoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class DispositivoService {

    @Inject 
    private DispositivoRepository dispositivoRepository;

    public void guardar(Dispositivo dispositivo) {
        this.dispositivoRepository.create(dispositivo);
    }

    public Dispositivo buscarPorId (Integer id) {
        return this.dispositivoRepository.read(id);
    }

    public void actualizar (Dispositivo dispositivo) {
        this.dispositivoRepository.update(dispositivo);
    }

    public void eliminar (Integer id) {
        this.dispositivoRepository.delete(id);
    }


}
