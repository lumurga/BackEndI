package proxy_pg_drive;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario us1 = new Usuario("pepe@gmail.com");
        Usuario us2 = new Usuario("juana@gmail.com");
        Usuario us3 = new Usuario("maria@gmail.com");
        Usuario us4 = new Usuario("cacho@gmail.com");
        Usuario us5 = new Usuario("chiche@gmail.com");
        Usuario us6 = new Usuario("pepita@gmail.com");
        Usuario us7 = new Usuario("pachi@gmail.com");
        Usuario us8 = new Usuario("marcela@gmail.com");




        DriveDoc doc1 = new DriveDoc(1, "www.miDoc1.com","Soy un documento");
        DriveDoc doc2 = new DriveDoc(2, "www.miDoc2.com","Soy un documento");
        DriveDoc doc3 = new DriveDoc(3, "www.miDoc3.com","Soy un documento");
        DriveDoc doc4 = new DriveDoc(4, "www.miDoc4.com","Soy un documento");
        DriveDoc doc5 = new DriveDoc(5, "www.miDoc5.com","Soy un documento");

        doc1.agregarUs(us1);
        doc1.agregarUs(us2);
        doc1.agregarUs(us3);
        doc1.agregarUs(us4);

        doc2.agregarUs(us2);
        doc2.agregarUs(us5);

        doc3.agregarUs(us8);
        doc3.agregarUs(us6);
        doc3.agregarUs(us7);

        doc4.agregarUs(us3);
        doc4.agregarUs(us1);
        doc4.agregarUs(us5);

        doc5.agregarUs(us3);
        doc5.agregarUs(us8);




        ProxyDrive proxyDrive = new ProxyDrive(new DriveService());

        proxyDrive.accederDoc("www.miDoc1.com", "pepe@gmail.com");
        proxyDrive.accederDoc("www.miDoc6.com", "chiche@gmail.com");



    }
}
