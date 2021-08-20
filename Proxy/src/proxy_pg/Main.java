package proxy_pg;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sitiosBloqueados = new ArrayList<>();
        sitiosBloqueados.add("www.youtube.com");
        sitiosBloqueados.add("www.facebook.com");

        IConexionInternet proxy = new ProxyInternet(new InternetService(), sitiosBloqueados);

        System.out.println("------------------------------------------");
        proxy.conectarCon("www.google.com");
        System.out.println("------------------------------------------");
        proxy.conectarCon("www.youtube.com");
        System.out.println("------------------------------------------");

    }
}
