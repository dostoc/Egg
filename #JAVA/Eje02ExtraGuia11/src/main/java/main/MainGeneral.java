/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import servicios.ServicioGeneral;

/**
 *
 * @author fer_c
 */
public class MainGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioGeneral sg = new ServicioGeneral();
        Scanner leer = new Scanner(System.in);
        
        
        sg.crearLista();
        sg.crearPelicula();
        sg.crearSala();
        sg.rellenarSalaEspectadores();
        sg.mostrarSala();
        // Cine esta creado en el servicio
        //sg.crearListaPersonasConDinero();
        
        //sg.mostrarCine();
//        do {
//            sg.conultarButaca();
//            System.out.println("Desea Salir (s) o puse cualquier letra...");
//            String palabra = leer.next();
//            if (palabra.equalsIgnoreCase("s")) {System.out.println("Saliendo ...");break;}
//        } while (true);
        
        
    }
    
}
