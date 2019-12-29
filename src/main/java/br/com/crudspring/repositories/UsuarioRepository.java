package br.com.crudspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crudspring.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByCodUser(Integer codUser);

}
