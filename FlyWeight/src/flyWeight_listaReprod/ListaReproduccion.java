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
    /* ================= Métodos ================= */

    public void agregarCancion(Cancion c) {
        if(c != null){
            canciones.add(c);
            System.out.println(" 🎵 Canción " + c.getNombre() + " agregada correctamente! ");
        }else{
            System.out.println(" No podés agregar una canción que no existe 😣");
        }
    }

    public void eliminarCancion(Cancion c) {
        if(c != null){
            canciones.remove(c);
            System.out.println("🎵 Canción " + c.getNombre() + " eliminada.");
        } else {
            System.out.println("La canción no forma parte de ésta lista 😣");
        }
    }

    public void consultarCancion(String nombre) {
        Cancion c = CancionFactory.getCanciones().get(nombre);

        if(c == null){
            System.out.println("404 CANCIÓN NOT FOUND 🚫");
        }
        else {
            System.out.println(" 🎵 Canción encontrada: " + " ➡ Titulo: " + c.getNombre() + " Artista: " + c.getArtista() + " Genero: " + c.getGenero()+".");
        }

        }



    public void mostrarLista () {
        System.out.println("🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶🎶");
        System.out.println("Bosque: " + this.getNombre());
        for (Cancion c : canciones) {
            c.descripcion();
            System.out.println("______________________________");
        }
    }
}
