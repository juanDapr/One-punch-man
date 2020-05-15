package controlador;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.internal.compiler.lookup.MostSpecificExceptionMethodBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Repository.HeroesREPO;
import Services.IHeroesService;
import Services.IbatallaService;
import Services.ImonstruoService;
import Services.IpatrocinadorService;
import model.*;
import util.Insertar;


@Controller
public class HomeController {
	@Autowired
	IHeroesService heroe;
	@Autowired
	IpatrocinadorService patron;
	@Autowired
	ImonstruoService monstruo;
	@Autowired
	IbatallaService fight;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "index";
	}
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(Model model) {
		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "index";
	}
	@RequestMapping(value="/Home")
	public String Home() {
		
		return "Home";
	}
	
	//heroes
	@RequestMapping(value="/insertarHeroes")
	public String insertarHeroes() {
		
		return "insertarHeroes";
	}
	@PostMapping(value="/guardar")
	public String guardarDragon(@RequestParam("imagen")  MultipartFile multipart, HttpServletRequest request,
			@ModelAttribute heroes heroes, BindingResult Result, Model model
			){
		String nombreImagen= Insertar.guardarImagen(multipart, request);
		heroes.setImagen(nombreImagen);
		heroe.addHeroe(heroes);
		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "index";
	}
	@RequestMapping(value="/MostrarHeroes",  method = RequestMethod.GET)
	public String MostrarHeroes(Model model) {
		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "MostrarHeroes";
	}
	@RequestMapping(value="/RegistroHeroe")
	public String RegistroHeroe() {
		
		return "RegistroHeroe";
	}
	@RequestMapping(value="/edit/{id}")
	public String editar(@PathVariable("id") int id,Model model) {
		heroes heroes=heroe.getHeroeById(id);
		model.addAttribute("heroes",heroes);
		return "editarHeroe";
	}
	
	@PostMapping(value="/guardar1")
	public String guardar1(Model model, @RequestParam("id") int id,
			@RequestParam("nombre") String nombre,@RequestParam("clase") String clase,@RequestParam("rango") int rango,
			@RequestParam("habilidad") String habilidad,
			@RequestParam("residencia") String residencia,
			@RequestParam("Telefono") int telefono)
	{
		heroes heroes= heroe.getHeroeById(id);
		heroes.setNombre(nombre);
		heroes.setRango(rango);heroes.setResidencia(residencia);heroes.setTelefono(telefono);
		heroe.updateHeroe(heroes);
		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "index";
	}
	@RequestMapping(value="eliminar/{id}")
	public String eliminar(@PathVariable("id") int id,Model model) {
		heroe.deleteHeroe(id);

		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "redirect:/index";
	}
	/*patrocinador
	 * 
	 */
	@RequestMapping(value="/RegistroPatrocinador")
	public String RegistroPatrocinador() {
		
		return "RegistroPatrocinador";
	}
	@PostMapping(value="/guardarpatrocinador")
	public String guardarpatrocinador(@RequestParam("logo")  MultipartFile multipart, HttpServletRequest request,
			@ModelAttribute patrocinador patrocinador, BindingResult Result, Model model
			){
		String nombreImagen= Insertar.guardarImagen(multipart, request);
		patrocinador.setLogo(nombreImagen);
		patron.addpatrocinador(patrocinador);
		List<patrocinador> p= patron.getAllpatrocinador();
		model.addAttribute("p",p);
		return "MostrarPatrocinadores";
	}
	
	@RequestMapping(value="/MostrarPatrocinadores",  method = RequestMethod.GET)
	public String MostrarPatrocinadores(Model model) {
		List<heroes> p= heroe.getAllHeroees();
		model.addAttribute("p",p);
		return "MostrarHeroes";
	}
	
	//monstruos
	@RequestMapping(value="/RegistrarMonstruo")
	public String RegistrarMonstruo() {
		
		return "RegistrarMonstruo";
	}
	@RequestMapping(value="/MostrarMonstruos",  method = RequestMethod.GET)
	public String MostrarMonstruos(Model model) {
		List<monstruo>m= monstruo.getAllmonstruo();
		model.addAttribute("m",m);
		return "MostrarMonstruos";
	}
	@PostMapping(value="/guardarmonstruo")
	public String guardarmonstruo(@RequestParam("imagen")  MultipartFile multipart, HttpServletRequest request,
			@ModelAttribute monstruo mons, BindingResult Result, Model model
			){
		String nombreImagen= Insertar.guardarImagen(multipart, request);
		mons.setImagen(nombreImagen);
		monstruo.addHeroe(mons);
		List<monstruo> m= monstruo.getAllmonstruo();
		model.addAttribute("m",m);
		return "MostrarMonstruos";
	}
	
	//batalla
	@RequestMapping(value="/RegistrarBatalla", method = RequestMethod.GET)
	public String RegistrarBatalla(Model model) {
		List<heroes> lista= heroe.getAllHeroees();
		List<monstruo> m= monstruo.getAllmonstruo();
		//model.addAttribute("lista",lista);
		model.addAttribute("m",m);
		return "RegistrarBatalla";
	}
	
	
/*
	@PostMapping(value="/guardar")
	public String guardarDragon(@ModelAttribute heroes heroes, BindingResult Result, Model model ){
		heroe.addHeroe(heroes);
		List<heroes> lista= heroe.getAllHeroees();
		model.addAttribute("lista",lista);
		return "index";
	}*/

	
	@RequestMapping(value="/volver")
	public String volver() {
		return "redirect:/index";
	} 


}

