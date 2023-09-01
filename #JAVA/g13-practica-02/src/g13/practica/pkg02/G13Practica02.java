/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.practica.pkg02;

/**
 *
 * @author Jona
 */
public class G13Practica02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /**
         * Definir una Clase que contenga algún tipo de dato de tipo array y
         * agregue el código para generar y capturar una excepción
         * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
         */
        
        String[] texto = new String[5];
        
        try {
            System.out.println(texto[6]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de rango");
        }
        
    }
    
}
