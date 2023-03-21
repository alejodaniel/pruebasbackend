package com.back.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.back.dao.IPrecioDetalleDao;
import com.back.model.PrecioDetalle;
import com.back.service.IPrecioDetalleService;

@Service
public class PrecioDetalleService implements IPrecioDetalleService {

    @Autowired
    private IPrecioDetalleDao dao ;

    @Override
    public PrecioDetalle registrar(PrecioDetalle t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrar'");
    }

    @Override
    public PrecioDetalle actualizar(PrecioDetalle t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public PrecioDetalle listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public List<PrecioDetalle> listar() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }



    
}
