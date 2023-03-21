package com.back.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.back.model.Bodega;



public interface IBodegaDao extends JpaRepository<Bodega,Integer>{


    @Query(value="select * from detalledb",nativeQuery = true)
    List<Object>listarvista();

}
