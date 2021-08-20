package proxy_mesas.inter.impl;

import proxy_mesas.inter.IDescarga;
import proxy_mesas.model.Usuario;

public class ServicioDescarga implements IDescarga {
    @Override
    public void decargar(Usuario us) {
        if(us != null) {
            System.out.println("Verificando acceso a descarga del usuario " + us.getIdentificador());
        }
    }
}
