/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author jonak
 */
public class Dni {
    private int numero;
    private char serie;

    public Dni() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public Dni(int numero, char serie) {
        this.numero = numero;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Dni{" + "numero=" + numero + ", serie=" + serie + '}';
    }
    
}
