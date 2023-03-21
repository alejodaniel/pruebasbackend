package com.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.dao.IBodegaDao;
import com.back.model.Bodega;
import com.back.service.IBodegaService;

@Service
public class BodegaService implements IBodegaService {

    @Autowired
    private IBodegaDao dao;

    @Override
    public Bodega registrar(Bodega t) {
        return dao.save(t);
    }

    @Override
    public Bodega actualizar(Bodega t) {
        return dao.save(t);
    }

    @Override
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    public Bodega listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public List<Bodega> listar() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }

    @Override
    public List<Object> listarvista() {
        // TODO Auto-generated method stub
        return dao.listarvista();
    }

}
