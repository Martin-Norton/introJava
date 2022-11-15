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
public class ejercicio20 {
     public static Scanner leer = new Scanner(System.in);
     public static int [][]matriz = new int [3][3];

    /**
     * @param args the command line arguments
     */
    /*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
    */
    public static void main(String[] args) {
       llenarMatriz(matriz);
       comprobarMatriz(matriz);
    }
    public static void llenarMatriz(int [][] matriz){
 int num;
 for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un numero para la posicion [" + i + "] , [ " + j + "]"); 
                num= leer.nextInt();
                if (num>1 && num<9) {
                    matriz[i][j]=num;
                }else{
                    System.out.println("numero incorrecto.Reingreselo.");
                }
            }
            
        }
}
    public static void comprobarMatriz(int [][] matriz){
        int suma1=0 , suma2 = 0 , suma3 = 0 ;
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < 3; j++) {
              suma1 += matriz[i][j];
            }   
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    suma2 += matriz [i][j];
                }
                if (i+j==2) {
                    suma3 += matriz[i][j];
                }
            }
            
        }
        if (suma1==suma2 && suma1==suma3) {
            System.out.println("la matriz es magica");
        }else{
        System.out.println("la matriz no es magica");
        }
    }
}

