package proxy_mesas;

import proxy_mesas.inter.impl.ServicioDescarga;
import proxy_mesas.model.Usuario;
import proxy_mesas.proxy.ProxyDescarga;

public class Main {
    public static void main(String[] args) {
        Usuario us1 = new Usuario(1, "Premium");
        Usuario us2 = new Usuario(2, "Free");
        Usuario us3 = new Usuario(3, "");

        ProxyDescarga proxy = new ProxyDescarga(new ServicioDescarga());
        System.out.println("----------------------------------------");
        proxy.decargar(us1);
        System.out.println("----------------------------------------");
        proxy.decargar(us2);
        System.out.println("----------------------------------------");
        proxy.decargar(us3);

    }
}
