package chain_gobierno;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Funcionario presidente = new Presidente();
        Funcionario ministro = new Ministro();
        Funcionario diputado = new Diputado();

        presidente.setSigFunc(ministro);
        ministro.setSigFunc(diputado);

        Documento docA = new Documento("Documento A", 1);
        Documento docB = new Documento("Documento B", 2);
        Documento docC = new Documento("Documento C", 3);

        presidente.procesarDocumento(docA);
        presidente.procesarDocumento(docB);
        presidente.procesarDocumento(docC);
    }
}