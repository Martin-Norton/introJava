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
public class ejercicio2 {
/*
    Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre;
        System.out.println("ingresa tu nombre");
        nombre = leer.nextLine();
        System.out.println("el nombre ingresado es " + nombre);
        // TODO code application logic here
    }
    
}
