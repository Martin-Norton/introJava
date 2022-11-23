/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadLibro;

/**
 *
 * @author Martin Norton
 */
public class EntidadLibro {

    public int ISNB;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    public EntidadLibro(int ISNB, String titulo, String autor, int numeroDePaginas) {
        this.ISNB = ISNB;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public EntidadLibro() {
    }

    public int getISNB() {
        return ISNB;
    }

    public void setISNB(int ISNB) {
        this.ISNB = ISNB;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISNB=" + ISNB + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + '}';
    }

}
