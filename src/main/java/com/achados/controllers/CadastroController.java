package com.achados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achados.repositories.CadastroRepository;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {
     
    @Autowired
	private CadastroRepository repo;
    
    
    
}
