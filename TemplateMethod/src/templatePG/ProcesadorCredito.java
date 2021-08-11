package templatePG;

public class ProcesadorCredito extends ProcesadorPago{
    private double limite;


    @Override
    public void autorizar(Tarjeta t, double monto) {
        if(t.getLimite()>monto){
            if(t.getSaldo()>monto){
                System.out.println("<-- Su pago de $" + monto + " ha sido procesado con éxito -->");
                t.setSaldo(t.getSaldo()-monto);
            }else System.out.println("<-- Fondos insuficientes -->");
        }else System.out.println("<-- El monto excede su límite de crédito -->");
    }
}
