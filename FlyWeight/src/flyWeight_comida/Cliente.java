package flyWeight_comida;

public class Cliente {
    public static void main(String[] args) {

        System.out.println("🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽");
        Comida hamburguesa = ComidaFactory.getComida("Hamburguesa 🍔");
        hamburguesa.setPrecio(300);
        hamburguesa.setTieneLechuga(true);
        hamburguesa.descripcionComida();
        System.out.println("🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽");
        Comida pizza = ComidaFactory.getComida("Pizza 🍕");
        pizza.setPrecio(470);
        pizza.setTieneLechuga(false);
        pizza.descripcionComida();
        System.out.println("🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽");
        Comida pasta = ComidaFactory.getComida("Pasta 🍝");
        pasta.setPrecio(290);
        pasta.setTieneLechuga(false);
        pasta.descripcionComida();
        System.out.println("🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽");
        Comida sushi = ComidaFactory.getComida("Sushi 🍣");
        sushi.setPrecio(800);
        sushi.setTieneLechuga(false);
        sushi.descripcionComida();
        System.out.println("🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽🍽");

    }
}
