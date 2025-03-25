package com.achados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achados.entities.Login;
import com.achados.services.LoginService;

@RestController
@RequestMapping(value = "login")
public class LoginController {
    
	@Autowired
	private LoginService loginService;

	@GetMapping("/email/{email}")
	public ResponseEntity<Login> buscarPorEmail(@PathVariable String email) {
		Login login = loginService.buscarPorEmail(email);
		return ResponseEntity.ok(login);
	}

	@PostMapping(value = "/logar")
	public ResponseEntity<Login> salvar(@RequestBody Login login) {
		return ResponseEntity.ok(loginService.salvar(login));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Login> atualizar(@PathVariable Long id, @RequestBody Login login) {
		return ResponseEntity.ok(loginService.atualizar(id, login));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		loginService.deletar(id);
		return ResponseEntity.noContent().build();
	}
}
