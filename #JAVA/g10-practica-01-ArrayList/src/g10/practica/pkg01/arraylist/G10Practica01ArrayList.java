/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10.practica.pkg01.arraylist;

import java.util.Scanner;
import servicio.PerroServicio;

/**
 *
 * @author jonak
 */
public class G10Practica01ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServicio puente = new PerroServicio();
        puente.listaRazas();
        puente.imprimirLista();
        System.out.println("Ingrese una raza a eliminar");
        puente.recorrerIterator("lalo");
        puente.imprimirLista();
        
        
    }
    
}
