package br.com.smartrent.services;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smartrent.model.AluguelExecutado;
import br.com.smartrent.model.Imovel;
import br.com.smartrent.model.Segmento;
import br.com.smartrent.model.Usuario;
import br.com.smartrent.repository.AluguelExecutadoRepository;
import br.com.smartrent.repository.ImovelRepository;
import br.com.smartrent.repository.SegmentoRepository;
import br.com.smartrent.repository.UsuarioRepository;

@Service
public class AluguelExecutadoService {


	@Autowired
	AluguelExecutadoRepository aluguelExecutadoRepository;

	@Autowired
	SegmentoRepository segmentoRepository;

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ImovelRepository imovelRepository;


	@PostConstruct
	public void init() {
		AluguelExecutado ae = aluguelExecutadoRepository.findOne(1L);

		if(ae == null) {

			List<Usuario> lu = (List<Usuario>) usuarioRepository.findAll() ;
			List<Segmento> ls = (List<Segmento>) segmentoRepository.findAll();
			List<Imovel> li = (List<Imovel>) imovelRepository.findAll();
			
 
			AluguelExecutado ae1 = new AluguelExecutado(
					"8eujd01sj812jsisjiodasr4rp4lvve", lu.get(0), lu.get(1),  li.get(1), ls.get(1), new Date());
			
			
			aluguelExecutadoRepository.save(ae1);
		}

	}


}
