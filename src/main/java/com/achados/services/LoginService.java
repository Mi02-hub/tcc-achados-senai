package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.LoginDTO;
import com.achados.entities.Login;
import com.achados.repositories.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public List<LoginDTO> buscarTodos() {
        List<Login> list = repo.findAll();
        return list.stream().map(LoginDTO::new).toList(); 
    }

    public LoginDTO criar(LoginDTO dto) {
      
        Login login = new Login();
        login.setEmail(dto.getEmail());
        login.setSenha(dto.getSenha()); 
        login = repo.save(login);
    
        return new LoginDTO(login);
    }
    public LoginDTO atualizar(long id, LoginDTO dto) {
    	Optional<LoginDTO> login = repo.findById(id);
    	if (LoginDTO.isEmpty()) {
    		throw new RuntimeException("Usuário ")
    		
    	}
    }
}
