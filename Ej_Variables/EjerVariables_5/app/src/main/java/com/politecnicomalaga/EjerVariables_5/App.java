/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.EjerVariables_5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = myScanner.nextLine();
        System.out.println("Introduce tu dirección: ");
        String dir = myScanner.nextLine();
        System.out.println("Introduce tu número de teléfono: ");
        int num = myScanner.nextInt();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu dirección es: " + dir);
        System.out.println("Tu número de teléfono es: " + num);
    }
}
