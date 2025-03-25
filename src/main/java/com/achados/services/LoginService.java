package com.achados.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.achados.entities.Login;
import com.achados.repositories.LoginRepository;

@Service
public class LoginService {
     
	@Autowired
	private LoginRepository loginRepository;
	
	public Login salvar(Login login) {
		return loginRepository.save(login);
	}
	

	public Login buscarPorEmail(String email) {
		return loginRepository.findByEmail(email);
	}
	
	public Login atualizar(Long id, Login loginAtualizado) {
		if (!loginRepository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Login não encontrado");
		}
		
		loginAtualizado.setIdLogin(id);
		return loginRepository.save(loginAtualizado);
	}
	
	public void deletar(Long id) {
		if (!loginRepository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Login não encontrado");
		}
		loginRepository.deleteById(id);
	}

}
