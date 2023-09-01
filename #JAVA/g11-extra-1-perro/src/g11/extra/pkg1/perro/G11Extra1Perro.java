/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11.extra.pkg1.perro;

import java.util.Scanner;
import servicio.AdoptaUnPerrito;

/**
 *
 * @author jonak
 */
public class G11Extra1Perro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdoptaUnPerrito puente = new AdoptaUnPerrito();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-Crear Lista de personas");
            System.out.println("2-Crear Lista de perros");
            System.out.println("3-Asignar mascota");
            System.out.println("4-Ver disponibles");
            System.out.println("(N)-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    puente.crearListaPersona();
                    break;
                case 2:
                    puente.crearListaPerro();
                    break;
                case 3:
                    puente.adoptaPerrito();
                    break;
                case 4:
                    puente.verPerrosDisponibles();
                    break;
                case 5:
                    puente.mostrarListaPerro();
                    puente.mostrarListaPersona();
                    break;
                    
                case 6:
                    System.out.println("DESEA SALIR S/N");
                    salir = leer.next().charAt(0);
                    break;
                
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (!(salir == 'S'));
        
        
    }
    
}
