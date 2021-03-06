package flyWeight_listaReprod;

import java.util.ArrayList;

public class ListaReproduccion {
    private String nombre;
    private ArrayList<Cancion> canciones = canciones = new ArrayList<>();
    /* ================= Constructor ================= */
    public ListaReproduccion(String nombre) {
        this.nombre = nombre;

    }
    /* ================= Getters y Setters ================= */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    /* ================= M茅todos ================= */

    public void agregarCancion(Cancion c) {
        if(c != null){
            canciones.add(c);
            System.out.println(" 馃幍 Canci贸n " + c.getNombre() + " agregada correctamente! ");
        }else{
            System.out.println(" No pod茅s agregar una canci贸n que no existe 馃槪");
        }
    }

    public void eliminarCancion(Cancion c) {
        if(c != null){
            canciones.remove(c);
            System.out.println("馃幍 Canci贸n " + c.getNombre() + " eliminada.");
        } else {
            System.out.println("La canci贸n no forma parte de 茅sta lista 馃槪");
        }
    }

    public void consultarCancion(String nombre) {
        Cancion c = CancionFactory.getCanciones().get(nombre);

        if(c == null){
            System.out.println("404 CANCI脫N NOT FOUND 馃毇");
        }
        else {
            System.out.println(" 馃幍 Canci贸n encontrada: " + " 鉃? Titulo: " + c.getNombre() + " Artista: " + c.getArtista() + " Genero: " + c.getGenero()+".");
        }

        }



    public void mostrarLista () {
        System.out.println("馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎馃幎");
        System.out.println("Bosque: " + this.getNombre());
        for (Cancion c : canciones) {
            c.descripcion();
            System.out.println("______________________________");
        }
    }
}
