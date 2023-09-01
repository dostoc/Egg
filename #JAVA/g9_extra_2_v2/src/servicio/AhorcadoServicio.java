/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class AhorcadoServicio {

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
    máxima. Con la palabra del usuario, pone la longitud de la palabra, como 
    la longitud del vector. Después ingresa la palabra en el vector, letra por 
    letra, quedando cada letra de la palabra en un índice del vector. 
    Y también, guarda la cantidad de jugadas máximas y el valor que ingresó 
    el usuario.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Ahorcado crearJuego() {
        Ahorcado puente = new Ahorcado();
        System.out.println("Ingrese palabra");
        String auxPalabra = leer.next();
        char[] palabraArray = auxPalabra.toCharArray();
        puente.setPalabraArray(palabraArray);
        System.out.println("Ingrese jugadas maximas");
        puente.setJugadasMaximas(leer.nextInt());
        return puente;
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.
     */
    private void longitud(Ahorcado puente) {
        System.out.println("La palabra tiene " + (puente.getPalabraArray().length));
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y
    busca si la letra ingresada es parte de la palabra o no. 
    También informará si la letra estaba o no.
     */
    public boolean buscar(Ahorcado puente, String letra) {
        boolean aux2 = false;
        char[] aux = puente.getPalabraArray();
        for (int i = 0; i < puente.getPalabraArray().length; i++) {
            if (aux[i] == letra.charAt(0)) {
                aux2 = true;
            }
        }
        return aux2;
    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario 
    y muestre cuantas letras han sido encontradas y cuántas le faltan. 
    Este método además deberá devolver true si la letra estaba y false si la 
    letra no estaba, ya que, cada vez que se busque una letra que no esté, se 
    le restará uno a sus oportunidades.
     */
    public boolean encontradas(Ahorcado puente, String letra) {
        int cont = 0;
        char[] aux = puente.getPalabraArray();
        if ((this.buscar(puente, letra))) {
            for (int i = 0; i < puente.getPalabraArray().length; i++) {
                if (aux[i] == letra.charAt(0)) {
                    puente.setLetrasEncontradas(puente.getLetrasEncontradas() + 1);
                }
            }
            
        }
        System.out.println("Encotradas:" + puente.getLetrasEncontradas());
        System.out.println("Faltan:" + (puente.getPalabraArray().length - puente.getLetrasEncontradas()));

        return this.buscar(puente, letra);
    }
    
    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    */
    
    public void intentos(Ahorcado puente, String letra){
        if (!(this.buscar(puente, letra))) {
            puente.setJugadasMaximas(puente.getJugadasMaximas()-1);
            System.out.println("Te quedan " + puente.getJugadasMaximas() + "intentos!!!");
        }
    }
    
    /*
    Método juego(): el método juego se encargará de llamar todos los métodos 
    previamente mencionados e informará cuando el usuario descubra toda la palabra 
    o se quede sin intentos. Este método se llamará en el main.
    
    */
    
    public void juego(){
        Ahorcado juego = this.crearJuego();
        this.longitud(juego);
        do {
            System.out.print("Ingrese una letra: ");
            String letra = leer.next();
            if (this.buscar(juego, letra)) {
                this.encontradas(juego, letra);
            } else{
                this.intentos(juego, letra);
            }
        } while (juego.getJugadasMaximas()>0 && juego.getLetrasEncontradas() != juego.getPalabraArray().length);
    }
    
}
