package flyweight_mesas;



import java.util.ArrayList;

public class Bosque {
    private ArrayList<Arbol> arboles;

    public Bosque() {
        this.arboles = new ArrayList<>();
    }

    public ArrayList<Arbol> getArboles() {
        return arboles;
    }

    public void setArboles(ArrayList<Arbol> arboles) {
        this.arboles = arboles;
    }

    public void plantarArbol(Arbol a) {
        if(a != null){
            arboles.add(a);
            System.out.println(" 🌳 Árbol " + a.getTipo() + " plantado en el bosque! 🌳");
        }else{
            System.out.println("🌱 Primero tenés que crear el árbol 🌱");
        }
    }


    public void plantarHastaMorir(int cantidad){
        for(int i = 0; i <cantidad;i++){
           arboles.add(ArbolFactory.getArbol("Frutal"));

        };
        for(int i = 0; i <cantidad;i++){
            arboles.add(ArbolFactory.getArbol("Ornamental"));
        };
        for(int i = 0; i <cantidad;i++){
            arboles.add(ArbolFactory.getArbol("Floral"));
        };
        System.out.println("Cantidad de 🌳 plantados: " + arboles.size() + ".");
        int frutal =0;
        int floral =0;
        int ornamental =0;
        for(Arbol a : arboles){
            if(a.getTipo().equals("Frutal")){
                frutal++;
            }
            if(a.getTipo().equals("Ornamental")){
                ornamental++;
            }
            if(a.getTipo().equals("Floral")){
                floral++;
            }
        }
        System.out.println("Cantidad de árboles 🍊 frutales plantados: " + frutal + ".");
        System.out.println("Cantidad de árboles 🌸 florales plantados: " + floral + ".");
        System.out.println("Cantidad de árboles 🌲 ornamentales plantados: " + ornamental + ".");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024));
    }
}
