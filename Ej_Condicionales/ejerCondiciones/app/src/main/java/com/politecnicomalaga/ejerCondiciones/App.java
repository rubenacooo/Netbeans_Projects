/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejerCondiciones;

import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una hora del 1 al 24: ");
        int hora = teclado.nextInt();
        
        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos días.");
        }
        else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes.");
        }
        else if (hora >= 21 && hora <= 24 || hora <= 5){
            System.out.println("Buenas noches.");
        }
  
    }
}
