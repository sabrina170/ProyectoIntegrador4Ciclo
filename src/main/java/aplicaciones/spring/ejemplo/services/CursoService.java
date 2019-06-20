package aplicaciones.spring.ejemplo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicaciones.spring.ejemplo.models.Curso;
import aplicaciones.spring.ejemplo.repository.CursoRepository;




@Service
public class CursoService {


	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> listar() {
		return cursoRepository.listar();
	}


}
