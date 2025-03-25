package com.achados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.achados.entities.CadastroAdm;
import com.achados.repositories.CadastroAdmRepository;




@Service
public class CadastroAdmService {

	
	@Autowired
	public CadastroAdmRepository cadastroAdmRepository;
	

	public List<CadastroAdm> listarTodos(){
		return cadastroAdmRepository.findAll();
	}
	
	 public CadastroAdm buscarPorId(Long id) {
	        return cadastroAdmRepository.findById(id)
	                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Administrador não encontrado"));
	    }
	 

	  public CadastroAdm salvar(CadastroAdm cadastroAdm) {
	        return cadastroAdmRepository.save(cadastroAdm);
	    }
	  
	  public CadastroAdm atualizar(Long id, CadastroAdm admAtualizado) {
		  CadastroAdm adm = buscarPorId(id);
		  adm.setNome(admAtualizado.getNome());
		  adm.setEmail(admAtualizado.getEmail());
		  return cadastroAdmRepository.save(adm);
	  }
	  
	  public void deletar(Long id) {
	        if (!cadastroAdmRepository.existsById(id)) {
	            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Administrador não encontrado");
	        }
	        cadastroAdmRepository.deleteById(id);
	    }
	  
	  
	  
}
