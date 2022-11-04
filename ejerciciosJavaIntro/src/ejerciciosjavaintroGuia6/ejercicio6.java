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
public class ejercicio6 {
/*
    Crear un programa que dado un numero determine si es par o impar.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num= leer.nextInt();
        if(num%2==0){
            System.out.println("su numero es par");
        } else {
            System.out.println("su numero es impar");
        }
        
        // TODO code application logic here
    }
    
}
