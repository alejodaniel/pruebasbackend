package com.back.service;
import java.util.List;

public interface ICrud<T> {

    T registrar(T t);
    T actualizar (T t);
    void eliminar (int id);
    T listarId(int id);
    List<T> listar ();

}
