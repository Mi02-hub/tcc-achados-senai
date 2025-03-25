package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.AcessóriosDTO;
import com.achados.entities.Acessorios;
import com.achados.entities.Acessórios;
import com.achados.repositories.AcessóriosRepository;

@Service
public class AcessóriosService {

	@Autowired
	private AcessóriosRepository repo;
	
	public List<AcessóriosDTO> buscarTodos(){
		List<Acessorios> list = repo.findAll();
		return list.stream().map(AcessóriosDTO::new).toList();
	}
	
	public AcessóriosDTO criar(AcessóriosDTO dto) {
		Acessorios acc = new Acessorios();
		acc.setNome(dto.getNome());
		acc.setDescricao(dto.getDescricao());
		acc = repo.save(acc);
		return new AcessóriosDTO(acc);
	}
	
	public AcessóriosDTO atualizar(Long id, AcessóriosDTO dto) {
		Optional<Acessorios> eXi = repo.findById(id);
		if (eXi.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}
		Acessorios acc = eXi.get();
		acc.setNome(dto.getNome());
		acc.setDescricao(dto.getDescricao());
		acc = repo.save(acc);
		
		return new AcessóriosDTO(acc);
	}
	public void deletar(Long id ) {
		Optional<Acessorios> acc = repo.findById(id);
		if (acc.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
			
		}
		repo.delete(acc.get());
	}
	
}
