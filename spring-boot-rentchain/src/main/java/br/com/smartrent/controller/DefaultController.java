package br.com.smartrent.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {


	
	@GetMapping("/")
	public String home1() {
		return "/home";
	}

	
	
	
	@GetMapping("/home")
	public String home() {
		return "/home";
	}

	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}




	@PostConstruct
	public void init() {
	}

}
