/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintroGuia6;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num1 , num2 ;
        System.out.println("Ingrese dos numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("la suma es igual a " + (num1 + num2));
    }
    
}
