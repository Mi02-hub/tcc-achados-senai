package com.achados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.achados.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
