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
public class JavaApplication7 {
     public static void main(String[] args) {
         
         float contador = 0;
         float [] array = new float[1000];
         int suma = 0;
         Scanner ent = new Scanner(System.in);
         int i = 0;
         
         
         do{
            
         System.out.println("Introduzca un número, si quiere salir introduzca 0");
         
         array[i] = ent.nextFloat();
         suma += array[i];
         
         
         contador = contador + 1;
       
         
         
         }while(array[i] != 0);
         
         
         contador = contador - 1;
         
         System.out.println("El resultado de la media aritmética es: ");
         System.out.println(suma/contador);
         
         
         
     }
    
}
