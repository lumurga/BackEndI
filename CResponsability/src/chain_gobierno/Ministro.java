package chain_gobierno;

public class Ministro extends Funcionario {
    public Ministro() {
    }

    public void procesarDocumento(Documento doc) {
        if (doc.getTipo() <= 2) {
            System.out.println("-------------------------------------------------");
            System.out.println("<-- El documento será leído por el Ministro -->");
            System.out.println("-------------------------------------------------");
        }
        if (this.getSigFunc() != null) {
            this.getSigFunc().procesarDocumento(doc);
        }

    }
}
