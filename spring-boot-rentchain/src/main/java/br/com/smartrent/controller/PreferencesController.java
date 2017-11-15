package br.com.smartrent.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.smartrent.model.Segmento;
import br.com.smartrent.repository.SegmentoRepository;
import br.com.smartrent.view.PreferencesBean;

@Controller
@SessionAttributes({"preferences"})
public class PreferencesController {

	private String message = "olar";
	
	private Segmento segmentoSelecionado;
	private List<Segmento> listaSegmentos = new ArrayList<Segmento>();
	
	@Autowired
	SegmentoRepository segmentoRepository;
	
	

	@GetMapping("/search")
	public String search(Map<String, Object> model, HttpServletRequest request) {
		
		HttpSession hs=request.getSession();
		PreferencesBean pb =  (PreferencesBean) hs.getAttribute("preferences");
		
		model.put("segmentoSelecionado", segmentoSelecionado);


		if(pb != null) {
			model.put("message", pb.getTexto());
		}
		else {
			model.put("message", this.message);
		}

		
		listaSegmentos = (List<Segmento>) segmentoRepository.findAll();		
		model.put("segmentos", listaSegmentos);

		return "/search";
	}


	@PostMapping("/search")
	public String setPreferences(@ModelAttribute("preferencias") PreferencesBean bean, 
			@ModelAttribute("segmentoSelecionado") Segmento segmento, HttpServletRequest request ) {
		
			
		bean.setSegmentoEscolhido(segmentoRepository.findOne(5L));	
		request.getSession().setAttribute("preferences", bean);


		return "redirect:result";
	}


	@PostConstruct
	public void init() {
		message = "controller";	
		segmentoSelecionado = new Segmento();
		
	}
}
