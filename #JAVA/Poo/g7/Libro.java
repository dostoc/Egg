/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author LogiC
 */
public class Libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN: " + ISBN + ", Titulo: " + Titulo + ", Autor: " + Autor + ", NumeroDePaginas: " + NumeroDePaginas + '}';
    }
    
    
}
