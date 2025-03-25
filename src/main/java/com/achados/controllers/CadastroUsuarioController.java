package com.achados.controllers;

import java.util.List;

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

import com.achados.entities.CadastroUsuario;
import com.achados.services.CadastroUsuarioService;

@RestController
@RequestMapping(value = "user")
public class CadastroUsuarioController {
   
	@Autowired
	private CadastroUsuarioService cadastroUsuarioService;
	

	@GetMapping
	public ResponseEntity<List<CadastroUsuario>> listarTodos() {
		return ResponseEntity.ok(cadastroUsuarioService.listarTodos());
	}
	
	@PostMapping(value = "/cadastrar")
	public ResponseEntity<CadastroUsuario> salvar(@RequestBody CadastroUsuario usuario) {
		return ResponseEntity.ok(cadastroUsuarioService.salvar(usuario));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CadastroUsuario> atualizar(@PathVariable Long id, @RequestBody CadastroUsuario usuario) {
		return ResponseEntity.ok(cadastroUsuarioService.atualizar(id, usuario));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		cadastroUsuarioService.deletar(id);
		return ResponseEntity.noContent().build();
	}
}
