package com.mycompany.numeroaleatorio;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
public class NumeroAleatorio {
    
public static int obtenerNumero() {

        int numero;

        numero = (int)(Math.random() * 100) + 1;

        return numero;
    }
    public static void main(String[] args) {
        int numero;

        numero = obtenerNumero();

        System.out.println("Número generado: " + numero);

    }
}
