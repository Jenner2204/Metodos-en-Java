package com.mycompany.areadeunrectangulo;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
import java.util.Scanner;
public class AreaDeUnRectangulo {

public static double calcularArea(double base, double altura) {

        double area;

        area = base * altura;

        return area;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.print("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();

        area = calcularArea(base, altura);

        System.out.println("Área: " + area);

        sc.close();
    }
}
