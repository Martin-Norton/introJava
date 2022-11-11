package ejerciciosjavaintroGuia6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin Norton
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el lado del cuadrado");
        int n = leer.nextInt();
        int fila , col;
        String aux = "";
        for (fila = 0; fila < n; fila++) {
             System.out.print("*");
        }
        System.out.println("");
        
        for (fila = 0; fila <= n-3; fila++) {
            aux+="*";
             //System.out.println("*");
            for (col = 0; col<=n-3; col++) {
                aux += " ";
                //System.out.print("o"); 
            }
            aux += "*";
            System.out.println(aux);
            aux = "";
            //System.out.println("*");  
        }
             
        
        for (fila = 0; fila < n; fila++) {
            System.out.print("*");
        }
    }
    
}
