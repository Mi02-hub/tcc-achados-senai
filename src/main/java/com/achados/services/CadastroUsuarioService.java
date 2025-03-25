package com.achados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.achados.entities.CadastroUsuario;
import com.achados.repositories.CadastroUsuarioRepository;


@Service
public class CadastroUsuarioService {
    

    @Autowired
    private CadastroUsuarioRepository cadastroUsuarioRepository;
    
    public List<CadastroUsuario> listarTodos() {
        return cadastroUsuarioRepository.findAll();
    }
    
    public CadastroUsuario salvar(CadastroUsuario cadastroUsuario) {
        return cadastroUsuarioRepository.save(cadastroUsuario); 
    }
    
    public CadastroUsuario atualizar(Long id, CadastroUsuario usuarioAtualizado) {
        if (!cadastroUsuarioRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado");
        }
        usuarioAtualizado.setId(id); 
        return cadastroUsuarioRepository.save(usuarioAtualizado); 
    }
    
    public void deletar(Long id) {
        if (!cadastroUsuarioRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado");
        }
        cadastroUsuarioRepository.deleteById(id); 
    }
}
