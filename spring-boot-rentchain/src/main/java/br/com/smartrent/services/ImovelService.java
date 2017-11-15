package br.com.smartrent.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smartrent.model.Imovel;
import br.com.smartrent.model.Usuario;
import br.com.smartrent.repository.ImovelRepository;
import br.com.smartrent.repository.UsuarioRepository;

@Service
public class ImovelService {


	@Autowired
	ImovelRepository imovelRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;


	@PostConstruct
	public void init() {
		Imovel i = imovelRepository.findOne(4L);

		if(i == null) {
			
			Usuario u = usuarioRepository.findOne(1L);
			Imovel i1 = new Imovel(u,50L, 500.0f, -23.944296f, -46.328605f);
			u = usuarioRepository.findOne(2L);
			Imovel i2 = new Imovel(u, 10L, 700.0f, -23.945968f, -46.319877f);
			Imovel i3 = new Imovel(u, 10L, 900.0f, -23.956029f, -46.331620f);
			Imovel i4 = new Imovel(u, 10L, 1100.0f, -23.954221f, -46.340292f);
			
			imovelRepository.save(i1);
			imovelRepository.save(i2);
			imovelRepository.save(i3);
			imovelRepository.save(i4);
			 
		
		}
	}
}
