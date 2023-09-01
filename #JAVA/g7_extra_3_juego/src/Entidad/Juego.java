/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer jugador
elige un número y el segundo jugador intenta adivinarlo. El segundo jugador
tiene un número limitado de intentos y recibe una pista de "más alto" o 
"más bajo" después de cada intento. El juego termina cuando el segundo 
jugador adivina el número o se queda sin intentos. Registra el número 
de intentos necesarios para adivinar el número y el número de veces que
cada jugador ha ganado.

*/
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class Juego {
    private int numOrigen;
    private String jugador;

    public Juego() {
    }

    public Juego(int numero, String Jugador) {
        this.numOrigen = numero;
        this.jugador = Jugador;
    }

    public String getJugador() {
        return jugador;
    }

    public int getNumero() {
        return numOrigen;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public void setNumero(int numero) {
        this.numOrigen = numero;
    }
    
    
    
    public void iniciar() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Nombre de jugador: ");
            jugador = leer.next();
        System.out.print(jugador + " ingrese numero: ");
            numOrigen = leer.nextInt();
    }
    
    public String aJugar(String nombre){
        Scanner leer = new Scanner(System.in);
        int aux = 0;
        String resultado;
        System.out.print(nombre + "..Ingrese numero de su oponente...: ");
            aux = leer.nextInt();
            resultado = distancia(numOrigen, aux);
        return resultado;
    }
    
    public String distancia(int numOrigen, int aux2) {
        int aux = numOrigen - aux2;
        String distancia = "";
        
        if (aux == 0) {
            distancia = "Epetacular!!!";
        }
        if( aux < 0) {
            distancia = "mas bajo";
        }
        if (aux > 0) {
            distancia = "mas alto";
        }
        return distancia;
        
    }
    
    

}

    
    
    

