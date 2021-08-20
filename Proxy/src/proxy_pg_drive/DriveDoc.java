package proxy_pg_drive;

import java.util.ArrayList;

public class DriveDoc {
    private int id;
    private String url;
    private String contenido;
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public DriveDoc(int id, String url, String contenido) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUs(Usuario us) {
        usuarios.add(us);
    }

    public boolean buscarUsuario(String email) {
        for (Usuario u : usuarios)
            return u.getEmail().equals(email);

        return false;
    }
}