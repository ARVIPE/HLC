/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author arvip
 */
public class JavaApplication9 {
 
    public static void main(String[] args) {
        //Ej.: El factorial de 5 es: 5*4*3*2*1
        long factorial=1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
