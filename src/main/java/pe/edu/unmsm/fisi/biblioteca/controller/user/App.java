package pe.edu.unmsm.fisi.biblioteca.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class App {
	
	@GetMapping("/")
	public String redireccionar(){
		return "redirect:/siscae/login";
		
	}
}
