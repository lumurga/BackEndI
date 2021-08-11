package api;

public class Avion {
    /* ==================== Métodos ================== */

    public void buscarVuelos(String dateIn, String dateOut, String orig, String dest) {
        System.out.println("\n==============================");
        System.out.println("Vuelos encontrados para " + dest + " desde " + orig);
        System.out.println("Fecha IDA: " + dateIn + " Fecha Vuelta " + dateOut);
        System.out.println("==============================\n");
    }

}
