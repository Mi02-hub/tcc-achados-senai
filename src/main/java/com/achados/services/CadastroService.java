package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.CadastroDTO;
import com.achados.entities.Cadastro;
import com.achados.repositories.CadastroRepository;

@Service
public class CadastroService {
  
	@Autowired
	private CadastroRepository repo;
	
	public List<CadastroDTO> buscarTodos(){
		List<Cadastro> list = repo.findAll();
		return list.stream().map(CadastroDTO::new).toList();
		
	}
	
	public CadastroDTO criar (CadastroDTO dto) {
		Cadastro cadastro = new Cadastro();
	    cadastro.setNome(dto.getNome());
	    cadastro.setSobrenome(dto.getSobrenome());
	    cadastro.setEmail(dto.getSenha());
	    return new CadastroDTO(cadastro);
	}
	
	public CadastroDTO atualizar (Long id, CadastroDTO dto) {
		Optional<Cadastro> existeCadastro = repo.findById(id);
		if (existeCadastro.isEmpty()) {
			throw new RuntimeException("Cadastro não encontrado");
		}
		
		Cadastro cadastro = existeCadastro.get();
		cadastro.setNome(dto.getNome());
		cadastro.setSobrenome(dto.getSobrenome());
		cadastro.setEmail(dto.getEmail());
		cadastro.setSenha(dto.getSenha());
		
		return new CadastroDTO(cadastro);
	}
	
	public void deletar (Long id) {
		Optional<Cadastro> cadastro = repo.findById(id);
		if (cadastro.isEmpty()) {
			throw new RuntimeException("Cadastro não encontrado.");
		}
		repo.delete(cadastro.get());
	}
}
