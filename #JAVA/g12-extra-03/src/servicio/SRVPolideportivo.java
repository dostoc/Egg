/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Edificio;
import entidad.EdificioOf;
import entidad.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class SRVPolideportivo {

    /**
     *
     * * Polideportivo con su nombre y tipo de instalación que puede ser
     * Techado o Abierto, esta clase implementará los dos métodos abstractos y
     * los atributos del padre.
     *
     *
     * Polideportivo nos interesa saber cuántos polideportivos son techados y
     * cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al
     * método cantPersonas() y mostrar los resultados de cada edificio de
     * oficinas.
     *
     */
    Scanner leer = new Scanner(System.in);

    SRVEdificio puente;

    public Polideportivo crearPolideportivo() {
        Polideportivo poli = new Polideportivo();
        poli = (Polideportivo) puente.crearEdificio();
        System.out.println("Ingrese nombre del polideportivo: ");
        poli.setNombre(leer.next());
        
        System.out.println("Es techado s/n");
        if (leer.next().equalsIgnoreCase("s")) {
            poli.setTechado(true);
        }else {
            poli.setTechado(false);
        }
        return poli;
    }
    
    
    
    

}
