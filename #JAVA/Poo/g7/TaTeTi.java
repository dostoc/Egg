        m/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progOrienObj;

import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class TaTeTi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0, posicionX = 0, posicionO = 0, vueltas = 0;
        boolean repetir = false, juegoGanado = false;
        String[][] matriz = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        System.out.println("Comienzo del juego: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        do {
            //Turno Jugador X
            vueltas++;
            do {
                repetir = false;
                System.out.print("Jugador X - Ingrese posición: ");
                posicionX = leer.nextInt();
                System.out.println("");
                switch (posicionX) {
                    case 1:
                        if (matriz[0][0] == "1") {
                            matriz[0][0] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }
                        break;
                    case 2:
                        if (matriz[0][1] == "2") {
                            matriz[0][1] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }
                        break;
                    case 3:
                        if (matriz[0][2] == "3") {
                            matriz[0][2] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 4:
                        if (matriz[1][0] == "4") {
                            matriz[1][0] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 5:
                        if (matriz[1][1] == "5") {
                            matriz[1][1] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 6:
                        if (matriz[1][2] == "6") {
                            matriz[1][2] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 7:
                        if (matriz[2][0] == "7") {
                            matriz[2][0] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 8:
                        if (matriz[2][1] == "8") {
                            matriz[2][1] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 9:
                        if (matriz[2][2] == "9") {
                            matriz[2][2] = "X";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    default:
                        System.out.println("El lugar no existe, vuelva a ingresarlo");
                        repetir = true;
                }
            } while (repetir == true);

            //Mostramos el tablero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("");
            
            if (matriz [0][0] == matriz [0][1] && matriz [0][0] == matriz [0][2]) {
                juegoGanado = true;
                System.out.println("El jugador X ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [1][0] == matriz [1][1] && matriz [1][0] == matriz [1][2]) {
                juegoGanado = true;
                System.out.println("El jugador X ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [2][0] == matriz [2][1] && matriz [2][0] == matriz [2][2]) {
                juegoGanado = true;
                System.out.println("El jugador X ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [0][0] == matriz [1][1] && matriz [0][0] == matriz [2][2]) {
                juegoGanado = true;
                System.out.println("El jugador X ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [1][2] == matriz [1][1] && matriz [1][2] == matriz [2][0]) {
                juegoGanado = true;
                System.out.println("El jugador X ha ganado el Tatetí! en la vuelta número " + vueltas);
            }
            //Turno Jugador O
            vueltas++;
            do {
                repetir = false;
                System.out.print("Jugador O - Ingrese posición: ");
                posicionO = leer.nextInt();
                System.out.println("");
                switch (posicionO) {
                    case 1:
                        if (matriz[0][0] == "1") {
                            matriz[0][0] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }
                        break;
                    case 2:
                        if (matriz[0][1] == "2") {
                            matriz[0][1] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }
                        break;
                    case 3:
                        if (matriz[0][2] == "3") {
                            matriz[0][2] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 4:
                        if (matriz[1][0] == "4") {
                            matriz[1][0] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 5:
                        if (matriz[1][1] == "5") {
                            matriz[1][1] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 6:
                        if (matriz[1][2] == "6") {
                            matriz[1][2] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 7:
                        if (matriz[2][0] == "7") {
                            matriz[2][0] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 8:
                        if (matriz[2][1] == "8") {
                            matriz[2][1] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    case 9:
                        if (matriz[2][2] == "9") {
                            matriz[2][2] = "O";
                        } else {
                            System.out.println("El lugar se encuentra ocupado");
                            repetir = true;
                        }

                        break;
                    default:
                        System.out.println("El lugar no existe, vuelva a ingresarlo");
                        repetir = true;
                }
            } while (repetir == true);

            //Mostramos el tablero
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("");
            
            if (matriz [0][0] == matriz [0][1] && matriz [0][0] == matriz [0][2]) {
                juegoGanado = true;
                System.out.println("El jugador O ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [1][0] == matriz [1][1] && matriz [1][0] == matriz [1][2]) {
                juegoGanado = true;
                System.out.println("El jugador O ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [2][0] == matriz [2][1] && matriz [2][0] == matriz [2][2]) {
                juegoGanado = true;
                System.out.println("El jugador O ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [0][0] == matriz [1][1] && matriz [0][0] == matriz [2][2]) {
                juegoGanado = true;
                System.out.println("El jugador O ha ganado el Tatetí! en la vuelta número " + vueltas);
            } else if (matriz [1][2] == matriz [1][1] && matriz [1][2] == matriz [2][0]) {
                juegoGanado = true;
                System.out.println("El jugador O ha ganado el Tatetí! en la vuelta número " + vueltas);
            }

        } while (juegoGanado == false);

    }

}
