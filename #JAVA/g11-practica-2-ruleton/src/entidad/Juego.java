package entidad;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {

    /**
     * Clase Juego: esta clase posee los siguientes atributos: Jugadores
     * (conjunto de Jugadores) y Revolver
     */
    ArrayList<Jugador> JugadoresLista = new ArrayList();
    Revolver r2 = new Revolver();

    /**
     * llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe
     * los jugadores y el revolver para guardarlos en los atributos del juego.
     */
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        JugadoresLista = jugadores;
        r2 = r;
    }

    /**
     * • ronda(): cada ronda consiste en un jugador que se apunta con el
     * revolver de agua y aprieta el gatillo. Sí el revolver tira el agua el
     * jugador se moja y se termina el juego, sino se moja, se pasa al siguiente
     * jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al
     * final del juego, se debe mostrar que jugador se mojó. Pensar la lógica
     * necesaria para realizar esto, usando los atributos de la clase Juego. *
     */
    public void ronda() {
        boolean salir = false;
        int cont = 0;
        Jugador j1 = new Jugador();
        do {
            System.out.print("Turno Jugador " + ((JugadoresLista.get(cont)).getId() + 1));
            
            if (j1.disparo(r2)) {
                System.out.println(": Jugador mojado");
                JugadoresLista.get(cont).setMojado(true);
                break;
            } else {
                System.out.println(": Safo!");
            }
            cont++;
            if (cont == JugadoresLista.size()) {
                cont = 0;               
            }
        } while (!(salir));

    }
}
