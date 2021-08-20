package flyWeight_listaReprod;

public class Main {
    public static void main(String[] args) {
        System.out.println("🎼---------------------------------🎼");
        Cancion cancion1 = CancionFactory.getCancion("Cancion 1");
        cancion1.setArtista("Artista 1");
        cancion1.setGenero("Genero 1");

        System.out.println("🎼---------------------------------🎼");
        Cancion cancion2 = CancionFactory.getCancion("Cancion 2");
        cancion2.setArtista("Artista 2");
        cancion2.setGenero("Genero 1");

        System.out.println("🎼---------------------------------🎼");
        Cancion cancion3 = CancionFactory.getCancion("Cancion 2");
        cancion3.setArtista("Artista 2");
        cancion3.setGenero("Genero 1");

        System.out.println("🎼---------------------------------🎼");


        ListaReproduccion lista = new ListaReproduccion("Lista 1");
        lista.agregarCancion(cancion1);
        lista.agregarCancion(cancion2);
        lista.mostrarLista();

        lista.eliminarCancion(cancion2);
        lista.eliminarCancion(cancion1);
        lista.consultarCancion("Canción 4");


    }
}
