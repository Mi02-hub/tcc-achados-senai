package com.achados.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.EletronicosDTO;
import com.achados.entities.Eletronicos;
import com.achados.repositories.EletronicosRepository;

@Service
public class EletronicosService {

	@Autowired
	private EletronicosRepository repo;
	
	public List<EletronicosDTO> buscarTodos(){
		List<Eletronicos> list = repo.findAll();
		return list.stream().map(EletronicosDTO::new).toList();
	}
	public EletronicosDTO criar(EletronicosDTO dto) {
		Eletronicos Eletro = new Eletronicos();
		Eletro.setNome(dto.getNome());
		Eletro.setDescricao(dto.getDescricao());
		Eletro = repo.save(Eletro);
		return new EletronicosDTO(Eletro);
	}
	public EletronicosDTO atualizar(Long id, Eletronicos dto) {
		Optional<Eletronicos> eXi = repo.findById(id);
		if (eXi.isEmpty()) {
			throw new RuntimeException("Item não encontrado");
		}
		Eletronicos Eletro = eXi.get();
		Eletro.setNome(dto.getNome());
		Eletro.setDescricao(dto.getDescricao());
		Eletro = repo.save(Eletro);
		return new EletronicosDTO(Eletro);
	}
	public void deletar(Long id) {
		Optional<Eletronicos> Eletro = repo.findById(id);
		if(Eletro.isEmpty()) {
			throw new RuntimeException("Item não encntrado");
		}
		repo.delete(Eletro.get());
	}
}
