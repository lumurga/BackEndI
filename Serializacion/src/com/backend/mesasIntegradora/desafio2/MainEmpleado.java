package com.backend.mesasIntegradora.desafio2;

import com.backend.mesasIntegradora.Empleado;
import com.backend.mesasIntegradora.Empresa;

import java.io.*;
import java.util.ArrayList;

public class MainEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.setNombre("Juan");
        e1.setApellido("Pérez");
        e1.setSueldo(80000);
        e1.setLegajo("00001");
        Empleado e2 = new Empleado();
        e2.setNombre("José");
        e2.setApellido("Gómez");
        e2.setSueldo(80000);
        e2.setLegajo("00002");
        Empleado e3 = new Empleado();
        e3.setNombre("María");
        e3.setApellido("Pérez");
        e3.setSueldo(80000);
        e3.setLegajo("00003");
        Empleado e4 = new Empleado();
        e4.setNombre("Mariela");
        e4.setApellido("Tapia");
        e4.setSueldo(80000);
        e4.setLegajo("00004");

        Empresa empresa = new Empresa("54.541.687.164.8","Mi Empresa 2 S.A." );
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);


        FileWriter fiW = null;
        try {
            fiW = new FileWriter("C:/Users/a/Desktop/CTD_cosascomp/empleados2.txt");

            ArrayList<Empleado> empleados2 = (ArrayList<Empleado>) empresa.getEmpleados();
            for (Empleado empleado : empleados2) {
                fiW.write(empleado.getNombre() + " " + empleado.getApellido() + "; " + empleado.getLegajo() + "; " + empleado.getSueldo() + "\n");
            }

            fiW.close();
        } catch ( FileNotFoundException f ) {
            System.out.println( "Error file: " + f.getMessage() );
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
