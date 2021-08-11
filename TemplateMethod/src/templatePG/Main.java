package templatePG;

public class Main {
    public static void main(String[] args) {
        Tarjeta tc = new Tarjeta("credito", 825606505, 5896,"2024-10-10" ,10000., 6000.);
        Tarjeta td = new Tarjeta("debito", 549884543, 5796, "2022-06-14", 20000.);

        ProcesadorCredito pp = new ProcesadorCredito();
        ProcesadorDebito pd = new ProcesadorDebito();

        pp.pocesarPago(tc, 6000. );
        pd.pocesarPago(td, 4000.);

    }
}
