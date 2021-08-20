package chain_calidad;

public class ControlPeso extends ControlCalidad{
    @Override
    public void comprobarCalidad(Articulo a) {
        if(a.getPeso() >= 1200 && a.getPeso() <= 1300) {
            System.out.println("El artículo ha pasado exitosamente el control de peso ✅");

        }else {
            System.out.println("El artículo no ha pasado el control de lote ❌");
            a.setAceptado(false);
        }

        if (this.getSigControl() != null) {
            this.getSigControl().comprobarCalidad(a);
        }

        }
    }

