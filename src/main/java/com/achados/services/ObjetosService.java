package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.ObjetosDTO;
import com.achados.entities.Objetos;
import com.achados.repositories.ObjetosRepository;

@Service
public class ObjetosService {

	@Autowired
	private ObjetosRepository repo;
	
	public List<ObjetosDTO> buscarTodos(){
		List<Objetos> list = repo.findAll();
		return list.stream().map(ObjetosDTO::new).toList();
	}
	public ObjetosDTO criar(ObjetosDTO dto) {
		Objetos Obj = new Objetos();
		Obj.setNome(dto.getNome());
		Obj.setDescricao(dto.getDescricao());
		return new ObjetosDTO(Obj);
	}
	
	public ObjetosDTO atualizar(Long id, ObjetosDTO dto ) {
		Optional<Objetos> eXi = repo.findById(id);
		if (eXi.isEmpty()){
			throw new RuntimeException("Item não encontrado");
		}
		Objetos Obj = eXi.get();
		Obj.setNome(dto.getNome());
		Obj.setDescricao(dto.getDescricao());
		Obj = repo.save(Obj);
		return new ObjetosDTO(Obj);
	}
	public void deletar(Long id) {
		Optional<Objetos> Obj = repo.findById(id);
		if (Obj.isEmpty()) {
			
		}
		repo.delete(Obj.get());
	}
}
