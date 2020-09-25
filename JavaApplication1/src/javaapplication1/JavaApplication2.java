/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author arvip
 */
public class JavaApplication2 {
    
     public static void main(String[] args) {
         
         String str = JOptionPane.showInputDialog("Introduzca un número:");
         int a = Integer.parseInt(str);
         
         if(a%2 == 0){
             System.out.println("El número es par");
         }else{
             System.out.println("El número es inpar");
         }
        
         
     }
    
}
