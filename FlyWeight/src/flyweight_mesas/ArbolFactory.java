package flyweight_mesas;


import java.util.HashMap;

public class ArbolFactory {
    private static HashMap<String,Arbol> arbolesMap = new HashMap<>();

    public static Arbol getArbol(String tipo){
        Arbol arbol = (Arbol) arbolesMap.get(tipo);
        if(arbol == null){
            arbol = new Arbol(tipo);
            arbolesMap.put(tipo, arbol);
            System.out.println("🌳 Creando un árbol de tipo: " + tipo);
        }
        return arbol;
    }

    public HashMap<String, Arbol> getArbolesMap() {
        return arbolesMap;
    }


}
