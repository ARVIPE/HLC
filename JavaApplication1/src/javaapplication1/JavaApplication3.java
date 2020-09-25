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
public class JavaApplication3 {
    
    public static void main(String[] args) {
        
           //Declaracion de variables

       int num1=0,num2=0,num3=0,mayor=0;

        Scanner numero = new Scanner (System.in);

       

        System.out.println("programa para desplegar el numero mayor" );

        System.out.println("teclee numero ");

        num1 = numero.nextInt ();

        

        System.out.println("teclee numero 2" );

        num2 = numero.nextInt();

       

        System.out.println("teclee numero 3" );

        num3 = numero.nextInt();

       

        if (num1>num2 && num1>num3)

            System.out.println("el numero mayor es: "+ num1);

       

        if (num2>num1 && num2>num3)

           System.out.println("el numero mayor es: "+ num2);

      

        if (num3>num1 && num3>num2)

            System.out.println("el numero mayor es: "+ num3);       

    }

}
