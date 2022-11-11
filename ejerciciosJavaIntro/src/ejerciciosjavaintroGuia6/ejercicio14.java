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
public class ejercicio14 {
/*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
    */
    /**
     * @param args the command line arguments
     */
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese la moneda a comprar: dolares , yenes o libras");
        String moneda = leer.nextLine();
        System.out.println("ingrese la cantidad de " + moneda + " que quiere cambiar");
        int cantidad = leer.nextInt();
        double retorno = conversion( moneda ,cantidad) ; 
        System.out.println("son " + retorno +" "+ moneda );
    }
    public static double conversion(String moneda , int cantidad){
        double retorno= 0;
        switch(moneda){
            case "dolares":
                retorno += cantidad * 1.28611;
                break;
            case "yenes":
                retorno += cantidad * 129.852;
                break;
            case "libras":
                retorno += cantidad * 0.86;
                break;          
    } 
        return retorno;
    }
    
}
