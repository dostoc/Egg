/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8_extra_2v2;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServicio puente = new RaicesServicio();
        Raices rz = puente.constructor(); 
        puente.obtenerRaices(rz);
    }
    
}
