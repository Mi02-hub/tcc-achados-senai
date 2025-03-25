package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.achados.entities.CadastroUsuario;

@Repository
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long>{

}
