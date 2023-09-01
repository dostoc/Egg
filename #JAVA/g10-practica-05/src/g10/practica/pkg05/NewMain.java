/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10.practica.pkg05;

import java.util.Scanner;
import servicio.PaisServicio;

/**
 *
 * @author jonak
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio puente = new PaisServicio();

        puente.crearPaices();
        puente.mostrarSet();
        do {
            System.out.println("Desea eliminar algun pais s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                puente.eliminarPais(puente.crearPais());
                puente.mostrarSet();
            }
            System.out.println("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

    }

}
