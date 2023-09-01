/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.practica.pkg03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class G13Practica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DivisionNumero e1 = new DivisionNumero();
        
        /**
         * Defina una clase llamada DivisionNumero. En el método main utilice un
         * Scanner para leer dos números en forma de cadena. A continuación,
         * utilice el método parseInt() de la clase Integer, para convertir las
         * cadenas al tipo int y guardarlas en dos variables de tipo int. Por
         * ultimo realizar una división con los dos numeros y mostrar el
         * resultado.
         */
        
        
        /**
         * Todas estas operaciones puede tirar excepciones a manejar, el ingreso
         * por teclado puede 4. causar una excepción de tipo
         * InputMismatchException, el método Integer.parseInt() si la cadena no
         * puede convertirse a entero, arroja una NumberFormatException y
         * además, al dividir un número por cero surge una ArithmeticException.
         * Manipule todas las posibles excepciones utilizando bloques try/catch
         * para las distintas excepciones          *
         */
        
        Scanner leer = new Scanner(System.in);
        
        
        try {
            
        System.out.print("Numero A: ");
        e1.setNumA(Integer.parseInt(leer.next()));
        
        System.out.print("Numero B: ");
        e1.setNumB(Integer.parseInt(leer.next()));
        
        System.out.println(e1.getNumA()/e1.getNumB());
            
        
        } catch (InputMismatchException e) {
            System.out.println("Datos ingresado no se puede leer como numero");
        } catch (NumberFormatException e) {
            System.out.println("Dato ingresado no se puede comvertir a numero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por ");
        } finally {
            System.out.println("Operacion interrumpida");
        }
        
        
        
    }
    
}
