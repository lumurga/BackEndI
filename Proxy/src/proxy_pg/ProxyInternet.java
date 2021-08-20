package proxy_pg;

import java.util.List;

public class ProxyInternet implements IConexionInternet{
    private InternetService internetService;
    private List<String> sitiosBloqueados;

    public ProxyInternet(InternetService internetService, List<String> sitiosBloqueados) {
        this.internetService = internetService;
        this.sitiosBloqueados = sitiosBloqueados;
    }

    @Override
    public void conectarCon(String url) {
        if(!sitiosBloqueados.contains(url)){
            this.internetService.conectarCon(url);
        }else System.out.println("\uD83D\uDEAB Acceso denegado \uD83D\uDEAB");
    }
}
