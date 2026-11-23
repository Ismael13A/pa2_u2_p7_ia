package ec.edu.uce.pa.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.u2.pedidos.domain.model.Estudiante;
import ec.edu.uce.pa.u2.pedidos.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EstudianteRepositoryImpl implements EstudianteRepository {
    
    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    public Estudiante read(Integer id) {
        return this.entityManager.find(Estudiante.class, id);
    }

    @Override
    public void update(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }

    @Override
    public void delete(Integer id) {
        Estudiante estudiante = this.read(id);
        this.entityManager.remove(estudiante);
    }

}
