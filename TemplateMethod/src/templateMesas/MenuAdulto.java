package templateMesas;

public class MenuAdulto extends Menu{

    @Override
    protected void agregarExtras(){
        System.out.println("Éste menú no admite ingredientes extra");
    }


    @Override
    protected void calcularCosto(){
        System.out.println("El costo del menú Adulto es $" + super.getPrecioBase() + ".");
    }
}
