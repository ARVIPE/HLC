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
public class JavaApplicacion10 {
    public static void main(String[] args) {
        
     int mayor = 0, num = -1, menor = 0;

		
		for (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca número (0 -> Salir): "));
			if (i == 0) {
				mayor = num;
                                menor = num;
			}
			else {
				if (num > mayor && num != 0) {
					mayor = num;
				}
                                if(num < menor && num != 0){
                                    menor = num;
                                }
			}
		}
		
		JOptionPane.showMessageDialog(null, "Mayor total " + mayor + "\nMenor total " + menor);
	}
	
	

}