package com.backend.service;

import com.backend.dao.IDao;
import com.backend.model.Odontologo;

import java.util.List;

public class OdontologoService {

    /* Atributos */

    private IDao<Odontologo> odontologoIDao;

    /* Getters Y Setters */

    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    /* Constructor*/

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    /* Métodos */

    public void limpiar(){
        odontologoIDao.limpiar();
    }

    public Odontologo guardar (Odontologo o){
        return odontologoIDao.guardar(o);
    }

    public Odontologo buscar(Integer id){
        return odontologoIDao.buscar(id);
    }

    public List<Odontologo> listarTodos(){
        return odontologoIDao.listarTodos();
    }

}
