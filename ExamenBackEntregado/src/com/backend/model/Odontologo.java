package com.backend.model;

public class Odontologo {
    private Integer ID;
    private String nombre;
    private String apellido;
    private Integer matricula;

    /* Getters y Setters */

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    /* Constructor */

    public Odontologo(String nombre, String apellido, Integer matricula) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    /* Métodos */

    @Override
    public String toString() {
        return "\u001B[36m"+"\n--Odontólogo--" +"\u001B[35m"+ "\nMatrícula: "+"\u001B[0m" + matricula + "\u001B[35m"+"\nNombre: "+"\u001B[0m" + nombre +"\u001B[35m"+ "\nApellido: "+"\u001B[0m" + apellido+"\n";
    }


}
