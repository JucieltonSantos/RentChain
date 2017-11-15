package br.com.smartrent.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.smartrent.model.AluguelExecutado;
import br.com.smartrent.model.Segmento;

public interface AluguelExecutadoRepository extends CrudRepository<AluguelExecutado, Long> {

	public Iterable<AluguelExecutado> findBySegmento(Segmento segmento);
}
