/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
contener como atributos, un vector con la palabra a buscar, la cantidad de 
letras encontradas y la cantidad jugadas máximas que puede realizar el usuario.
Definir los siguientes métodos en AhorcadoService
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
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud 
    del vector. Después ingresa la palabra en el vector, letra por letra, quedando 
    cada letra de la palabra en un índice del vector. Y también, guarda la cantidad
    de jugadas máximas y el valor que ingresó el usuario.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego(Ahorcado puente) {
        System.out.print("Ingrese una palabra......: ");
        String palabraBuscada = leer.next();
        System.out.print("Ingrese jugadas maximas..: ");
        puente.setJugadasMax(leer.nextInt());
        char aux[] = new char[palabraBuscada.length()];
        palabraBuscada.getChars(0, palabraBuscada.length(), aux, 0);
        puente.setPalabra(aux);
        System.out.println(Arrays.toString(puente.getPalabra()));
        return puente;
    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    Nota: buscar como se usa el vector.length.
     */
    public int longitud(char[] aux) {
        return aux.length;
    }

    /*
    Método buscar(letra):  este método recibe una letra dada por el usuario y busca
    si la letra ingresada es parte de la palabra o no. También informará si la 
    letra estaba o no.
     */
    public boolean buscar(char aux, Ahorcado puente) {
        char[] aux2 = puente.getPalabra();
        boolean existe = false;

        for (int i = 0; i < longitud(puente.getPalabra()); i++) {
            if (aux2[i] == aux) {
                existe = true;
            }
        }
        return existe;
    }

    /*
    Método encontradas(letra):  que reciba una letra ingresada por el usuario 
    y muestre cuantas letras han sido encontradas y cuántas le faltan. 
    Este método además deberá devolver true si la letra estaba y false si la letra no estaba,
    ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean encontradas(char aux, Ahorcado puente) {
        char[] aux2 = puente.getPalabra();
        int contExiste = 1;
        int contFaltan = 0;
        for (int i = 0; i < longitud(puente.getPalabra()); i++) {
            if (aux2[i] == aux) {
                puente.setLetrasEncontradas((puente.getLetrasEncontradas() + 1));
                aux2[i] = '\u0000';
            }
        }
        contFaltan = puente.getPalabra().length - puente.getLetrasEncontradas();
        System.out.println("La letra esta: " + contExiste + " vez/veces");
        if (contFaltan == 0) {
            System.out.println(".......... GANASTE!!.........");
            return true;
        } else {
            System.out.println("Faltan: " + contFaltan);
            return false;
        }

    }

    /*
    Método intentos(): para mostrar cuántas oportunidades le queda al jugador. 
     */
    
    public boolean intentos(Ahorcado puente, boolean existe) {
        if (!(existe)) {
            puente.setJugadasMax(puente.getJugadasMax() - 1);
        }
        System.out.println("Quedan " + puente.getJugadasMax() + " intentos");
        if (puente.getJugadasMax() == 0) {
            System.out.println("...... FIN DE INTENTOS .....");
            return false;
        } else {
            return true;
        }
    }

    public void juego(Ahorcado juego) {
        crearJuego(juego);
        boolean existe;
        boolean finJuego = false;
        do {
            System.out.println("------------------------------");
            System.out.print("Ingrese una letra a buscar: ");
            char letra = leer.next().charAt(0);
            if (buscar(letra, juego)) {
                if (encontradas(letra, juego)) {
                    break;
                }
                existe = true;
            } else {
                existe = false;
            }
        } while (intentos(juego, existe));
    }

}
