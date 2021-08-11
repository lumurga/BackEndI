import facade.Check;

public class Main {
    public static void main(String[] args) {

        Check cliente1 = new Check();
        cliente1.buscar("1/08/2021", "9/08/2021", "Colombia", "Argentina");

        Check cliente2 = new Check();
        cliente2.buscar("9/08/2021", "10/08/2021", "Lamentis");

    }
}
