package pe.edu.unmsm.fisi.biblioteca.controller.user;


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
public class InicioController {
	
	public static final String INICIO_VIEW = "content/user/inicio";
		

	@GetMapping("/biblioteca/inicio")
	public ModelAndView inicioBiblioteca(){
		
		ModelAndView mav = new ModelAndView(INICIO_VIEW);
		
		AreaEstudio a = new AreaEstudio(1,"Biblioteca");
		mav.addObject("areaestudio",a);
		
		
		TipoRecurso tp = new TipoRecurso(1,"cubiculo");
		mav.addObject("tipoRercuso",tp);
		
		List<Recurso> listaRecursos = new ArrayList<>();
		listaRecursos.add(new Recurso(1,1,1,1));
		listaRecursos.add(new Recurso(2,1,1,1));
		listaRecursos.add(new Recurso(3,1,1,1));
		listaRecursos.add(new Recurso(4,1,1,1));
		listaRecursos.add(new Recurso(5,1,1,1));
		listaRecursos.add(new Recurso(6,1,1,1));
		listaRecursos.add(new Recurso(7,1,1,1));
		listaRecursos.add(new Recurso(8,1,1,1));
		listaRecursos.add(new Recurso(9,1,1,1));
		listaRecursos.add(new Recurso(10,1,1,1));
		listaRecursos.add(new Recurso(11,1,1,1));
		listaRecursos.add(new Recurso(12,1,1,1));
		
		
		List<Prestamo> listaPrestamo = new ArrayList<>();
		listaPrestamo.add(new Prestamo(1, new Date(), new Time(10,35,26), "Activo",1,null));
		listaPrestamo.add(new Prestamo(2, new Date(), new Time(10,39,41), "Liberable",2,null));
		listaPrestamo.add(new Prestamo(3, new Date(), new Time(10,47,10), "Activo",3,null));
		listaPrestamo.add(new Prestamo(4, new Date(), new Time(10,47,10), "Activo",4,null));
		listaPrestamo.add(new Prestamo(5, new Date(), new Time(10,47,10), "Liberable",5,null));
		listaPrestamo.add(new Prestamo(6, new Date(), new Time(10,47,10), "Terminado",6,null));
		
		
		List<EstadoRecursoIndividual> estadoRecursos=initEstadoRecursosIndividuales(listaRecursos,listaPrestamo);
		mav.addObject("recursos",estadoRecursos);
		
		return mav;
		
	}
	
	
	@GetMapping("/videoteca/inicio")
	public ModelAndView inicioVideoteca(){
		
		ModelAndView mav = new ModelAndView(INICIO_VIEW);
		
		AreaEstudio a = new AreaEstudio(2,"Videoteca");
		mav.addObject("areaestudio",a);
		
		
		TipoRecurso tp = new TipoRecurso(2,"computadora");
		mav.addObject("tipoRercuso",tp);
		
		List<Recurso> listaRecursos = new ArrayList<>();
		listaRecursos.add(new Recurso(1,2,2,2));
		listaRecursos.add(new Recurso(2,2,2,2));
		listaRecursos.add(new Recurso(3,2,2,2));
		listaRecursos.add(new Recurso(4,2,2,2));
		listaRecursos.add(new Recurso(5,2,2,2));
		listaRecursos.add(new Recurso(6,2,2,2));
		listaRecursos.add(new Recurso(7,2,2,2));
		listaRecursos.add(new Recurso(8,2,2,2));
		listaRecursos.add(new Recurso(9,2,2,2));
		listaRecursos.add(new Recurso(10,2,2,2));
		listaRecursos.add(new Recurso(11,2,2,2));
		listaRecursos.add(new Recurso(12,2,2,2));
		listaRecursos.add(new Recurso(13,2,2,2));
		listaRecursos.add(new Recurso(14,2,2,2));
		listaRecursos.add(new Recurso(15,2,2,2));
		listaRecursos.add(new Recurso(16,2,2,2));
		listaRecursos.add(new Recurso(17,2,2,2));
		listaRecursos.add(new Recurso(18,2,2,2));
		listaRecursos.add(new Recurso(19,2,2,2));
		listaRecursos.add(new Recurso(20,2,2,2));
		listaRecursos.add(new Recurso(21,2,2,2));
		listaRecursos.add(new Recurso(22,2,2,2));
		listaRecursos.add(new Recurso(23,2,2,2));
		listaRecursos.add(new Recurso(24,2,2,2));
		
		
		List<Prestamo> listaPrestamo = new ArrayList<>();
		listaPrestamo.add(new Prestamo(7, new Date(), new Time(10,35,26), "Activo",11,null));
		listaPrestamo.add(new Prestamo(8, new Date(), new Time(10,39,41), "Liberable",12,null));
		listaPrestamo.add(new Prestamo(9, new Date(), new Time(10,47,10), "Activo",13,null));
		listaPrestamo.add(new Prestamo(10, new Date(), new Time(10,47,10), "Activo",14,null));
		listaPrestamo.add(new Prestamo(11, new Date(), new Time(10,47,10), "Liberable",15,null));
		listaPrestamo.add(new Prestamo(12, new Date(), new Time(10,47,10), "Terminado",16,null));
		
		
		List<EstadoRecursoIndividual> estadoRecursos=initEstadoRecursosIndividuales(listaRecursos,listaPrestamo);
		mav.addObject("recursos",estadoRecursos);
		
		
		return mav;
		
	}
	
	
	
	
	@GetMapping("/grupal/inicio")
	public ModelAndView inicioGrupal(){
		
		ModelAndView mav = new ModelAndView(INICIO_VIEW);
		
		AreaEstudio a = new AreaEstudio(3,"Aula Grupal");
		mav.addObject("areaestudio",a);
		
		
		TipoRecurso tp = new TipoRecurso(3,"mesa");
		mav.addObject("tipoRercuso",tp);
		
		List<Recurso> listaRecursos = new ArrayList<>();
		listaRecursos.add(new Recurso(34,8,3,3));
		listaRecursos.add(new Recurso(35,8,3,3));
		listaRecursos.add(new Recurso(36,8,3,3));
		listaRecursos.add(new Recurso(37,8,3,3));
		listaRecursos.add(new Recurso(38,8,3,3));
		listaRecursos.add(new Recurso(39,8,3,3));
		listaRecursos.add(new Recurso(40,8,3,3));
		listaRecursos.add(new Recurso(41,8,3,3));
		
	
		
		List<Prestamo> listaPrestamo = new ArrayList<>();
		listaPrestamo.add(new Prestamo(13, new Date(), new Time(10,35,26), "Activo",35,1));
		listaPrestamo.add(new Prestamo(14, new Date(), new Time(10,39,41), "Activo",35,2));
		listaPrestamo.add(new Prestamo(15, new Date(), new Time(10,47,10), "Activo",35,3));
		listaPrestamo.add(new Prestamo(16, new Date(), new Time(10,47,10), "Activo",40,4));
		listaPrestamo.add(new Prestamo(17, new Date(), new Time(10,47,10), "Activo",40,5));
		listaPrestamo.add(new Prestamo(18, new Date(), new Time(10,47,10), "Activo",40,6));
		listaPrestamo.add(new Prestamo(19, new Date(), new Time(10,47,10), "Activo",40,7));
		listaPrestamo.add(new Prestamo(20, new Date(), new Time(10,47,10), "Activo",40,8));
		listaPrestamo.add(new Prestamo(21, new Date(), new Time(10,47,10), "Activo",40,9));
		listaPrestamo.add(new Prestamo(22, new Date(), new Time(10,47,10), "Activo",40,10));
		listaPrestamo.add(new Prestamo(23, new Date(), new Time(10,47,10), "Activo",40,11));
		
		List<EstadoRecursoGrupal> estadoRecursos=initEstadoRecursosGrupales(listaRecursos,listaPrestamo);
		mav.addObject("recursos",estadoRecursos);
		
		
		return mav;
		
	}
	
	
	public List<EstadoRecursoIndividual> initEstadoRecursosIndividuales(List<Recurso> listaRecursos, List<Prestamo> listaPrestamo){
		String estado="";
		List<EstadoRecursoIndividual> estadoRecursos= new ArrayList<>();
		
		for(int i=0;i<listaRecursos.size();i++){
			
			for(int j=0;j<listaPrestamo.size();j++){
				
				if(listaRecursos.get(i).getIdRecurso()==listaPrestamo.get(j).getIdRecurso()){
					
					if(listaPrestamo.get(j).getEstadoPrestamo().equals("Activo")){
						estado="ocupado";
					}else if(listaPrestamo.get(j).getEstadoPrestamo().equals("Liberable")){
						estado="liberable";
					}else{
						estado="disponible";
					}
					break;
				}else{
					estado="disponible";
				}
			}
			estadoRecursos.add(new EstadoRecursoIndividual(listaRecursos.get(i),estado));
		}
		return estadoRecursos;
	}
	
