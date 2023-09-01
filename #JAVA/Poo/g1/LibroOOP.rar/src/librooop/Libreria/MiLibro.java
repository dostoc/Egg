
package librooop.Libreria;

import java.util.Scanner;


public class MiLibro {
    //ISBN, Título, Autor, Número de páginas
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int numPaginas;

    public MiLibro() {/*El constructor vacio es para poder crear la instancia de clase sin pasar argumentos
        */
    }
    

    public MiLibro(String ISBN, String Titulo, String Autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
        
    }
    
    public void cargarLibro(){
    Scanner input = new Scanner(System.in);
    
        System.out.println("Ingresa el codigo ISBN: ");
        this.ISBN = input.nextLine();
        System.out.println("Ingresa el Titulo: ");
        this.Titulo = input.nextLine();
        System.out.println("Ingrese el Autor: ");
        this.Autor = input.nextLine();
        System.out.println("Ingrese el numero de paginas: ");
        this.numPaginas = input.nextInt();
        
    }
    /*
    public void mostrarLibro() {
        System.out.println("el ISBN es = " + ISBN);
        System.out.println("El titulo es = " + Titulo);
        System.out.println("La cantidad de paginas es = " + numPaginas);
        System.out.println("El autor es = " + Autor);
    }*/

    @Override
    public String toString() {
        return "MiLibro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
    
    
    
    
}
