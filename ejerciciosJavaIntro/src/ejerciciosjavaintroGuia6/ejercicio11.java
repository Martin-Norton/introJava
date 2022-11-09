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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String letra = "n";
        
        do {
            System.out.println("ingrese una opcion");
        System.out.println("MENU");
        System.out.println("1-sumar");
        System.out.println("2-restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-salir");
       int opc = leer.nextInt();
       int total;
       switch (opc)  {
           case 1:
               total = num1 + num2;
               System.out.println(total);
               break;
           case 2 :
               total = num1 - num2;
               System.out.println(total);
               break;
           case 3:
               total= num1 * num2;
               System.out.println(total);
               break;
           case 4: 
               total= num1 / num2;
               System.out.println(total);
               break;
           case 5:
               letra= confirmar ();
               break;
}
             } while (letra == "n");
       
        
}
    public static String confirmar () {
            Scanner leer=new Scanner(System.in);
            System.out.println("quiere salir? s/n");
            String letra = leer.nextLine();
        return letra;
         
}
}
 