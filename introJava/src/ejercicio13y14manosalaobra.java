
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
public class ejercicio13y14manosalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String[] Equipo= new String [2] ;
        for (int i = 0; i < 2; i++) {
            Equipo[i]= leer.nextLine();
             
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
