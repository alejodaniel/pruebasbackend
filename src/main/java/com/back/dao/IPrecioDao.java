package com.back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.model.Precio;

public interface IPrecioDao extends JpaRepository<Precio,Integer>{
    
    
}
