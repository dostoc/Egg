/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class Juego {
    String [][] tablero = new String[3][3];
    int jugada;
    String jugador;
    int jugadaI;
    int jugadaJ;

    public Juego() {
    }

    public Juego(int jugada, String jugador) {
        this.jugada = jugada;
        this.jugador = jugador;
    }
    
    public void inicioJugador(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de jugador: ");
        jugador = leer.next();
        
        
    }
    public void enviarJugada() {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese jugada: ");
        System.out.print("COLUMNA: ");
        jugadaJ=leer.nextInt();
        
        System.out.print("FILA: ");
        jugadaI=leer.nextInt();
        
    
    }
    
    
    
    public String[][] verJugada(){
        
        System.out.println("PARTIDA: ");
        printTablero();
        
    
        return tablero;
    }
    
    public void printTablero(){
        System.out.println("PARTIDA: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }

    }
    
    
   
    
    
}
