package com.backend.perros;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Perro> perros = new ArrayList<>();

        Perro perro1 = new Perro();
        perro1.setNombre("Homero");
        perro1.setEdad(7);

        Perro perro2 = new Perro();
        perro2.setNombre("Cleo");
        perro2.setEdad(9);



        /* crear el archivo y guardar la coleccion*/
        FileOutputStream fo = null;
        try{
            perros.add(perro1);
            perros.add(perro2);
            fo = new FileOutputStream("C:/Users/a/Desktop/CTD_cosascomp/perros.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);
            dos.writeObject(perros);

        }catch(FileNotFoundException f){
            System.out.println("Error " + f.getMessage());
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

        /* Recuperar la coleccion */
        List<Perro> perros2 = null;
        FileInputStream fi = null;
        try{
            fi = new FileInputStream("C:/Users/a/Desktop/CTD_cosascomp/perros.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            perros2 = (ArrayList) ois.readObject();
        }catch (FileNotFoundException f){
            System.out.println("Error " + f.getMessage());
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        for(Perro perro : perros2){
            System.out.println("Nombre: " + perro.getNombre() + ", Edad: " + perro.getEdad());
        }
    }
}
