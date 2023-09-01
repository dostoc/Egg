/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.practica.pkg5;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class G13Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero = (int) ((Math.random() * 500) + 1);
        int counter = 0;
        int opt = 0;
        System.out.println("x"+numero);
        do {
            try {
                System.out.println("ADIVINE EL NUMERO: ");
                counter++;
                opt = Integer.parseInt(leer.nextLine());
                
                if (counter>numero) {
                    System.out.println("mayor");
                }
                 if (counter<numero) {
                    System.out.println("menor");
                }
                
                
            } catch (RuntimeException re) {
                System.out.println("ERROR_: SOLAMENTE PUEDE INGRESAR NUMEROS");
            }
        } while (opt != numero);
        if (opt == numero) System.out.println("GANASTE EN "+counter+" INTENTOS");
        
    }
    }
    

