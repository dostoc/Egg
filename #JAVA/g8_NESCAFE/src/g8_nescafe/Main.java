/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8_nescafe;

import entidad.Cafetera;
import servicio.CafeteraServicio;

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CafeteraServicio puente = new CafeteraServicio();
    Cafetera nescafecito = puente.iniciarCafetera();
    }
    
    
    
}
