/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11.extra.pkg2.cine;

import entidad.Cine;
import java.util.Scanner;
import servicio.CineServicio;

/**
 *
 * @author Jona
 */
public class G11Extra2Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CineServicio puente = new CineServicio();
        Cine cin = new Cine();
        
        cin=puente.crearCine();
        puente.mostrarCine(cin);
        /*
        
         boolean salir = true;
        do {
        System.out.println("MENU");
        System.out.println("1 )  ");
        System.out.println("2 )  ");
        System.out.println("3 )  ");
        System.out.println("4 )  ");
        System.out.println("5 )  ");
        System.out.println("6 ). Salir  ");
        
        System.out.println("....opcion: ");
        switch (leer.nextInt()) {
            case 1:
                puente.
                break;
            case 2:
                //
                break;
            case 3:
                 //
                break;
            case 4:
                //
                break;
            case 5:
                //
                break;
            case 6:
                System.out.println("Saliendo.....");
                salir = false;
                break;
            default:
                System.out.println("Opcion no valida");
        }

         } while (salir);
        */
        
        
    }
    
}
