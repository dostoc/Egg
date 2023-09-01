/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.practica.pkg01.v2;

import entidad.Persona;

/**
 *
 * @author Jona
 */
public class G13Practica01V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /**
         * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
         * Servicios, a null y tratar de invocar el método esMayorDeEdad() a
         * través de ese objeto. Luego, englobe el código con una cláusula
         * try-catch para probar la nueva excepción que debe ser controlada.
         */
        
        Persona c = new Persona(); // elemento vacio
        c= null;
        
        try {
            System.out.println(c.getName());
        } catch (Exception e) {
            System.out.println("No esta definido");
        }
        
        
        
    }
    
}
