package com.achados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achados.dto.CadastroDTO;
import com.achados.entities.Cadastro;
import com.achados.repositories.CadastroRepository;
import com.achados.services.CadastroService;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {
     
    @Autowired
	private CadastroService service;
    
    @GetMapping
    public ResponseEntity<List<CadastroDTO>> busucar(){
    	return ResponseEntity.ok(service.buscarTodos());
    }
    
    @Autowired 
    private CadastroRepository cadastroRepo;
    
    @PostMapping
    public ResponseEntity<Cadastro> createCadastro (@RequestBody Cadastro cad){
    	Cadastro savedCadastro = cadastroRepo.save(cad);
    	
    	return ResponseEntity.status(201).body(savedCadastro);
    }
    
    
    
    
}
