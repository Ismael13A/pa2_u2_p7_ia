package ec.edu.uce.pa.u2.pedidos.infraestructure.persistence.repository;


import ec.edu.uce.pa.u2.pedidos.domain.model.VideoJuego;
import ec.edu.uce.pa.u2.pedidos.domain.repository.VideoJuegoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
@ApplicationScoped 
public class VideoJuegoRepositoryImpl implements VideoJuegoRepository {
        @Inject 
    private EntityManager entityManager;

    
    @Override
    public void create(VideoJuego videojuego) {
        this.entityManager.persist(videojuego);
           }

    @Override
    public VideoJuego read(Integer id) {
          return this.entityManager.find(VideoJuego.class, id);
         }

    @Override
    public void update(VideoJuego videojuego) {
          this.entityManager.merge(videojuego);
      }

    @Override
    public void delete(Integer id) {
        VideoJuego videojeugo = this.read(id); 
      this.entityManager.remove(videojeugo);
  
     }

}
