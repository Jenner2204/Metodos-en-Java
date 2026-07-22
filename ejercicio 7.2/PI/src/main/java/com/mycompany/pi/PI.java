package com.mycompany.pi;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
public class PI {

public static double obtenerPI() {
        return 3.1416;
    }
    public static void main(String[] args) {
        double pi;

        pi = obtenerPI();

        System.out.println("Valor de PI: " + pi);

    }
}
