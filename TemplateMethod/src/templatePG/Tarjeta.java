package templatePG;

import java.time.LocalDate;
import java.util.Date;

public class Tarjeta {
    private String tipo;
    private int numeroFrente;
    private int codigoSeguridad;
    private String fechaExp;
    private double limite;
    private double saldo;

    public Tarjeta(String tipo, int numeroFrente, int codigoSeguridad, String fechaExp, double limite, double saldo) {
        this.tipo = tipo;
        this.numeroFrente = numeroFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExp = fechaExp;
        this.limite = limite;
        this.saldo = saldo;
    }

    public Tarjeta(String tipo, int numeroFrente, int codigoSeguridad, String fechaExp, double saldo) {
        this.tipo = tipo;
        this.numeroFrente = numeroFrente;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaExp = fechaExp;
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroFrente() {
        return numeroFrente;
    }

    public void setNumeroFrente(int numeroFrente) {
        this.numeroFrente = numeroFrente;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}

