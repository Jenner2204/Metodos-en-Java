package com.mycompany.saludopersonalizado;

/**
 *
 * @author Jenner Oswaldo Parrales Cueva
 */
import java.util.Scanner;
public class SaludoPersonalizado {

public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        saludar(nombre);

        sc.close();
    }
}
