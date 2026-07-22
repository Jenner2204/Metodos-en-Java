package com.mycompany.calculadora;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
import java.util.Scanner;
public class Calculadora {
    
public static void operaciones(double a, double b) {

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        b = sc.nextDouble();

        operaciones(a, b);

        sc.close();

    }
}
