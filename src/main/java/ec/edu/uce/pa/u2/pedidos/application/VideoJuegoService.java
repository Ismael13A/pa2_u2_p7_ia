package ec.edu.uce.pa.u2.pedidos.application;


import ec.edu.uce.pa.u2.pedidos.domain.model.VideoJuego;

import ec.edu.uce.pa.u2.pedidos.domain.repository.VideoJuegoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class VideoJuegoService {
    
    @Inject 
    private VideoJuegoRepository videoJuegoRepository;

    public void guardar(VideoJuego videoJuego) {
        this.videoJuegoRepository.create(videoJuego);
    }

    public VideoJuego buscarPorId (Integer id) {
        return this.videoJuegoRepository.read(id);
    }

    public void actualizar (VideoJuego videoJuego) {
        this.videoJuegoRepository.update(videoJuego);
    }

    public void eliminar (Integer id) {
        this.videoJuegoRepository.delete(id);
    }

}
