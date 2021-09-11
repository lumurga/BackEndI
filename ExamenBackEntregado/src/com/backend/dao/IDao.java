package com.backend.dao;

import java.util.List;

public interface IDao <T>{

    public void limpiar();
    public T guardar(T t);
    public T buscar(int id);
    public List<T> listarTodos();

}