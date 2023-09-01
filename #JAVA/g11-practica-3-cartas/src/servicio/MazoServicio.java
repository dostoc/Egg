/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class MazoServicio {

    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> pozo = new ArrayList();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    String[] palos = {"basto", "copa", "oro", "espada"};

    public void crearMazo() {
        for (int i = 0; i < 12; i++) {
            int numero = (i + 1);
            if (i != 8 && i != 9) {
                for (int j = 0; j < palos.length; j++) {
                    String palo = palos[j];
                    Carta nueva = new Carta(palo, numero);
                    mazo.add(nueva);
                }
            }

        }
    }

    public void barajar() {
        Collections.shuffle(mazo);
    }

    public void verMazo() {
        for (Carta aux : mazo) {
            System.out.println(aux);
        }
    }

    /**
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario que
     * no hay más cartas.
     *
     * @return
     */
    
    public void siguienteCarta() {
        if (mazo.size()>1) {
            pozo.add(mazo.get(0));
            mazo.remove(0);
        }else{
            System.out.println("No quedan cartas");
        }
    }
    
    /**
     * cartasDisponibles(): indica el número de cartas que aún se puede
     * repartir.
     */
    
    public void cartasDisponibles(){
        System.out.println("Quedan "+ mazo.size() +" cartas por repartir");
    }
    
    
    /**
     * darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
     * número de cartas. En caso de que haya menos cartas que las pedidas, no
     * devolveremos nada, pero debemos indicárselo al usuario.
     */
    
    public void darCartas(){
        System.out.print("Ingrese numero de cartas a repartir: ");
        int cantidadCartas = leer.nextInt();
        do {
            this.siguienteCarta();
            cantidadCartas=cantidadCartas-1;
        } while (cantidadCartas>0);
    }
    
    /**
     * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
     * salido ninguna indicárselo al usuario
     */
    
    public void cartasMonton(){
        for (Carta aux : pozo) {
            System.out.println(aux);
        }
        
    }
    

    /**
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
     * saca una carta y luego se llama al método, este no mostrara esa primera
     * carta.
     */
    
     public void mostrarBaraja() {
         for (Carta aux : mazo) {
            System.out.println(aux);
        }
     }

}
