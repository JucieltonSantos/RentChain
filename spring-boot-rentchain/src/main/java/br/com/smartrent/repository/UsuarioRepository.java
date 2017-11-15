package br.com.smartrent.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.smartrent.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