	public List<EstadoRecursoGrupal> initEstadoRecursosGrupales(List<Recurso> listaRecursos, List<Prestamo> listaPrestamo){
		
		String estado="";
		Integer capacidadOcupada=0;
		List<EstadoRecursoGrupal> estadoRecursos= new ArrayList<>();
		
		for(int i=0;i<listaRecursos.size();i++){
			
			for(int j=0;j<listaPrestamo.size();j++){
				
				if(listaRecursos.get(i).getIdRecurso()==listaPrestamo.get(j).getIdRecurso()){
					
					capacidadOcupada++;
				}
				
			}
			
			int posicion = buscarPrestamoRecurso(listaRecursos.get(i).getIdRecurso(),listaPrestamo);
			
			if(capacidadOcupada==listaRecursos.get(i).getMaxCapacidad() && !listaPrestamo.get(posicion).getEstadoPrestamo().equals("Liberable")){
				estado="ocupado";
			}else if(capacidadOcupada<listaRecursos.get(i).getMaxCapacidad()){
				estado="disponible";
			}else if(listaPrestamo.get(posicion).getEstadoPrestamo().equals("Liberable")){
				estado="liberable";
			}
			estadoRecursos.add(new EstadoRecursoGrupal(listaRecursos.get(i),estado,capacidadOcupada));
			capacidadOcupada=0;
		}
	
		return estadoRecursos;
	}
	
	public int buscarPrestamoRecurso(Integer idRecurso,List<Prestamo> listaPrestamo){
		int pos=-1;
		for(int i=0;i<listaPrestamo.size();i++){
			if(idRecurso==listaPrestamo.get(i).getIdRecurso()){
				pos=i;
			}
		}
		return pos;
	}
}
