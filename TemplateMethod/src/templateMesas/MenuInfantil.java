package templateMesas;

public class MenuInfantil extends Menu{
    @Override
    protected void agregarExtras() {
        System.out.println("🎠 Juguetito agregado 🎈");
    }

    @Override
    protected void calcularCosto() {
        double adicionalJuguete = 50.;
        System.out.println("El costo del menú infantil es de $" + (super.getPrecioBase()+adicionalJuguete) + ".");
    }
}
