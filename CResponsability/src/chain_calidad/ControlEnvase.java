package chain_calidad;

public class ControlEnvase extends ControlCalidad{
    @Override
    public void comprobarCalidad(Articulo a) {
       if(a.getEnvasado().equals("sano") || a.getEnvasado().equals("casi sano")){
            System.out.println("El artículo ha pasado exitosamente el control de envase ✅");

        } else {
           a.setAceptado(false);
           System.out.println("El artículo no ha pasado el control de envase ❌");
       }


            if (this.getSigControl() != null) {
            this.getSigControl().comprobarCalidad(a);
        }

        if(a.isAceptado()){
            System.out.println("\u001B[32m"+"✅ El artículo ha sido aprobado por el departamento de calidad ✅"+ "\u001B[0m");
        } else {
            System.out.println("\u001B[31m"+ "❌ El artículo no ha sido aprobado por el departamento de calidad ❌"+ "\u001B[0m");
        }

    }
}
