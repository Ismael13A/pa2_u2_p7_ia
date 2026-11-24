package ec.edu.uce.pa.u2.pedidos.infraestructure.persistence.repository;
import ec.edu.uce.pa.u2.pedidos.domain.model.Dispositivo;
import ec.edu.uce.pa.u2.pedidos.domain.repository.DispositivoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class DispositivoRepositoryImpl implements DispositivoRepository {
    
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Dispositivo dispositivo) {
         this.entityManager.persist(dispositivo);
         }

    @Override
    public Dispositivo read(Integer id) {
          return this.entityManager.find(Dispositivo.class, id);
       }

    @Override
    public void update(Dispositivo dispositivo) {
          this.entityManager.merge(dispositivo);
      }

    @Override
    public void delete(Integer id) {
        Dispositivo dispositivo = this.read(id);
        this.entityManager.remove(dispositivo);
         
       }

}
