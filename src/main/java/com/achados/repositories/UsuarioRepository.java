package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achados.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
