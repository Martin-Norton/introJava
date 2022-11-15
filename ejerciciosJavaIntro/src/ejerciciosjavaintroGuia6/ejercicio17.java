/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintroGuia6;

import static ejerciciosjavaintroGuia6.ejercicio16.vector;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
    */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo");
        int N = leer.nextInt();
        vector = new int[N];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*10000+1);
        }
        int c1=0 , c2=0, c3=0, c4=0, c5=0;
        for (int i = 0; i < vector.length; i++) {
            switch (String.valueOf(vector[i]).length()){
                case 1:
                    c1++;
                case 2:
                    c2++;   
                case 3:
                    c3++;
                case 4:
                    c4++;
                case 5:
                    c5++;
            }   
        }
        System.out.println("la cantidad de numeros de 1 cifra son " + c1);
        System.out.println("la cantidad de numeros de 2 cifras son " + c2);
        System.out.println("la cantidad de numeros de 3 cifras son " + c3);
        System.out.println("la cantidad de numeros de 4 cifras son " + c4);
        System.out.println("la cantidad de numeros de 5 cifras son " + c5);
        
    }
      
    
}
