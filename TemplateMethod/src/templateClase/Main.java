public class Main {
    public static void main(String[] args) {
        CajeroAutomatico ca = new CajeroAutomatico("AA857", 3000, 1);

        System.out.println ("**************************************************" );
        ca.procesar ( "2033899636",1000,2 );
        System.out.println ("**************************************************" );
        Cajero rio = new Cajero("25455226",5000,1);
        rio.procesar("25455226",1000,2);
    }
}
