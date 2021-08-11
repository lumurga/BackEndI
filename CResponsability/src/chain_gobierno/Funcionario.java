package chain_gobierno;
public abstract class Funcionario {
    private Documento doc;
    private Funcionario sigFunc;

    public Funcionario() {
    }

    public abstract void procesarDocumento(Documento var1);

    public Documento getDoc() {
        return this.doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    public Funcionario getSigFunc() {
        return this.sigFunc;
    }

    public void setSigFunc(Funcionario sigFunc) {
        this.sigFunc = sigFunc;
    }
}
