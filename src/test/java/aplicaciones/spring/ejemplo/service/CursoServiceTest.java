package aplicaciones.spring.ejemplo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import aplicaciones.spring.ejemplo.models.Curso;
import aplicaciones.spring.ejemplo.services.CursoService;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CursoServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(CursoServiceTest.class);

	@Autowired
	private CursoService cursoService;

	/**
	 * @throws Exception 
	 * 
	 */
	
	@Test
	public void testConsulta2(){

		
		String nom = "Matemática";
		int ID = 1;
		List<Curso> cursos=null;
		

		try {
			cursos = cursoService.consulta2(nom);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		logger.info("" + cursos);
		
		assertEquals(ID, cursos.size());

	}

	
	
	
		

	
}
