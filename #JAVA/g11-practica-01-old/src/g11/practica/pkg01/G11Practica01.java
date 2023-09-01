/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11.practica.pkg01;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;
import servicio.AdopcionesServicio;

/**
 *
 * @author Jona
 */
public class G11Practica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1. Realizar un programa para que una Persona pueda adoptar un Perro.
         * Vamos a contar de dos clases.
         * Perro, que tendrá como atributos:
         * nombre, raza, edad y tamaño;
         * Persona con atributos:
         * nombre, apellido, edad, documento y Perro.
         * 
         * Ahora deberemos en el main
         * crear dos Personas y dos Perros. Después, vamos a tener que pensar la
         * lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
         * mostrar desde la clase Persona, la información del Perro y de la
         * Persona.
         */
        
        Scanner leer = new Scanner(System.in);
        AdopcionesServicio puente = new AdopcionesServicio();
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        Perro m1 = new Perro();
        Perro m2 = new Perro();
        
        System.out.println("Persona 1------------------");
        p1= puente.cargarPersona();
        System.out.println("Persona 2------------------");
        p2= puente.cargarPersona();
        
        System.out.println("Perro   1------------------");
        m1= puente.cargarPerro();
        System.out.println("Perro   2------------------");
        m2= puente.cargarPerro();
        
        
        System.out.println("Ejecuta Adopcion ----------");
        puente.adopaMascotasEdad(p1, p2, m1, m2);
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
    
}
