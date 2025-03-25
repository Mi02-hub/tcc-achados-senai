package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.Jogos_EsportesDTO;
import com.achados.entities.Jogos_Esportes;
import com.achados.repositories.Jogos_EsportesRepository;

@Service
public class Jogos_EsportesService {

	@Autowired
	private Jogos_EsportesRepository repo;
	
	public List<Jogos_EsportesDTO> buscarTodos(){
		List<Jogos_Esportes> list = repo.findAll();
		return list.stream().map(Jogos_EsportesDTO::new).toList();
	}
	public Jogos_EsportesDTO criar(Jogos_EsportesDTO dto) {
		Jogos_Esportes JE = new Jogos_Esportes();
		JE.setNome(dto.getNome());
		JE.setDescricao(dto.getDescricao());
		JE = repo.save(JE);
		return new Jogos_EsportesDTO(JE);
		
	}
	public Jogos_EsportesDTO atualizar(Long id, Jogos_Esportes dto ) {
		Optional<Jogos_Esportes> eXi = repo.findById(id);
		if (eXi.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}
		Jogos_Esportes JE = eXi.get();
		JE.setNome(dto.getNome());
		JE.setDescricao(dto.getDescricao());
		JE = repo.save(JE);
		return new Jogos_EsportesDTO(JE);
	}
	
	public void deletar(Long id) {
		Optional<Jogos_Esportes> JE = repo.findById(id);
		if(JE.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}
		repo.delete(JE.get());
	
	}
}

