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
public class JavaApplication4 {
    
        public static void main(String[] args) {
           
            String str = JOptionPane.showInputDialog("Introduzca un número");
            int num = Integer.parseInt(str);
       
            
            do{
                num = num - 1;
                System.out.println(num);
                
            }while(num != 0);
       }
    
}
