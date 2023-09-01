/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author jonak
 */
public class Ahorcado {
    private char[] palabra;
    private int jugadasMax;
    private int letrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int jugadasMax, int letrasEncontradas) {
        this.palabra = palabra;
        this.jugadasMax = jugadasMax;
        this.letrasEncontradas = letrasEncontradas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    
    
    
}
