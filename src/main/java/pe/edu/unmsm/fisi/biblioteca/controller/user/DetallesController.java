package pe.edu.unmsm.fisi.biblioteca.controller.user;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.unmsm.fisi.biblioteca.model.Prestamo;


@Controller
@RequestMapping("/siscae")
public class DetallesController {
	private static final String DETALLES_VIEW="content/user/detalles";
	@GetMapping("/detalles_biblioteca")
	public ModelAndView showLoginViewMAV(){
		ModelAndView mav = new ModelAndView(DETALLES_VIEW);
		Prestamo p = new Prestamo();
		List<Prestamo> lista = new ArrayList<Prestamo>();
		lista.add(new Prestamo(1, new Date(), new Time(10,35,0), "ocupada",1,2));
		lista.add(new Prestamo(2, new Date(), new Time(10,39,0), "ocupada",2,2));
		lista.add(new Prestamo(3, new Date(), new Time(10,55,0), "liberable",3,2));
		lista.add(new Prestamo(4, new Date(), new Time(10,59,0), "disponible",4,2));
		lista.add(new Prestamo(5, new Date(), new Time(11,55,0), "disponible",5,2));
		mav.addObject("prestamos", lista);
		return mav;
		
	}
}
