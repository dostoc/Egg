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
public class Naval {

    String[][] tablero = new String[10][10];
    int jugadaI;
    int jugadaJ;
    String jugador;
    int contBarco;
    char c = (char) 35;
    char a = (char) 126;
    int tiros = 0;

    //   0  A  B  C  D     (J)
    //   1
    //   2
    //   3
    public Naval() {
    }

    public Naval(int jugadaI, int jugadaJ, String jugador) {
        this.jugador = jugador;
    }

    public void inicioTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = "   ";
            }
        }
        tablero[0][1] = "-A-";
        tablero[0][2] = "-B-";
        tablero[0][3] = "-C-";
        tablero[0][4] = "-D-";
        tablero[0][5] = "-E-";
        tablero[0][6] = "-F-";
        tablero[0][7] = "-G-";
        tablero[0][8] = "-H-";
        tablero[0][9] = "-I-";
        tablero[1][0] = " 1 ";
        tablero[2][0] = " 2 ";
        tablero[3][0] = " 3 ";
        tablero[4][0] = " 4 ";
        tablero[5][0] = " 5 ";
        tablero[6][0] = " 6 ";
        tablero[7][0] = " 7 ";
        tablero[8][0] = " 8 ";
        tablero[9][0] = " 9 ";

    }

    public void meterBarco() {
        int inicio, i, j, aux;

        do {
            inicio = (int) (Math.random() * 2 + 1);
            System.out.println(inicio);
            if (inicio == 1) {                       //vertical
                i = (int) (Math.random() * 9 + 1);     //fila 1 a 10
                j = (int) (Math.random() * 5 + 1);     //fila 1 a 10
                tablero[i][j] = " B ";
                tablero[i][j + 1] = " B ";
                tablero[i][j + 2] = " B ";
            } else {
                i = (int) (Math.random() * 5 + 1);     //fila 1 a 10
                j = (int) (Math.random() * 9 + 1);     //fila 1 a 10
                tablero[i][j] = " B ";
                tablero[i + 1][j] = " B ";
                tablero[i + 2][j] = " B ";
            }
        } while (inicio > 3);

        // aleatorio de x posiciones
        //aleatorio de horizontal o vertical
        // verificar posicion hasta que entre el barco
    }

    public void ingresarJugada() { // ascii a=97
        char aux;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese COLUMNA: ");
        aux = leer.next().charAt(0);
        jugadaJ = aux - 96;
        System.out.print("Ingrese FILA: ");
        jugadaI = leer.nextInt();
        tiros++;
    }

    public boolean barcoUndido() {
        boolean tirito = false;

        switch (tablero[jugadaI][jugadaJ]) {
            case "   ":
                tablero[jugadaI][jugadaJ] = " . ";
                System.out.println("Agua");
                break;
            case " B ":
                tablero[jugadaI][jugadaJ] = " X ";
                contBarco++;
                if (contBarco == 3) {
                    System.out.println("Undido");

                    tirito = true;
                } else {
                    System.out.println("Tocado");
                }
                break;
            case " . ":
                System.out.println("Jugada ya realizada");
                break;
            default:
                break;
        }
        return tirito;
    }

    public void verTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(tablero[i][j]);
                /* SOLO PARA OCULTAR EL BARCO
                if (tablero[i][j].equals(" B ")) {
                    System.out.print("   ");
                }else {
                    System.out.print(tablero[i][j]);
                }
                 */

            }
            System.out.println("");

        }

    }

    public void juegoTerminado() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (tablero[i][j].equals(" X ")) {
                    tablero[i][j] = (" " + c + " ");
                } else {
                    tablero[i][j] = (" " + a + " ");
                }
            }
        }
        System.out.println("........JUEGO TERMINADO.......");
        System.out.println("Cantidad de disparos: " + tiros);
        System.out.println("..............................");
        verTablero();
    }

}
