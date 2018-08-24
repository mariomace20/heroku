package pe.edu.unmsm.fisi.biblioteca.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/siscae")
public class RegistrarFinPrestamoController {
	
	private static final String REGISTRO_FIN_PRESTAMO_VIEW="content/user/salida";
	
	@GetMapping("/registroFinPrestamo_biblioteca")
	public ModelAndView showRegistroFinPrestamoViewMAV(){
		ModelAndView mav = new ModelAndView(REGISTRO_FIN_PRESTAMO_VIEW);
		return mav;
		
	}
}
