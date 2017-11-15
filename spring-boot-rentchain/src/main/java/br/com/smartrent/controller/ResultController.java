package br.com.smartrent.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.smartrent.services.GoogleMapsService;
import br.com.smartrent.view.PreferencesBean;

//import br.com.smartrent.services.GoogleMapsService;

@Controller
public class ResultController {
	
	@Autowired
	private GoogleMapsService gmaps;
	
	@GetMapping("/result")
	public String result(Map<String, Object> model, HttpServletRequest request) {
		return "/result";			
	}
	
	
	@PostConstruct
	//TODO buscar locais disponiveis de acordo com as preferencias escolhidas
	public void init() {
		
		//gmaps.
	
	}

}
