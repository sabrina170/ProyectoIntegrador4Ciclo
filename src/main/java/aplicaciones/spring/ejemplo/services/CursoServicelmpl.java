package aplicaciones.spring.ejemplo.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import aplicaciones.spring.ejemplo.models.Curso;
import aplicaciones.spring.ejemplo.repository.CursoRepository;

@Service
public class CursoServicelmpl extends CursoService{


	private static final Logger logger = LoggerFactory.getLogger(CursoServicelmpl.class);

	@Autowired
	CursoRepository cursoRepository;


	
	/*
	 * Busqueda por nombre
	 */
	
	@Override
	public List<Curso> consulta2(String nom) {


		List<Curso> cursos = cursoRepository.consulta2(nom);

		cursos.stream().forEach(curso -> logger.info("" + curso));

		return cursos;
	}

	

	

}
