package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona victor =
                new Persona("Victor", "Rios", "Vargas", 17, "rivv910925cc0");

        Persona dulce = new Persona("Dulce", "Rodriguez",
                "Hernandez", 21, "aaaa111111cc0");

        Cuenta cuentaVictor = new Cuenta("CitiBanamex", "10230010", 1000, victor);
        Cuenta cuentaDulce = new Cuenta("BBVA", "90621920", 300, dulce);

        System.out.println("Saldo Victor antes de la transferencia $"+cuentaVictor.getSaldo());
        System.out.println("Saldo Dulce antes de la transferencia $"+cuentaDulce.getSaldo());
        cuentaDulce = cuentaVictor.transferencia(cuentaDulce, 100);
        System.out.println("/****************************************************************************************/");
        System.out.println("Saldo Dulce despues de la transferencia $"+cuentaDulce.getSaldo());
        System.out.println("Saldo Victor despues de la transferencia $"+cuentaVictor.getSaldo());
    }
}
