/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calcular_edad;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Calcular_Edad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrse la Edad");
// cualquier cosa//
        int edad = entrada.nextInt();

        if (edad >= 0 && edad < 120) {
            //Categoria de las personas//
            if (edad >= 0 && edad <= 12) {
                System.out.println("Eres un niño");
            } else if (edad >= 13 && edad < 35) {
                System.out.println("Eres un Joven");
            } else {
                System.out.println("Eres un Adulto");
            }

        } else {
            System.out.println("ERROR");

        }

    }
}
