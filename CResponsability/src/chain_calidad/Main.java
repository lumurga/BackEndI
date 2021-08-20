package chain_calidad;

public class Main {
    public static void main(String[] args) {
        Articulo art1 = new Articulo("Articulo 1", 800, 1250, "sano");
        Articulo art2 = new Articulo("Articulo 2", 1500, 1200, "casi sano");



        ControlCalidad handler = new ControlLote();
        ControlCalidad handler2 = new ControlPeso();
        ControlCalidad handler3 = new ControlEnvase();
        handler.setSigControl(handler2);
        handler2.setSigControl(handler3);




        handler.comprobarCalidad(art1);
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        handler.comprobarCalidad(art2);


    }
}
