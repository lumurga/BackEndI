package templateMesas;

public class MenuVegetariano extends Menu{
    @Override
    protected void agregarExtras() {
        System.out.println("Packaging especial y condimentos agregados");
    }

    @Override
    protected void calcularCosto() {
        double costoPackaging = 50.;
        System.out.println("El costo del menú vegetariano es de $" + (costoPackaging+ super.getPrecioBase() + (super.getPrecioBase()*0.1)) + ".");
    }
}
