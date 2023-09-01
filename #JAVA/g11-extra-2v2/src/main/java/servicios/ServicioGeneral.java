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
    ArrayList<Espectador> listaEspectadoresAux= new ArrayList();

    String[][] matrizSala = new String[8][6];
    Espectador[][] matrizEspectador = new Espectador[8][6];

    Pelicula pelicula = new Pelicula();
    Cine cine = new Cine();
    
    public void crearCine(){
        cine = new Cine(pelicula, 50, matrizEspectador);
    }

    public void crearPelicula() {

        pelicula.setTitulo("Batman");
        pelicula.setDirector("Tim Burtom");
        pelicula.setEdadMinima(18);
        pelicula.setDuracion(120);

    }

    public Espectador crearEspectador() {
        Espectador espectador = new Espectador();
        espectador.setNombre("persona-" + rnd.nextInt(200));
        espectador.setEdad(rnd.nextInt(120));
        espectador.setDineroDisponible(rnd.nextInt()* 100);

        return espectador;

    }

    public Espectador crearEspectadorManual() {
        Espectador espectador = new Espectador();
        System.out.println("Ingreso de Espectador");
        System.out.print("Nombre......: ");
        espectador.setNombre(leer.next());
        System.out.print("Edad........: ");
        espectador.setEdad(leer.nextInt());
        System.out.print("Dinero......$ ");
        espectador.setDineroDisponible(leer.nextInt());
        return espectador;
    }

    public void crearLista() {
        System.out.print("Cantidad de especadores random: ");
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

    
    /** ESTO NO ESTA ANDANDO **/
    /***
     * Termina generando error al querer completar la lista de especadores autixilar
     * la solucion fue crear un elemento auxiliar para tamaño y objeto 
     */
    public void crearListaPersonasConDinero() {
        Espectador auxiliar;
        int cantidadEspectadores = listaEspectadores.size();
        System.out.println("Cola...: " + cantidadEspectadores  );
        for (int i = 0; i < cantidadEspectadores; i++) {
            auxiliar = listaEspectadores.get(i);
            if (auxiliar.getDineroDisponible() >= cine.getCostoEntrada() && auxiliar.getEdad() >= pelicula.getEdadMinima()) {
                listaEspectadoresAux.add(auxiliar);
            }
        }
        int diferencia = listaEspectadores.size()-listaEspectadoresAux.size();
        System.out.println("No cumplen con los requisitos: " + diferencia);
    }
    /*--------------------------*/
    

    public boolean estaDisponible(int i, int j) {
        return (matrizEspectador[i][j] == null);
    }

    public void rellenarSalaEspectadores() {
        int fila;
        int columna;
        int cont = 0;
        int colaEntrada = listaEspectadoresAux.size();
        do {
            fila = rnd.nextInt(8);
            columna = rnd.nextInt(6);
            if (estaDisponible(fila, columna)) {
                matrizEspectador[fila][columna] = listaEspectadoresAux.get(cont);
            }
            cont++;

        } while (cont < colaEntrada);
    }

    public void mostrarSala() {
        System.out.println("Sala: ");
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (estaDisponible(i, j)) {
                    System.out.print(matrizSala[i][j] + "    ");
                } else {
                    System.out.print(matrizSala[i][j] + " X  ");
                }
            }
            System.out.println();
        }
    }
    
    
    
        public void mostrarCineCompletoXNombre() {
        System.out.println("Sala: ");
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (estaDisponible(i, j)) {
                    System.out.print(matrizSala[i][j] + "               ");
                } else {
                    System.out.print(matrizSala[i][j] + " " + listaEspectadoresAux.get(i).getNombre()+"  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarCine() {
        System.out.println(cine);
        System.out.println(pelicula);
        mostrarSala();
    }

    /*-------------------------------------------------------------------------*/
    public boolean conultarButaca(String butacaColumna, int fila) {
        return estaDisponible(fila, enumColumna(butacaColumna));
    }

    public int enumColumna(String butacaColumna) {
        Butaca butaca = Butaca.valueOf(butacaColumna);
        int columna = butaca.ordinal();
        return columna;
    }

    public void agregarEspectadores() {
        System.out.println("Agregar espectador (S)si ...cualquier letra para continuar");
        if (leer.next().equalsIgnoreCase("s")) {
        do {
            Espectador espectaAux = crearEspectadorManual();
            System.out.println("Consulta de disponiblidad de butaca");
            System.out.print("Columna(Letra).....: ");
            String butacaColumna = leer.next().toUpperCase();
            System.out.print("Fila(Numero).......: ");
            int fila = leer.nextInt() - 1;

            if (conultarButaca(butacaColumna, fila)) {
                matrizEspectador[enumColumna(butacaColumna)][fila] = espectaAux;
                System.out.println("Asiento asignado");
            } else {
                System.out.println("Asiento ocupado...");
            }
            mostrarSala();
            System.out.println("Presione (S).Salir  o (C).Continuar carga");
            if (leer.next().equalsIgnoreCase("s")) {
                System.out.println("Saliendo ...");
                break;}
            
        } while (true);
        
        }
    }

    /**
     * ************************************************************************
     */
    /**
     * BUCLE DE CARGA DE NUEVOS ESPECTADORES
     */

    public void cineServicoGeneral() {
        crearCine();
        crearPelicula();
        crearSala();
        crearLista();
        crearListaPersonasConDinero();
        rellenarSalaEspectadores();
        mostrarCine();
        /**
         * Genera una lista de espectadores random y de esos selecciona los que
         * tienen dinero suficinete
         */
        agregarEspectadores();
        /**
         * Pelicula - Sala - Cine - Ocupantes
         */
        mostrarCineCompletoXNombre();
        
    }
}
