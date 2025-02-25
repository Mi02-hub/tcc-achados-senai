package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achados.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
