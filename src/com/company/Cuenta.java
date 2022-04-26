package com.company;

public class Cuenta {

    private String nombreBanco;
    private String numeroCuenta;
    private Integer saldo;
    private Persona dueno;

    public Cuenta(){
        //Constructor vacio
    }

    public Cuenta(String nombreBanco, String numeroCuenta, Integer saldo, Persona dueno){
        this.dueno = dueno;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.nombreBanco = nombreBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    private boolean retirarDinero(Integer cantidadRetiro){
        boolean esOperacionCorrecta = false;
        if(cantidadRetiro>0 && cantidadRetiro<=this.saldo){

            this.saldo = this.saldo - cantidadRetiro;
            esOperacionCorrecta = true;
        }else
            System.out.println("La cuenta no tiene fondos suficientes para realizar la operación solicitada.");

        return esOperacionCorrecta;
    }

    private boolean abonarDinero(Integer cantidadAbono){
        boolean esOperacionCorrecta = false;
        if (cantidadAbono > 0) {
            this.saldo = this.saldo + cantidadAbono;
            esOperacionCorrecta = true;
        }else
            System.out.println("Para realizar un abono, la cantidad debe de ser mayor a cero");

        return esOperacionCorrecta;
    }

    public Cuenta transferencia(Cuenta cuentaDestino, Integer cantidadTransferir){
        if(!this.nombreBanco.equalsIgnoreCase(cuentaDestino.getNombreBanco()))
            System.out.println("Realizando una transferencia interbancaria...");

        if(this.dueno.esMayorDeEdad()){
            if(this.retirarDinero(cantidadTransferir)){
                cuentaDestino.abonarDinero(cantidadTransferir);
            }
        }else
            System.out.println("Error, para realizar una transferencia el dueño de la cuenta debe de tener al menos 18 años");

        return cuentaDestino;
    }
}
