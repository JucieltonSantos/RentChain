package br.com.smartrent.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.smartrent.model.Imovel;

public interface ImovelRepository extends CrudRepository<Imovel, Long> {

}
