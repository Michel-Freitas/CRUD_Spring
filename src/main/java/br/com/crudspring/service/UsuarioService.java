package br.com.crudspring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crudspring.model.Usuario;
import br.com.crudspring.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository userRepos;
	
	public Usuario cadastroUser(String nome, String login, String senha) {
		
		Usuario user = new Usuario();
		user.setNome(nome);
		user.setUsuario(login);
		user.setSenha(senha);
		
		userRepos.save(user);
		
		return user;
	}
	
	public List<Usuario> getListaUsuario(){
		return userRepos.findAll();
	}
	
	public Usuario getUser(Integer codUser){
		return userRepos.findById(codUser).get();
	}
	
	public Usuario atualizarUser(Integer id, String nome, String usuario, String senha) {
		
		Usuario userUpdate = new Usuario();
		userUpdate.setCodUser(id);
		userUpdate.setNome(nome);
		userUpdate.setSenha(senha);
		userUpdate.setUsuario(usuario);
		userRepos.save(userUpdate);
		
		return userUpdate;
	}
}
