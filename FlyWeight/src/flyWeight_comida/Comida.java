package flyWeight_comida;

public class Comida {
    private String tipoComida;
    private int precio;
    private boolean tieneLechuga;

    public Comida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isTieneLechuga() {
        return tieneLechuga;
    }

    public void setTieneLechuga(boolean tieneLechuga) {
        this.tieneLechuga = tieneLechuga;
    }
    public void descripcionComida(){
        System.out.println("Es " + getTipoComida() + " y su precio es de $" + getPrecio());
        if (this.isTieneLechuga()){
            System.out.println("Tiene lechuga: Si.");

        }else System.out.println("Tiene lechuga: No.");
    }
}
