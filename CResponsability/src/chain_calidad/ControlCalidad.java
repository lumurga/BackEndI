package chain_calidad;

public abstract class ControlCalidad {
    private Articulo a;
    private ControlCalidad sigControl;

    public ControlCalidad() {
    }

    public abstract void comprobarCalidad(Articulo a);

    public ControlCalidad getSigControl() {
        return sigControl;
    }

    public ControlCalidad setSigControl(ControlCalidad sigControl) {
        this.sigControl = sigControl;
        return sigControl;
    }

    public Articulo getA() {
        return a;
    }

    public void setA(Articulo a) {
        this.a = a;
    }
}
