package chain_gobierno;

public class Diputado extends Funcionario {

    @Override
    public void procesarDocumento(Documento doc) {

        if (doc.getTipo() < 2) {
            System.out.println("-------------------------------------------------");
            System.out.println("<-- El documento será leído por el Diputado -->");
            System.out.println("-------------------------------------------------");
        }
        if (getSigFunc() != null) {
            this.getSigFunc().procesarDocumento(doc);
        }

    }
}
