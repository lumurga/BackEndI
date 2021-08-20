package flyWeight_listaReprod;


import java.util.HashMap;

public class CancionFactory {
    private static HashMap<String, Cancion> canciones = new HashMap<>();


    public static Cancion getCancion(String nombre){
        Cancion cancion = (Cancion) canciones.get(nombre);
        if(cancion == null) {
            cancion = new Cancion(nombre);
            canciones.put(nombre, cancion);
            System.out.println("Creando canción de nombre: " + nombre);
        }
        return cancion;
    }

    public static HashMap<String, Cancion> getCanciones() {
        return canciones;
    }


}
