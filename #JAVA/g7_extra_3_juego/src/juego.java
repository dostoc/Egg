
import Entidad.Juego;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jonak
 */
public class juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Juego jugador1 = new Juego();
        Juego jugador2 = new Juego();
        
        String jug1, jug2;
        String findejuego = "x";
        jugador1.iniciar();
        jugador2.iniciar();
        
        System.out.println("Ingrese Numeros de su ponente");
        
        do {
            jug1 = jugador1.aJugar(jugador2.getJugador());
            System.out.println(jug1);
            jug2 = jugador2.aJugar(jugador1.getJugador());  
            System.out.println(jug2);
            
         }while (!(jug1.equals("Epetacular!!!") ||  jug2.equals("Epetacular!!!")));
        
            if (jug1.equals("Epetacular!!!") == jug2.equals("Epetacular!!!")) {
                findejuego = "EMPATE!!!!";
            }

            if (jug1.equals("Epetacular!!!") == (!(jug2.equals("Epetacular!!!")))) {
                findejuego = "GANADOR " + jugador1.getJugador();
            }
            if (jug2.equals("Epetacular!!!") == (!(jug1.equals("Epetacular!!!")))) {
                findejuego = "GANADOR " + jugador2.getJugador();
            }
        
        System.out.println("********* " + findejuego + " **********");
    
    }
    
}
