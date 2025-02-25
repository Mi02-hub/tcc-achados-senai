package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.UsuarioDTO;
import com.achados.entities.Usuario;
import com.achados.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	

	public List<UsuarioDTO> buscarTodos(){
		List<Usuario> list = repo.findAll();
		return list.stream().map(UsuarioDTO::new).toList();

	}

	public UsuarioDTO criar(UsuarioDTO dto) {
	    Usuario Usuario = new Usuario();
	    Usuario.setNome(dto.getNome());
	    Usuario.setEmail(dto.getEmail());
	    Usuario.setSenha(dto.getSenha());
	    Usuario.setSobrenome(dto.getSobrenome());
	    Usuario = repo.save(Usuario);
	    
	    return new UsuarioDTO(Usuario); 
	}

	public UsuarioDTO atualizar(Long id, UsuarioDTO dto) { 
	    Optional<Usuario> Usuario = repo.findById(id); 
	    if (Usuario.isEmpty()) {
	        throw new RuntimeException("Usuário não encontrado");
	    }
     
	    Usuario usuario = Usuario.get();
	    usuario.setNome(dto.getNome());
	    usuario.setEmail(dto.getEmail());
	    usuario.setSenha(dto.getSenha());
	    usuario.setSobrenome(dto.getSobrenome());
	    usuario = repo.save(usuario);

	    return new UsuarioDTO(usuario); 
	}

	public void deletar(Long id) {
	    Optional<Usuario> usuario = repo.findById(id); 
	    if (usuario.isEmpty()) {
	        throw new RuntimeException("Usuário não encontrado");
	    }
	    repo.delete(usuario.get());
	}

	
}
