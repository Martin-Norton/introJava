
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
public class ejercicio11manosalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase terminada en punto");
        String frase = leer.nextLine();
        int largo = frase.length();
        String newFrase="", newFrase2="";
        for (int i = 0; i < largo; i++) {
          switch(frase.substring(i,i+1)){
              case "a": 
                  newFrase2 += "@";
                  break;
               case "e": 
                  newFrase2 += "#";
                  break;
               case "i": 
                  newFrase2 += "$";
                  break;
               case "o": 
                  newFrase2 += "%";
                  break;
               case "u": 
                  newFrase2 += "*";
                  break;  
               default : 
                  newFrase2 += frase.substring(i,i+1);
        }                            
    }
         System.out.println(newFrase2);
    }
    
}
