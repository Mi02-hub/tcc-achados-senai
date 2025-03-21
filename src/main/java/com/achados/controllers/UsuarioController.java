package com.achados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achados.dto.UsuarioDTO;
import com.achados.entities.Usuario;
import com.achados.repositories.UsuarioRepository;
import com.achados.services.UsuarioService;

@RestController
@RequestMapping(value = "/user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> buscar() {
		return ResponseEntity.ok(service.buscarTodos());
	}
	
   @Autowired
   private UsuarioRepository userRepo;
   
   @PostMapping
   public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario user){
	   Usuario savedUser = userRepo.save(user);
	   
	   return ResponseEntity.status(201).body(savedUser);
   }
	
}
