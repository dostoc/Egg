/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Butaca;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer_c
 */
public class ServicioGeneral {

    Scanner leer = new Scanner(System.in);
    Random rnd = new Random();

    ArrayList<Espectador> listaEspectadores = new ArrayList();
    ArrayList<Espectador> listaEspectadoresAux;

    String[][] matrizSala = new String[8][6];
    Espectador[][] matrizEspectador = new Espectador[8][6];

    Pelicula pelicula = new Pelicula();
    Cine cine = new Cine(pelicula, 50.00, matrizEspectador);

    
   
   public void crearPelicula() {

        pelicula.setTitulo("Batman");
        pelicula.setDirector("Tim Burtom");
        pelicula.setEdadMinima(18);
        pelicula.setDuracion(120);

    }

    public Espectador crearEspectador() {
        Espectador espectador = new Espectador();
        espectador.setNombre("persona-" + rnd.nextInt(99) * 100);
        espectador.setEdad(rnd.nextInt(120));
        espectador.setDineroDisponible(rnd.nextDouble() * 100);

        return espectador;

    }

    public void crearLista() {
        System.out.println("Ingrse la cantidad de espectadores");
        int aux = leer.nextInt();
        for (int i = 0; i < aux; i++) {
            listaEspectadores.add(crearEspectador());
        }
        System.out.println(listaEspectadores);

    }

    public void crearSala() {
        Butaca butaca = Butaca.A;
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 8; i++) {
                matrizSala[i][j] = butaca.toString() + (i + 1);
            }
            butaca = obtenerSiguienteButaca(butaca);
        }

    }
    public static Butaca obtenerSiguienteButaca(Butaca butaca) {
        if (butaca.ordinal() < Butaca.values().length - 1) {
            return Butaca.values()[butaca.ordinal() + 1];
        } else {
            return Butaca.values()[0];
        }
    }
    
    public void crearListaPersonasConDinero(){
        for (int i = 0; i < listaEspectadores.size(); i++) {
            if (listaEspectadores.get(i).getDineroDisponible()>= cine.getCostoEntrada())
                listaEspectadoresAux.add(listaEspectadores.get(i));
        }
    }
    
     public boolean estaDisponible(int i, int j){
        return (matrizEspectador[i][j]==null);
    }

    

    public void rellenarSalaEspectadores() {
        int fila;
        int columna;
        int cont = 0;
        int colaEntrada = listaEspectadores.size();
        do {
            fila = rnd.nextInt(8);
            columna = rnd.nextInt(6);

            if (estaDisponible(fila, columna)) {
                matrizEspectador[fila][columna] = listaEspectadores.get(cont);
                matrizSala[fila][columna] = matrizSala[fila][columna] + " X    ";
            }
            cont++;

        } while (cont < colaEntrada);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (estaDisponible(i,j)){
                    matrizSala[i][j] = matrizSala[i][j] + "      ";
                }
            }
            
        }
    }


    public void mostrarSala() {
        System.out.println("Sala: ");
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrizSala[i][j]);
            }
            System.out.println();
        }
    }

    public void mostrarCine() {
        mostrarSala();
        System.out.println(cine);
        System.out.println(pelicula);
    }

    /*-------------------------------------------------------------------------*/
    public void conultarButaca() {
        System.out.println("Consulta de disponiblidad de butaca");
        System.out.print("Columna(Letra).....: ");
        String butacaColumna = leer.next().toUpperCase();
        Butaca butaca = Butaca.valueOf(butacaColumna);
        int columna = butaca.ordinal();

        System.out.print("Fila(Numero).......: ");
        int fila = leer.nextInt() - 1;

        System.out.println(matrizSala[fila][columna]);

        if (matrizEspectador[fila][columna] == null) {
            System.out.println("Asiento libre");
        } else {
            System.out.println("Asiento ocupado");

        }

    }

}
