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

import com.achados.dto.ItensDTO;
import com.achados.entities.Cadastro;
import com.achados.repositories.CadastroRepository;
import com.achados.services.ItensService;

@RestController
@RequestMapping(value = "/item")
public class ItensController {
	
	@Autowired 
    private ItensService service;
	
	@GetMapping
    public ResponseEntity<List<ItensDTO>> buscar() {
        return ResponseEntity.ok(service.buscarTodos());
	}
       
	@Autowired
    private CadastroRepository cadastroRepository;
	
	
	   @PostMapping("/criar")
	    public ResponseEntity<Cadastro> cadastro(@RequestBody Cadastro cadastro) {
	      
	        Cadastro savedCadastro = cadastroRepository.save(cadastro); 

	        return ResponseEntity.status(201).body(savedCadastro);
	    }
	   
	   @PutMapping("/{id}")
		public ResponseEntity<ItensDTO> atualizar(@PathVariable Long id, @RequestBody ItensDTO dto) {
			ItensDTO updatedItem = service.atualizar(id, dto);
			return ResponseEntity.ok(updatedItem);
		}
	   
	   @DeleteMapping("/{id}")
		public ResponseEntity<Void> deletar(@PathVariable Long id) {
			service.deletar(id);
			return ResponseEntity.noContent().build();
		}


}
