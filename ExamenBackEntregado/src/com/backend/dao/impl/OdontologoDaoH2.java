package com.backend.dao.impl;

import com.backend.dao.config.ConfigurationJDBC;
import com.backend.dao.IDao;
import com.backend.model.Odontologo;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;


public class OdontologoDaoH2 implements IDao<Odontologo> {

    /* Atributos */

    private ConfigurationJDBC configurationJDBC;
    private static final Logger logger = Logger.getLogger(String.valueOf(OdontologoDaoH2.class));

    /* Getters y Setters */

    public ConfigurationJDBC getConfigurationJDBC() {
        return configurationJDBC;
    }

    public void setConfigurationJDBC(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }


    /* Constructor */

    public OdontologoDaoH2(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }

    /* Métodos */

    @Override
    public void limpiar() {

        Connection connection = configurationJDBC.connectionDB();
        Statement statement = configurationJDBC.statementDB();

        String query = "TRUNCATE TABLE ODONTOLOGOS RESTART IDENTITY";

        try {
            statement.executeUpdate(query);
            logger.debug("...Base de datos vacía...");
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("Error: " + e.getMessage());
        }

    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = configurationJDBC.connectionDB();
        Statement statement = configurationJDBC.statementDB();

        String query = "INSERT INTO ODONTOLOGOS (NOMBRE, APELLIDO, MATRICULA) VALUES ('" + odontologo.getNombre() +  "', '" + odontologo.getApellido() + "', " + odontologo.getMatricula() + ");";

        try{
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet IdKey = statement.getGeneratedKeys();

            if(IdKey.next()){
                odontologo.setID(IdKey.getInt(1));
                logger.debug("Datos agregados correctamente, ID: " + IdKey.getInt(1));
            }

            statement.close();
            connection.close();

        }catch(SQLException e){
            e.printStackTrace();
            logger.error("Error: " + e.getMessage());
        }

        return odontologo;
    }

    @Override
    public Odontologo buscar(int id) {

        Connection connection = configurationJDBC.connectionDB();
        Statement statement = configurationJDBC.statementDB();
        Odontologo odontologo = null;

        String query = "SELECT * FROM Odontologos WHERE ID = " + id + ";";

        try{
            ResultSet resultSet = statement.executeQuery(query);
            logger.debug("Resultado de la búsqueda -> ID: " + id);

            while(resultSet.next()){
                odontologo = new Odontologo(resultSet.getString(2),resultSet.getString(3), resultSet.getInt(4));
                odontologo.setID(resultSet.getInt(1));
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getInt(4));
            }

        }catch(SQLException e){
            e.printStackTrace();
            logger.error("<-- Error: " + e.getMessage()+ " -->");
        }
        return odontologo;

    }

    @Override
    public List<Odontologo> listarTodos() {

        Connection connection = configurationJDBC.connectionDB();
        Statement statement = configurationJDBC.statementDB();

        String query = "SELECT * FROM Odontologos;";
        List<Odontologo> odontologos = new ArrayList<>();

        try{
            ResultSet resultSet = statement.executeQuery(query);
            logger.debug("-- Consulta realizada --");

            while(resultSet.next()){
                Odontologo odontologo = new Odontologo(resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4));
                odontologo.setID(resultSet.getInt(1));
                odontologos.add(odontologo);
            }

        }catch (SQLException e){
            e.printStackTrace();
            logger.error("<-- Error: " + e.getMessage()+ " -->");
        }

        return odontologos;
    }
}
