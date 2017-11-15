package br.com.smartrent.services;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smartrent.model.Usuario;
import br.com.smartrent.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@PostConstruct
	public void init() {
		Usuario u = usuarioRepository.findOne(1L);
		
		if(u == null) {
			
			Usuario u1 = new Usuario("jc@bombardelli.ninja", "JC Bombardelli", "0x12380du1d01u021u2sjsji121dscdd");
			Usuario u2 = new Usuario("elton@astarlabs.com", "Elton Santos", "0x2394fifk49fk239k291i9kd20dk92d");
			Usuario u3 = new Usuario("julia@designer.com", "Julia Rico", "9038iedxk930id1290iws90d19du29d912u2");
			
			
			usuarioRepository.save(u1);
			usuarioRepository.save(u2);
			usuarioRepository.save(u3);
			
		}
	}
}
