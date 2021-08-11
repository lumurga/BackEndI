package facade;

import api.Hotel;
import api.Avion;

public class Check implements IFacade{

    /* ============== Atributos ================== */

    private Hotel hotelAPI;
    private Avion avionAPI;


    /* =============== Métodos =================== */

    @Override
    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
    }

    @Override
    public void buscar(String fechaEntrada, String fechaSalida, String ciudad) {
        hotelAPI.buscarHoteles(fechaEntrada, fechaSalida, ciudad);
    }

    /* =============== Constructor ================= */

    public Check() {
        hotelAPI = new Hotel();
        avionAPI = new Avion();
    }
}
