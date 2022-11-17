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
public class ejercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num= leer.nextInt();
        System.out.println("ingrese otro numero");
        int num1= leer.nextInt();
        int cociente= 0;
        do {
            num -= num1;
            cociente+=1;
        } while (num > num1);
        System.out.println("el residuo es "+num+" y el cociente es "+cociente);
    }
    
}
