
import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jonak
 */
public class Mains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosServicio puente = new ParDeNumerosServicio();
        ParDeNumeros par = puente.mostrarValores();
        
        puente.calcularPotencia(par);
        puente.calcularRaiz(par);
    }
    
}
