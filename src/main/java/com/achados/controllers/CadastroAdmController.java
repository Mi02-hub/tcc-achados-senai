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

import com.achados.entities.CadastroAdm;
import com.achados.services.CadastroAdmService;

@RestController
@RequestMapping(value = "adm")
public class CadastroAdmController {
	
	
	@Autowired 
	CadastroAdmService cadastroAdmService;
	
	@GetMapping
    public List<CadastroAdm> listarTodos() {
        return cadastroAdmService.listarTodos();
    }
	

	 @PostMapping(value = "/adicionar")
	    public ResponseEntity<CadastroAdm> salvar(@RequestBody 	CadastroAdm adm) {
	        return ResponseEntity.ok(cadastroAdmService.salvar(adm));
	    }
	 
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<CadastroAdm> atualizar(@PathVariable Long id, @RequestBody CadastroAdm adm) {
	        return ResponseEntity.ok(cadastroAdmService.atualizar(id, adm));
	    }
	 
	 
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletar(@PathVariable Long id) {
	        cadastroAdmService.deletar(id);
	        return ResponseEntity.noContent().build();
	    }
}
