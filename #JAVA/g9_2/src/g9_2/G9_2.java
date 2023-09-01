/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_2;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/**
 *
 * @author jonak
 */
public class G9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ParDeNumerosServicio puente = new ParDeNumerosServicio();
    ParDeNumeros par = puente.mostrarValores();
    puente.devolverMayor(par);
    }
    
    
    
    
}
