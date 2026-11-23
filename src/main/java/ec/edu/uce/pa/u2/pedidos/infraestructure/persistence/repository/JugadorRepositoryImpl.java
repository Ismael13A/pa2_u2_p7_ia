package ec.edu.uce.pa.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Jugador;
import ec.edu.uce.pa.u2.pedidos.domain.repository.JugadorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class JugadorRepositoryImpl implements JugadorRepository{
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Jugador jugador) {
         this.entityManager.persist(jugador);
    }

    @Override
    public Jugador read(Integer id) {
         return this.entityManager.find(Jugador.class, id);
   }

    @Override
    public void update(Jugador jugador) {
        this.entityManager.merge(jugador);
    }

    @Override
    public void delete(Integer id) {
          Jugador jugador = this.read(id); 
      this.entityManager.remove(jugador);
    }

    

}
