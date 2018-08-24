package pe.edu.unmsm.fisi.biblioteca.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pe.edu.unmsm.fisi.biblioteca.model.Usuario;


@Controller
@RequestMapping("/siscae")
public class LoginController {
private static final String LOGIN_VIEW="login";
	
	@GetMapping("/login")
	public ModelAndView showLoginViewMAV(@RequestParam(name="error",required=false)String error,
			@RequestParam(name="logout",required=false)String logout){
		ModelAndView mav = new ModelAndView(LOGIN_VIEW);
		mav.addObject("usuario", new Usuario());
		mav.addObject("error",error);
		mav.addObject("logout",logout);
		return mav;
		
	}
	@PostMapping("/login")
	public ModelAndView logear(@ModelAttribute("usuario") Usuario u){
		ModelAndView mav = new ModelAndView(LOGIN_VIEW);
		if(u.getUserName().compareTo("biblioteca")==0 && u.getPass().compareTo("123")==0){
			mav.setViewName("redirect:/siscae/biblioteca/inicio");
		}else{
			if(u.getUserName().compareTo("videoteca")==0 && u.getPass().compareTo("123")==0){
				mav.setViewName("redirect:/siscae/videoteca/inicio");
			}else{
				if(u.getUserName().compareTo("grupal")==0 && u.getPass().compareTo("123")==0){
					mav.setViewName("redirect:/siscae/grupal/inicio/");
				}else{
					if(u.getUserName().compareTo("ebiblioteca")==0 && u.getPass().compareTo("123")==0){
						mav.setViewName("redirect:/siscae/ebiblioteca/inicio/");
					}else{
						if(u.getUserName().compareTo("evideoteca")==0 && u.getPass().compareTo("123")==0){
							mav.setViewName("redirect:/siscae/evideoteca/inicio/");
						}else{

							if(u.getUserName().compareTo("egrupal")==0 && u.getPass().compareTo("123")==0){
								mav.setViewName("redirect:/siscae/eaula_grupal/inicio/");
							}else{

								if(u.getUserName().compareTo("tbiblioteca")==0 && u.getPass().compareTo("123")==0){
									mav.setViewName("redirect:/siscae/tbiblioteca/inicio/");
								}else{
									if(u.getUserName().compareTo("tvideoteca")==0 && u.getPass().compareTo("123")==0){
										mav.setViewName("redirect:/siscae/tvideoteca/inicio/");
									}else{
										if(u.getUserName().compareTo("tgrupal")==0 && u.getPass().compareTo("123")==0){
											mav.setViewName("redirect:/siscae/taula_grupal/inicio/");
										}else{
											mav.setViewName("redirect:/siscae/login?error");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return mav;
	}
	
	@GetMapping("/")
	public String redireccionar(){
		return "redirect:/siscae/login";
		
	}
}
