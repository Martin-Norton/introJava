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
public class ejercicio10 {
/*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo");
        int num1=leer.nextInt();
         int suma;
            suma = 0;
        do {
            System.out.println("ingrese un numero");
            int num=leer.nextInt();
            suma += num;
        } while(suma<num1);
     
        // TODO code application logic here
    }
    
}
