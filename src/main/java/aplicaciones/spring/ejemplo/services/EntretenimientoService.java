package aplicaciones.spring.ejemplo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicaciones.spring.ejemplo.models.Entretenimiento;
import aplicaciones.spring.ejemplo.repository.EntretenimientoRepository;


@Service
public class EntretenimientoService {
	
	@Autowired
	private EntretenimientoRepository entretenimientoRepository;
	
	public List<Entretenimiento> listar() {
		return  entretenimientoRepository.listar();
	}
}
