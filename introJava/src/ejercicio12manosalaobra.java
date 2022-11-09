
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
public class ejercicio12manosalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero a verificar");
        int num = leer.nextInt();
        System.out.println("el numero multiplo");
        int multiplo = leer.nextInt();
        multiplo(num ,multiplo);
    }
   public static void multiplo(int num , int multiplo){
      if (num % multiplo == 0) {
          System.out.println("el numero es multiplo");
      }else{
          System.out.println("el numero no es multiplo");
      }
   
   } 
}
