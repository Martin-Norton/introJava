/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintroGuia6;

/**
 *
 * @author Martin Norton
 */
public class ejercicio15 {
/*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 100;
       int[] vectorint = new int[N];
        for (int i = 0; i <= N-1; i++) {
          vectorint[i]=  i+1; 
        }
        for (int i = N-1; i >= 0; i--) {
            System.out.println(vectorint[i]);  
        }
       
    }
    
}
