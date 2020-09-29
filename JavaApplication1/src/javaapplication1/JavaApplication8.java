/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author arvip
 */
import javax.swing.JOptionPane;

public class JavaApplication8 {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("Input chars");
		
		System.out.println(data);   
		 
        for (int i = 0; i < data.length(); i++){
            int as = data.charAt(i);
            System.out.println(as);  
        }
	}

}

