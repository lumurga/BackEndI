package com.backend.mesasIntegradora;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {
    public String cuit;
    public String razonSocial;
    private List<Empleado> empleados;
    private static final long serialVersionUID = 1L;

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }


    @Override
    public String toString() {
        return  '\n' +
                "\u001B[41m"+ "EMPRESA" + "\u001B[0m" + '\n' +
                "Razón Social: " + getRazonSocial() + '\n' +
                "CUIT: " + getCuit() + '\n' +
                "**********************************" + '\n';
    }
}