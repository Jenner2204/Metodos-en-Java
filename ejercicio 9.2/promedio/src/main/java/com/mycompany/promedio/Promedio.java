package com.mycompany.promedio;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
import java.util.Scanner;
public class Promedio {

public static double calcularPromedio(double n1, double n2, double n3) {

        double promedio;

        promedio = (n1 + n2 + n3) / 3;

        return promedio;
    }
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double promedio;

        System.out.print("Ingrese nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        n2 = sc.nextDouble();

        System.out.print("Ingrese nota 3: ");
        n3 = sc.nextDouble();

        promedio = calcularPromedio(n1, n2, n3);

        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Reprobó");
        }

        sc.close();
    }
}
