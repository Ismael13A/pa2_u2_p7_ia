package ec.edu.uce.pa.u2.pedidos.application;
import ec.edu.uce.pa.u2.pedidos.domain.model.Estudiante;
import ec.edu.uce.pa.u2.pedidos.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class EstudianteService {
    @Inject 
    private EstudianteRepository estudianteRepository;

    public void guardar(Estudiante estudiante) {
        this.estudianteRepository.create(estudiante);
    }

    public Estudiante buscarPorId (Integer id) {
        return this.estudianteRepository.read(id);
    }

    public void actualizar (Estudiante estudiante) {
        this.estudianteRepository.update(estudiante);
    }

    public void eliminar (Integer id) {
        this.estudianteRepository.delete(id);
    }

}
