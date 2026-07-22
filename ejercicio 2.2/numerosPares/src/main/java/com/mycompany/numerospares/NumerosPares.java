package com.mycompany.numerospares;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
public class NumerosPares {
    
public static void mostrarPares() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        mostrarPares();
    }
}
