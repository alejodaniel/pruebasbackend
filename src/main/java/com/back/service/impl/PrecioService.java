package com.back.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.back.dao.IPrecioDao;
import com.back.model.Precio;
import com.back.service.IPrecioService;

@Service
public class PrecioService implements IPrecioService {

    @Autowired
    private IPrecioDao dao ;

    @Override
    public Precio registrar(Precio t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrar'");
    }

    @Override
    public Precio actualizar(Precio t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void eliminar(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Precio listarId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public List<Precio> listar() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }



    
}
