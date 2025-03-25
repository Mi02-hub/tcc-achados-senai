package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.achados.entities.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
  Login findByEmail (String email);
}
