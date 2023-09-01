/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.orien.obj;

import Clases.Libro;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear una clase llamada Libro que contenga los siguientes atributos:
         * ISBN, Título, Autor, Número de páginas, y un constructor con todos
         * los atributos pasados por parámetro y un constructor vacío. Crear un
         * método para cargar un libro pidiendo los datos al usuario y luego
         * informar mediante otro método el número de ISBN, el título, el autor
         * del libro y el número de páginas.
         */
        Scanner leer = new Scanner(System.in);
        Libro L1 = new Libro(0, "Titulo", "Autor", 0);
        
        System.out.print("Ingrese el código ISBN: ");
        L1.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese el Título del libro: ");
        L1.Titulo = leer.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese el autor del libro: ");
        L1.Autor = leer.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese el número de páginas del libro: ");
        L1.NumeroDePaginas = leer.nextInt();
        System.out.println("");
        
        System.out.println(L1.toString());
    }

}
