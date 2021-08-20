package chain_calidad;

public class ControlLote extends ControlCalidad{

    @Override
    public void comprobarCalidad(Articulo a) {
        System.out.println("----  " + a.getNombre() + " en proceso de control de calidad ----");

        if(a.getLote()>=1000 && a.getLote()<=2000){
            System.out.println("El artículo ha pasado exitosamente el control de lote ✅");
        }else {
            System.out.println("El artículo no ha pasado el control de lote ❌");
            a.setAceptado(false);
        }


        if (this.getSigControl() != null) {
            this.getSigControl().comprobarCalidad(a);
        }
    }
}
