
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
public class productoVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        vector = new int[2];
        int [] producto = new int[3];
        int [][] matriz = {{4,8,6},{2,1,7}};
        System.out.println("ingrese los valores del vector de tamaño"+vector.length+":");
        Scanner leer=new Scanner(System.in);
        for(int i=0 ; i<vector.length ;i++){
            System.out.print("v["+i+"]=");
            vector[i] = leer.nextInt();
        }
        int suma;
        for (int j = 0 ;j<matriz[0].length;j++){
        suma=0;
        for (int i=0; i<vector.length; i++){
        suma+= vector[i] * matriz[i][j];
        }
        producto[j] = suma;
        
        }
         String aux = "";
         
         System.out.println("*vector");   
         for(int elemento:vector){
         aux= aux + " " + elemento;
         }
         System.out.println(aux);
         System.out.println("n * matriz");
         for (int[] fila : matriz){
             aux="";
             for(int elemento :fila){
             aux += " " + elemento;
             }
             System.out.println(aux);
             aux="";
             System.out.println("n* vector x matriz:");
             for(int elemento: producto){
             aux+= " "+elemento;
             }
             System.out.println(aux);
         }
    }
    
}
