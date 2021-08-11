package chain_gobierno;

public class Presidente extends Funcionario {
    public Presidente() {
    }

    public void procesarDocumento(Documento doc) {


            switch (doc.getTipo()) {
                case 1:
                    System.out.println("Documento RESERVADO");
                    break;
                case 2:
                    System.out.println("Documento SECRETO");
                    break;
                case 3:
                    System.out.println("Documento MUY SECRETO");
                    break;
                default:
                    System.out.println("Aún no hay un acceso para ese nivel");
            }
                    if (doc.getTipo() <= 3) {
                        System.out.println("-------------------------------------------------");
                        System.out.println("<-- El documento será leído por el Presidente -->");
                        System.out.println("-------------------------------------------------");
                    }
                    if (this.getSigFunc() != null) {
                        this.getSigFunc().procesarDocumento(doc);
                    }
            }
        }

