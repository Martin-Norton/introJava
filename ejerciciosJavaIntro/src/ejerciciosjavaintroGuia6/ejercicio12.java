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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String frase;
       int correctas= 0,incorrectas=0;
        do {
            System.out.println("ingrese una frase");
        frase=leer.nextLine();
        if ((frase.substring(0,1).equalsIgnoreCase("x"))&&(frase.substring(4,5).equalsIgnoreCase("o")) && (frase.length()<=5)) {
            correctas +=1;
        }else{
         
                incorrectas += 1;
             }
        } while (!frase.equals("&&&&&"));
        
        
       
        System.out.println("las frases correctas fueron: " + correctas);
        System.out.println("las frases incorrectas fueron: " + (incorrectas-1));
        
    
        
    }
}
