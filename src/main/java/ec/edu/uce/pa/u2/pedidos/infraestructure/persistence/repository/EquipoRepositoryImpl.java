package ec.edu.uce.pa.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Equipo;
import ec.edu.uce.pa.u2.pedidos.domain.repository.EquipoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EquipoRepositoryImpl implements EquipoRepository {
     @Inject 
    private EntityManager entityManager;

     @Override
     public void create(Equipo equipo) {
        this.entityManager.persist(equipo);
     }

     @Override
     public Equipo read(Integer id) {
        return this.entityManager.find(Equipo.class, id);
     }

     @Override
     public void update(Equipo equipo) {
        this.entityManager.merge(equipo);
     }

     @Override
     public void delete(Integer id) {
        Equipo equipo = this.read(id);
        this.entityManager.remove(equipo);
     }

}
