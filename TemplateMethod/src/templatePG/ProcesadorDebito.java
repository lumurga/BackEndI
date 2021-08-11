package templatePG;

public class ProcesadorDebito extends ProcesadorPago{
    @Override
    public void autorizar(Tarjeta t, double monto) {
        if(t.getSaldo()>monto){
            t.setSaldo(t.getSaldo()-monto);
            System.out.println("<-- Su pago de $" + monto + " ha sido procesado con éxito. El saldo de su cuenta es de $" + t.getSaldo() + " -->");

        }else System.out.println("<-- Saldo insuficiente -->");
    }
}
