package templateMesas;

public abstract class Menu {
    private double precioBase;


    public double getPrecioBase() {
        return precioBase;
    }

    private void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void armarPaquete(){
        prepararIngredientes();
        agregarExtras();
        setPrecioBase(200.0);
        calcularCosto();

    }
    private void prepararIngredientes(){
        System.out.println("Preparando ingredientes ---> Ingredientes listos...");
    }

    protected abstract void agregarExtras();

    protected abstract void calcularCosto();

}
