package aplicaciones.spring.ejemplo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicaciones.spring.ejemplo.models.Tema;
import aplicaciones.spring.ejemplo.repository.TemaRepository;



@Service
public class TemaService {
	@Autowired
	private TemaRepository temaRepository;
	
	public List<Tema> listar(Integer cursos_id) {
		return temaRepository.listar(cursos_id);
	}
	
	public Tema obtener(Integer id) {
		return temaRepository.obtener(id);
	}
}
