package com.backend.mesas;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contacto> contactos = new ArrayList<>();
        Contacto c1 = new Contacto();
        c1.setNombre("Pato");
        c1.setMail("pato@gmail.com");
        c1.setTelefono("1111111");

        Contacto c2 = new Contacto();
        c2.setNombre("Virgi");
        c2.setMail("virgi@gmail.com");
        c2.setTelefono("1122222");

        /* crear el archivo y guardar la coleccion*/
        FileOutputStream fos = null;
        try {
            contactos.add(c1);
            contactos.add(c2);

            fos = new FileOutputStream("C:/Users/a/Desktop/CTD_cosascomp/contactos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactos);
        } catch (FileNotFoundException f) {
            System.out.println("Error " + f.getMessage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        /* Recuperar la coleccion */
        List<Contacto> contactos2 = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:/Users/a/Desktop/CTD_cosascomp/contactos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            contactos2 = (ArrayList) ois.readObject();
        }catch (FileNotFoundException f){
            System.out.println("Error " + f.getMessage());
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        for(Contacto c : contactos2){
            System.out.println("Nombre: " + c.getNombre() + "\n"+ "Mail: " + c.getMail()+ "\n" + "Teléfono: " + c.getTelefono());
            System.out.println("********************************************");
        }


    }
}
