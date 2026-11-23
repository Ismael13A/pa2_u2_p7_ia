package ec.edu.uce.pa.u2.pedidos.application;

import ec.edu.uce.pa.u2.pedidos.domain.model.Jugador;

import ec.edu.uce.pa.u2.pedidos.domain.repository.JugadorRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class JugadorService {

    @Inject 
    private JugadorRepository jugadorRepository;

    public void guardar(Jugador jugador) {
        this.jugadorRepository.create(jugador);
    }

    public Jugador buscarPorId (Integer id) {
        return this.jugadorRepository.read(id);
    }

    public void actualizar (Jugador jugador) {
        this.jugadorRepository.update(jugador);
    }

    public void eliminar (Integer id) {
        this.jugadorRepository.delete(id);
    }

}
