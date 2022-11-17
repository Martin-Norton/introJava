/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintroGuia6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class ejercicioExtra10 {
  public static  Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    /*
    Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
    */
    public static void main(String[] args) {
       
       Random aleat = new Random();
       int num1= aleat.nextInt(10), num2= aleat.nextInt(10) ;
       eleccionUsuario(num1,num2);
    }
    public static void eleccionUsuario(int num1,int num2){
        System.out.println("cual es el resultado de la multiplicacion " + num1 +" * " + num2 + " ?");
        int respuesta = leer.nextInt();
        boolean corroborador = true;
        while(corroborador=true) {
          if (respuesta == (num1*num2)) {
            System.out.println("adivinaste!!");
            break;
        } 
          if (respuesta!=(num1*num2)) {
             System.out.println("intenta de nuevo");
                 respuesta=leer.nextInt();
                 corroborador=false;
            }

}

    }
    
}
