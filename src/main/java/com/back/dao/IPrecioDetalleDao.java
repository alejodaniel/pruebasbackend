package com.back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.model.PrecioDetalle;

public interface IPrecioDetalleDao extends JpaRepository<PrecioDetalle,Integer>{
    
    
}
