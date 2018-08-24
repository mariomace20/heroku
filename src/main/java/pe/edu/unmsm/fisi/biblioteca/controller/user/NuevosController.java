package pe.edu.unmsm.fisi.biblioteca.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/siscae")
public class NuevosController {
	
	private static final String NUEVOS_VIEW="content/user/nuevos";
	
	@GetMapping("/nuevos")
	public ModelAndView showNuevosViewMAV(){
		ModelAndView mav = new ModelAndView(NUEVOS_VIEW);
		return mav;
	}
}
