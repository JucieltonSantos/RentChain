package br.com.smartrent;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.smartrent.repository.ImovelRepository;
import br.com.smartrent.services.UsuarioService;

//http://www.thymeleaf.org/doc/articles/layouts.html
@SpringBootApplication
public class SpringBootWebApplication {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	ImovelRepository imovelService;
	
		
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);	
	}
	

	
	
	@PostConstruct
	public void init() {
		
	}
}