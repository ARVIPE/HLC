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
public class prueba {
     public static void main(String[] args) {
         
       int [] array = new int[10];
       Scanner ent = new Scanner(System.in);
       
       System.out.println("Introduzca 10 números\n");
       
       for(int i = 0; i < array.length; i++){
           array[i] = ent.nextInt();
           
           
           System.out.println("Array sin ordenar:\n " + array[i]);
           for (int j = 0; j < array.length; j++) {
			int aux = array[i];
			int k;

			for (k = i; k > 0 && array[k-1] > aux; k--) {
				array[k] = array[k-1];
			}

			array[j] = aux;
		}
       }
     }
       

}
