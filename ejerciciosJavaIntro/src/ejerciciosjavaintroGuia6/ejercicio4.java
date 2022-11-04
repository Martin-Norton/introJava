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
public class ejercicio4 {

    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la temp en grados centigrados");
        Double c,f;
        c = leer.nextDouble();
        f= 32 + (9*c/5);
        System.out.println("la temp en grados fahrenheit es " + f);
        
        // TODO code application logic here
    }
    
}
