package proxy_pg_drive;

import java.util.ArrayList;

public class DriveService implements IDriveService {
    private ArrayList<DriveDoc> docs = new ArrayList<>();

    public ArrayList<DriveDoc> getDocs() {
        return docs;
    }

    public void setDocs(ArrayList<DriveDoc> docs) {
        this.docs = docs;
    }

    @Override
    public void accederDoc(String url, String email) {
        for(DriveDoc doc : docs) {
            String durl;
            if (!doc.getUrl().contains(url)) {
                System.out.println("El documento no ha sido encontrado");
                durl = url;
            }
            System.out.println("Documento encontrado");
            String condicion;
            if (!doc.getUsuarios().contains(email)){
                condicion = "autorizado";
                }
            }

    }
}