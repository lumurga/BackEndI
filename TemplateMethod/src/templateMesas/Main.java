package templateMesas;

public class Main {
    public static void main(String[] args) {
        Menu infantil = new MenuInfantil();
        Menu adulto = new MenuAdulto();
        Menu veggie = new MenuVegetariano();
        System.out.println("----> Orden de Menú Infantil <----");
        infantil.armarPaquete();
        System.out.println("****************************************");

        System.out.println("----> Orden de Menú Adulto <----");
        adulto.armarPaquete();
        System.out.println("****************************************");

        System.out.println("----> Orden de Menú Vegetariano <----");
        veggie.armarPaquete();
        System.out.println("****************************************");

    }
}
