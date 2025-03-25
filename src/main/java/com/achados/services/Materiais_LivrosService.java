package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.Materiais_LivrosDTO;
import com.achados.entities.Materiais_Livros;
import com.achados.repositories.Materiais_LivrosRepository;
@Service
public class Materiais_LivrosService {

	@Autowired
	private Materiais_LivrosRepository repo;
	
	public List<Materiais_LivrosDTO> buscarTodos(){
		List<Materiais_Livros> list = repo.findAll();
		return list.stream().map(Materiais_LivrosDTO::new).toList();
		
	}
	
	public Materiais_LivrosDTO criar (Materiais_LivrosDTO dto){
		Materiais_Livros ML = new Materiais_Livros ();
		ML.setNome(dto.getNome());
		ML.setDescricao(dto.getDescricao());
		ML = repo.save(ML);
		return new Materiais_LivrosDTO(ML);
	}
	public Materiais_LivrosDTO atualizar(Long id, Materiais_LivrosDTO dto) {
		Optional<Materiais_Livros> existeML = repo.findById(id);
		if (existeML.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}
		Materiais_Livros ML2 = existeML.get();
		ML2.setNome(dto.getNome());
		ML2.setDescricao(dto.getDescricao());
		ML2 = repo.save(ML2);
		return new Materiais_LivrosDTO(ML2);
	}
	public void deletar(Long id) {
		Optional<Materiais_Livros> ML3 = repo.findById(id);
		if (ML3.isEmpty()) {
			throw new RuntimeException("Item não econtrado");
		}
	}
}
