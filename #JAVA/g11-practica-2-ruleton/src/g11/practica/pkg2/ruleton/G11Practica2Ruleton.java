/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11.practica.pkg2.ruleton;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class G11Practica2Ruleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revolver rev = new Revolver();
        Jugador jug = new Jugador();
        Juego jueguito = new Juego();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        ArrayList<Jugador> ListaJugadores = new ArrayList();
        
        System.out.print("Ingrese cantidad de jugadores (max 6): ");
        int jugadores = leer.nextInt();
        if (jugadores>7) {
            System.out.println("Juegan 6 (-.-) " + (jugadores-6)+ " miran...");
            jugadores = 6;            
        }
        for (int i = 0; i < jugadores; i++) {
            ListaJugadores.add(new Jugador(i, false));
        }
        System.out.println(ListaJugadores);
        
        jueguito.llenarJuego(ListaJugadores, rev);
        
        System.out.println("************ ESTADO REVOLVER ***************");
        System.out.println("Posicion Agua: " + rev.getPosicionAgua());
        System.out.println("Posicion Actual: " + rev.getPosicionActual());
        System.out.println("*************** A JUGAR ********************");
        
        
        jueguito.ronda();
        System.out.println("*********************************************");
        System.out.println(ListaJugadores);
             
        
    }
    
}
