package com.achados.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achados.dto.AdmDTO;
import com.achados.entities.Adm;
import com.achados.repositories.AdmRepository;

@Service
public class AdmService {

    @Autowired
    private AdmRepository repo;

   
    public List<AdmDTO> buscarTodos() {
        List<Adm> list = repo.findAll();
        return list.stream().map(AdmDTO::new).collect(Collectors.toList());
    }
    
    public AdmDTO criar (AdmDTO dto) {
    	Adm adm = new Adm();
    	adm.setEmail(dto.getEmail());
    	adm.setNome(dto.getNome());
    	adm.setSenha(dto.getSenha());
    	return new AdmDTO(adm);
    }
    public AdmDTO atualizar (Long id, AdmDTO dto) {
    	Optional<Adm> existeAdm = repo.findById(id);
    	if (existeAdm.isEmpty()) {
    		throw new RuntimeException("Adiministrador não encontrado");
    		
    	}
		
    	Adm adm = existeAdm.get();
    	adm.setEmail(dto.getEmail());
    	adm.setNome(dto.getNome());
    	adm.setSenha(dto.getSenha());
    	
    	return new AdmDTO(adm);
    	
    }
       public void deletar (Long id) {
    	   Optional<Adm> adm = repo.findById(id);
    	   if (adm.isEmpty()) {
    		   throw new RuntimeException("Adiministrador(A) não encotrado");
    	   }
    	   repo.delete(adm.get());
       }
}
