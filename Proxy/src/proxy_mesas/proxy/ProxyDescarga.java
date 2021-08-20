package proxy_mesas.proxy;

import proxy_mesas.inter.IDescarga;
import proxy_mesas.inter.impl.ServicioDescarga;
import proxy_mesas.model.Usuario;

public class ProxyDescarga implements IDescarga {
    private ServicioDescarga servicio;

    public ProxyDescarga(ServicioDescarga servicio) {
        this.servicio = servicio;
    }

    @Override
    public void decargar(Usuario us) {
        switch (us.getTipo()){
            case "Premium":
                System.out.println("Ya podés empezar tu descarga");
                break;
            case "Free":
                System.out.println("No tenés acceso a la descarga. Para poder disfrutar al máximo tu experiencia Spotify te invitamos a suscribirte ->");
                break;
            default:
                System.out.println("No tenés cuenta en Spotify? Registrate acá -> https://www.spotify.com/ar/signup/");
        }
    }
}
