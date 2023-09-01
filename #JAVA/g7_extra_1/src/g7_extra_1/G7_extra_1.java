/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g7_extra_1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class G7_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion();
        
        c1.cancionMano();
        c2.cancionParametro(leer.next(),leer.next());
        
        System.out.println("Titulo: " + c1.getTitulo()+ " -  " +"Autor: " + c1.getAutor());
        System.out.println("Titulo: " + c2.getTitulo()+ " -  " +"Autor: " + c2.getAutor());
        
        
        
        
        
        
        
    }
    
}
