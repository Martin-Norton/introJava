
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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int opinion;
     Scanner leer = new Scanner(System.in);
     System.out.println("clasifique la peli de 1 a 5 estrellas");
     opinion = leer.nextInt();
    if (opinion >=1 && opinion<= 5){
        switch (opinion){
             case 1:
             case 2:
                 System.out.println("nos sentimos apenados que no hayas disfrutado la peli");
                 break;
             case 3:
                 System.out.println("has calificado la peli como buena");
                 break;
             case 4: 
                 System.out.println("has calificado la peli como muy buena");
                 break;
             case 5: 
                 System.out.println("fantastico que hayas disfrutado un excelente entretenimiento");
                 break;
        }
    } else if (opinion < 0){
       System.out.println("opínion negativa");
      }
    else if (opinion == 0){
      System.out.println("el valor "+opinion+"no es valido");
    } 
    else {
     System.out.println("mucha calificacion");
    }    
    
    System.out.println("hasta la proxima");
    }
    
    }
