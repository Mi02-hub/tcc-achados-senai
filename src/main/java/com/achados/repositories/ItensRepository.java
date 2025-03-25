package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achados.entities.Itens;

public interface ItensRepository extends JpaRepository<Itens, Long>{

}
