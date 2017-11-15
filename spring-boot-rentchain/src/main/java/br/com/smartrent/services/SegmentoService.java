package br.com.smartrent.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smartrent.model.Segmento;
import br.com.smartrent.repository.SegmentoRepository;

@Service
public class SegmentoService {
	
	
	@Autowired
	SegmentoRepository segmentoRepository;


	@PostConstruct
	public void init() {
		Iterable<Segmento> ae = segmentoRepository.findAll();
	}

}
