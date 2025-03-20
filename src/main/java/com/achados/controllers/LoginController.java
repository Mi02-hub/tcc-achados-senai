package com.achados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achados.dto.LoginDTO;
import com.achados.entities.Login;
import com.achados.repositories.LoginRepository;
import com.achados.services.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping
	public ResponseEntity<List<LoginDTO>> buscar() {
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@Autowired
	private LoginRepository loginRepo;
	
	@PostMapping
	public ResponseEntity<Login> createLogin (@RequestBody Login login){ 
		Login savedLogin = loginRepo.save(login);
		
		return ResponseEntity.status(201).body(savedLogin);
	}

}
