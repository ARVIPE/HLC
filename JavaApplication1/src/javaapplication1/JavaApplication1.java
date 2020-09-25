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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = JOptionPane.showInputDialog("Introduzca un número:");
	int a = Integer.parseInt(str);
        str = JOptionPane.showInputDialog("Introduzca otro número:");
        int b = Integer.parseInt(str);
        
        
        if (a > b) {
            System.out.println("El número mayor es: " + a);
        }else{
            System.out.println("El número mayor es: " + b);
        }
        
        
    }
    
}
