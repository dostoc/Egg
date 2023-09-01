/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class AdopcionesServicio {

    Scanner leer = new Scanner(System.in);

    public Persona cargarPersona() {
        System.out.print("Nombre....:");
        String nombre = leer.next();
        System.out.print("Apellido..:");
        String apellido = leer.next();
        System.out.print("Edad......:");
        Integer edad = leer.nextInt();
        System.out.print("Documento.:");
        Integer documento = leer.nextInt();
        return new Persona(nombre, apellido, edad, documento, null);
    }

    public Perro cargarPerro() {
        System.out.print("Nombre....:");
        String nombre = leer.next();
        System.out.print("Raza......:");
        String raza = leer.next();
        System.out.print("Edad......:");
        Integer edad = leer.nextInt();
        System.out.print("Tamanio...:");
        Double tamanio = leer.nextDouble();
        return new Perro(nombre, raza, edad, tamanio);
    }

    public void adopaMascotasEdad(Persona p1, Persona p2, Perro m1, Perro m2) {
        Perro viejito, jovencito;
        if (m1.getEdad() > m2.getEdad()) {
            viejito = m1;
            jovencito = m2;
        } else {
            viejito = m2;
            jovencito = m1;
        }

        if (p1.getEdad() > p2.getEdad()) {
            p1.setPerro(viejito);
            p2.setPerro(jovencito);
        } else {
            p1.setPerro(jovencito);
            p2.setPerro(viejito);
        }
    }
    
    public void verAdopcion (Persona p1, Persona p2) {
        System.out.println("Persona 1 ....: ");
        System.out.println(p1);
        System.out.println("Persona 2 ....: ");
        System.out.println(p2);
    
    
    }

}
