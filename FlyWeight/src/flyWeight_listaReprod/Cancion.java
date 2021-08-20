package flyWeight_listaReprod;

import javax.sound.midi.Soundbank;

public class Cancion {
    private String nombre;
    private String artista;
    private String genero;

    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void descripcion(){

        System.out.println("Título: "+ this.getNombre());
        System.out.println("Artista: "+ this.getArtista());
        System.out.println("Género: "+ this.getGenero());
    }
}
