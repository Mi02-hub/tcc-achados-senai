package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achados.entities.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

}
