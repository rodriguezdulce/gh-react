package com.company;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;

    private final int MAYOR_DE_EDAD = 18;

    public Persona(){
        //Constructor vacio
        edad = 0;
    }

    public Persona(String nombre, String apellidoMaterno, String apellidoPaterno, int edad, String rfc){
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.edad = edad;
        this.rfc = rfc.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc.toUpperCase();
    }

    public boolean esMayorDeEdad(){
        return this.edad>=MAYOR_DE_EDAD?true:false;
    }
}
