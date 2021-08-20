package proxy_pg_drive;

public class ProxyDrive implements IDriveService {
    private DriveService driveService;

    public ProxyDrive(DriveService driveService) {
        this.driveService = driveService;
    }

    @Override
    public void accederDoc(String url, String email) {
        System.out.println("---Verificando acceso al documento---");
        if(url.equals(durl))
                System.out.println("---Acceso concedido ✅ ---");
            } else System.out.println("---Acceso denegado ❌ ---");

        }
    }
}
