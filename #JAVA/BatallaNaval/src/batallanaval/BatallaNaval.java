/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batallanaval;

import Entidad.Naval;

/**
 *
 * @author jonak
 */
public class BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Naval juego = new Naval();
      
        juego.inicioTablero();
        juego.meterBarco(); // FALTA VALIDAR ESPACIOS VACIOS
        do {
        juego.verTablero();
        juego.ingresarJugada();
        } while (!(juego.barcoUndido()));
        
        juego.juegoTerminado();
        
    }
    
}
