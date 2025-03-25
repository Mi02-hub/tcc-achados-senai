package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.achados.entities.CadastroAdm;

@Repository
public interface CadastroAdmRepository extends JpaRepository<CadastroAdm, Long> {

}
