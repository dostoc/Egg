
import servicio.PaisServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio puente = new PaisServicio();
        
        puente.cargaPais();
        //puente.cargaManualPais();
        puente.imprimirConjunto();
        puente.ordenarPais();
        puente.conjuntoPaisListaPrint();
        
        
        

    }
    
}
