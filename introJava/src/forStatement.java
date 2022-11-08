
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
public class forStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero ente 1 y 20");        // println imprime línea

        
            for (int i = 0; i < 4; i++) {
                num = leer.nextInt();
                if (num <0|| num>20){
                    break;
                }  
                for (int j = 0; j < num; j++) {
                    System.out.print("*");                          // print imprime sin saltar
                }
                System.out.println("");
            }
        
    }

}

    

