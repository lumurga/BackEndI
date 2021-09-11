package com.backend.mesasIntegradora;



import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.setNombre("Juan");
        e1.setApellido("Pérez");
        e1.setSueldo(80000.);
        e1.setLegajo("00001");

        Empleado e2 = new Empleado();
        e2.setNombre("José");
        e2.setApellido("Gómez");
        e2.setSueldo(80000.);
        e2.setLegajo("00002");

        Empleado e3 = new Empleado();
        e3.setNombre("María");
        e3.setApellido("Pérez");
        e3.setSueldo(80000.);
        e3.setLegajo("00003");

        Empresa em = new Empresa("27.31.356.178.1","Mi Empresa S.A.");
        em.agregarEmpleado(e1);
        em.agregarEmpleado(e2);
        em.agregarEmpleado(e3);




        try{
            FileOutputStream fo = new FileOutputStream("C:/Users/a/Desktop/CTD_cosascomp/empleados.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(em);
            fo.close();

            FileInputStream fi = new FileInputStream("C:/Users/a/Desktop/CTD_cosascomp/empleados.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            Empresa em2 = (Empresa) ois.readObject();
            ArrayList<Empleado> empleados = (ArrayList<Empleado>) em2.getEmpleados();
            System.out.println(em2.toString());
            for (Empleado e: empleados) {
                System.out.println(
                        "\u001B[35m" + "- Nombre: " + "\u001B[0m" + e.getNombre() + '\n' +
                        "\u001B[35m" + "- Apellido: " + "\u001B[0m" + e.getApellido() + '\n' +
                        "\u001B[35m" + "- Legajo: " + "\u001B[0m" + e.getLegajo() + '\n' +
                        "\u001B[35m" + "- Sueldo: " + "\u001B[0m" + "$" + Math.round(e.getSueldo()) + '\n' +
                        "-----------------------------" + '\n');
            }
            ois.close();

        }catch (FileNotFoundException f){
            System.out.println("Error " + f.getMessage());
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
