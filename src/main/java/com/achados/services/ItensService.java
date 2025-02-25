package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.ItensDTO;
import com.achados.entities.Itens;
import com.achados.repositories.ItensRepository;



@Service
public class ItensService {
	
	@Autowired
	private ItensRepository repo;
	
	public List<ItensDTO> buscarTodos(){
		List<Itens> list = repo.findAll();
		return list.stream().map(ItensDTO::new).toList();
	}
   
	public ItensDTO criar(ItensDTO dto) {
		Itens item = new Itens();
		item.setNome(dto.getNome());  
		item.setDescricao(dto.getDescricao()); 
		item = repo.save(item);
		return new ItensDTO(item);  
	}
	
	public ItensDTO atualizar(Long id, ItensDTO dto) {
		Optional<Itens> existeItem = repo.findById(id);
		if (existeItem.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}

		Itens item = existeItem.get();
		item.setNome(dto.getNome());
		item.setDescricao(dto.getDescricao());
		item = repo.save(item);
	
		return new ItensDTO(item);  
	}
	
	public void deletar(Long id) {
		Optional<Itens> item = repo.findById(id);
		if (item.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}
		repo.delete(item.get());
	}

	
	
}
