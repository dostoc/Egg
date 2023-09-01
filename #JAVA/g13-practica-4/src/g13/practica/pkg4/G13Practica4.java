/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.practica.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class G13Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont = 5;
        int num = 0;

        /**
         *
         * Escribir un programa en Java que juegue con el usuario a adivinar un
         * número. La computadora debe generar un número aleatorio entre 1 y
         * 500, y el usuario tiene que intentar adivinarlo. Para ello, cada vez
         * que el usuario introduce un valor, la computadora debe decirle al
         * usuario si el número que tiene que adivinar es mayor o menor que el
         * que ha introducido el usuario. Cuando consiga adivinarlo, debe
         * indicárselo e imprimir en pantalla el número de veces que el usuario
         * ha intentado adivinar el número. Si el usuario introduce algo que no
         * es un número, se debe controlar esa excepción e indicarlo por
         * pantalla. En este último caso también se debe contar el carácter
         * fallido como un intento.
         */
        int numeroAdivin = (int) (Math.random() * 500 + 1);
        System.out.println("Numero Ad: " + numeroAdivin);

        System.out.println("Ingrese un numero (5 intentos):");
        do {

            cont -= 1;
            try {
                num = leer.nextInt();
                if (num> numeroAdivin) {
                    System.out.println("Numero alto");
                }
                if (num< numeroAdivin) {
                    System.out.println("Numero bajo");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: No se puede leer como numero");
                System.out.println("Ingrese nuevamente continuar...");
                leer.nextLine(); // Limpia el buffer del Scanner
                cont += 1;
            } 
            

            
        } while ((num != numeroAdivin)&&(cont!=0));
        
        
        
    }
    
}
