package templatePG;



import java.time.LocalDate;

public abstract class ProcesadorPago {
   private Tarjeta tarjeta;



 public boolean validarFecha(Tarjeta t){
     LocalDate fechaActual = LocalDate.now();
     LocalDate exp = LocalDate.parse(t.getFechaExp());

     return exp.isAfter(fechaActual);
 }


    public void pocesarPago(Tarjeta t, Double monto){
        validarFecha(t);
        if(validarFecha(t)){
            autorizar(t, monto);
        } else System.out.println("La tarjeta ha expirado");
    }

    public abstract void autorizar(Tarjeta t, double monto);
}
