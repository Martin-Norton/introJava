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
public class ejercicioExtra23 {
   public static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    /*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
    */
    public static void main(String[] args) {
//        String [] palabras = new String [5];
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String [20][20];
        String palabra;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra como mínimo 3 y hasta 5 caracteres (palabra " + (i+1) + ")");
//            palabras[i] = leer.nextLine();
//            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
//                System.out.println("Debe volver a ingresar la palabra (" + (i+1) + ")");
//                palabras[i] = leer.nextLine();
//            }
            palabra = leer.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Debe volver a ingresar la palabra (" + (i+1) + ")");
                palabra = leer.nextLine();
            }
            pasarPalabra(sopa, palabra);
        }
        
        mostrarMatriz(sopa);
        
    }
static void pasarPalabra(String [][]sopa, String palabra){
        int fila = (int) (Math.random()*20);
        //int lugar;
        for(int i = 0; i < palabra.length(); i++) {
            //lugar = (int) (Math.random()*20);
            sopa[fila][i] = palabra.substring(i, i+1);
        }
    }
static void mostrarMatriz(String[][] sopa){
        int num;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                num = (int) (Math.random()*10);
                
                if (sopa[i][j] == null) {
                    sopa[i][j] = ""+num;
                }
                System.out.print("|" + sopa[i][j] + "|");
            }
            System.out.println("");
        }
    }
}

