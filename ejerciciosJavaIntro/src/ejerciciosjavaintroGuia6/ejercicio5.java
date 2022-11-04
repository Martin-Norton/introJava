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
public class ejercicio5 {
/*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);   
        System.out.println("ingrese un numero entero");
        int num= leer.nextInt();
        System.out.println("el doble del numero es " + (num*2));
        System.out.println("el triple del numero es " + (num*3));
        System.out.println("la raiz cuadrada del num es " + Math.sqrt(num));
        // TODO code application logic here
    }
    
}
