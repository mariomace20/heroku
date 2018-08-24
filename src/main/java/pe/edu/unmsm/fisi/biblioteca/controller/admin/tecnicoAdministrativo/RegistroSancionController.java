package pe.edu.unmsm.fisi.biblioteca.controller.admin.tecnicoAdministrativo;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jayway.jsonpath.internal.function.numeric.Max;

import java.util.List;

import pe.edu.unmsm.fisi.biblioteca.beans.EstadoRecursoGrupal;
import pe.edu.unmsm.fisi.biblioteca.beans.EstadoRecursoIndividual;
import pe.edu.unmsm.fisi.biblioteca.model.AreaEstudio;
import pe.edu.unmsm.fisi.biblioteca.model.Persona;
import pe.edu.unmsm.fisi.biblioteca.model.Prestamo;
import pe.edu.unmsm.fisi.biblioteca.model.Recurso;
import pe.edu.unmsm.fisi.biblioteca.model.TipoRecurso;

@Controller
@RequestMapping("/siscae")
public class RegistroSancionController {
	
	public static final String INICIO_VIEW = "content/admin/tecnicoAdministrativo/registroSancion";
		

	@GetMapping("/tbiblioteca/registroSancion")
	public ModelAndView inicioBiblioteca(){
		
		ModelAndView mav = new ModelAndView(INICIO_VIEW);
		
		AreaEstudio a = new AreaEstudio(1,"Biblioteca");
		mav.addObject("areaestudio",a);
		mav.addObject("tipoUsuario", "TA");
		
		
		return mav;
		
	}
	
	
	@GetMapping("/tvideoteca/registroSancion")
	public ModelAndView inicioVideoteca(){
		
		ModelAndView mav = new ModelAndView(INICIO_VIEW);
		
		AreaEstudio a = new AreaEstudio(2,"Videoteca");
		mav.addObject("areaestudio",a);
		mav.addObject("tipoUsuario", "TA");
		
		
		return mav;
		
	}
	
	
	
	
	@GetMapping("/taula_grupal/registroSancion")
	public ModelAndView inicioGrupal(){
		
		ModelAndView mav = new ModelAndView(INICIO_VIEW);
		
		AreaEstudio a = new AreaEstudio(3,"Aula Grupal");
		mav.addObject("areaestudio",a);
		mav.addObject("tipoUsuario", "TA");
		
		return mav;
		
	}
	
	
}
