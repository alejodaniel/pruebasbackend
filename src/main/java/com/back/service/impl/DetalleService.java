package com.back.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.back.dao.IDetalleDao;
import com.back.model.Detalle;
import com.back.service.IDetalleService;

@Service
public class DetalleService implements IDetalleService {

    @Autowired
    private IDetalleDao dao ;

    @Override
    public Detalle registrar(Detalle t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrar'");
    }

    @Override
    public Detalle actualizar(Detalle t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Detalle listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public List<Detalle> listar() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }



    
}
