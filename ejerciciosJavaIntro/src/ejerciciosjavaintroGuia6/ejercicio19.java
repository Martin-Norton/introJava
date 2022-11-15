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
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] num = new int[3][3];
        int[][] aux = new int[3][3];
        int c = 0;
        System.out.println("Ingrese datos para matriz [3][3]");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = scan.nextInt();
                aux[j][i] = num[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (num[i][j] == (-aux[j][i])) {
                    c++;
                }
                System.out.print("[" + num[i][j] + "]");
            }
          System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + aux[i][j] + "]");
            }System.out.println("");
        }

        if (c == num.length) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

        



}
