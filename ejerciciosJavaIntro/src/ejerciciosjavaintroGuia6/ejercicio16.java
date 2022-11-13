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
public class ejercicio16 {
    /*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
    */

    /**
     * @param args the command line arguments
     */
     public static Random aleat = new Random();
     public static int N;
     public static int[] vector = new int[N];
     
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo");
        int N = leer.nextInt();
        vector = new int[N];
        mostrarVector(vector ,N);
        System.out.println("ingrese un numero a buscar en el vector");
        int num = leer.nextInt();
        int rep=1;
        for (int i = 0; i <= N-1; i++) {
            if (vector[i]==num) {
                System.out.print("el numero se encuentra en la posicion"+ i +" ; ");
                for (int j = i+1; j < N-1; j++) {
                    if (vector[i]==vector[j]) {
                        rep+=1;
                    }
            }
              System.out.println("el numero se repite " + rep + "veces");
            }
        }
       //buscarNumero( vector ,  N , num);
       
    }
    public static void mostrarVector(int[] vector , int N){
         for (int i = 0; i <= N-1; i++) {
            vector[i]= aleat.nextInt(101);
        }
       for (int i = 0; i <=N-1; i++) {
           System.out.print(vector[i]+ " "); 
       }
        System.out.println("");
       
    }
    public static void buscarNumero(int [] vector , int N, int num){
        int rep=0;
        for (int i = 0; i < N-1; i++) {
            if (vector[i]==num) {
                System.out.print("el numero se encuentra en la posicion"+ i+" ; ");
                for (int j = i+1; j < N-1; j++) {
                    if (vector[i]==vector[j]) {
                        rep+=1;
                    }
            }
              System.out.println("el numero se repite " + rep + "veces");
            }
        }
    }
}

   
