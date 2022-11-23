/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.servicios;

import EntidadLibro.EntidadLibro;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class ServicioLibro {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro() {
        EntidadLibro libroCompleto = new EntidadLibro();

        System.out.println("ingrese el codigo ISBN ");
        libroCompleto.setISNB(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
        libroCompleto.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro");
        libroCompleto.setAutor(leer.next());
        System.out.println("ingrese el n° de paginas del libro");
        libroCompleto.setNumeroDePaginas(leer.nextInt());

        mostrarLibro(libroCompleto);

    }

    public void mostrarLibro(EntidadLibro l1) {
        System.out.println(l1.toString());
    }

}
