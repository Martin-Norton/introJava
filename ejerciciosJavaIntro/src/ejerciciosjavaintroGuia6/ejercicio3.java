/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavaintroGuia6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Martin Norton
 */
public class ejercicio3 {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase , fraseMayus , fraseMin;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        fraseMayus = toUpperCase(frase);
        fraseMin = toLowerCase(frase);
        System.out.println(fraseMayus);
        System.out.println(fraseMin);
        
                
        // TODO code application logic here
    }

}
