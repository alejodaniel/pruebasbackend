package com.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.dao.IBodegaDetalleDao;
import com.back.model.BodegaDetalle;
import com.back.service.IBodegaDetalleService;

@Service
public class BodegaDetalleService implements IBodegaDetalleService {

    @Autowired
    private IBodegaDetalleDao dao ;

    @Override
    public BodegaDetalle registrar(BodegaDetalle t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrar'");
    }

    @Override
    public BodegaDetalle actualizar(BodegaDetalle t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public BodegaDetalle listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public List<BodegaDetalle> listar() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }



    
}
