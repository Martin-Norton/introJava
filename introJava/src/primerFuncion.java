
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
public class primerFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int resultado = suma(10,10);
        System.out.println(resultado);
        saludoPersonalizado("chiquito");
        Scanner leer=new Scanner(System.in);
        String nombre = leer.next();
        saludoPersonalizado(leer.next());
    }
    
    public static int suma(int a , int b){
    
        //logica
        int c= a+b;
   
        return c;
    }
    public static void saludoPersonalizado(String nombre){
        System.out.println("hola" + nombre + "como estas");
    }
    
}
