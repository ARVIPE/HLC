/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author arvip
 */
public class JavaApplication5 {
    public static void main(String[] args) {
        
        int suma = 0;
        int [] array = new int[8];
        Scanner ent = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++) {
             
            System.out.println("Ingresa el "+i+" numero:");
            array[i] = ent.nextInt();
            suma += array[i];
             
        }
        
        System.out.println("La suma total es: "+suma);

        
    }
    
}
