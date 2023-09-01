
import servicio.PaisServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio puente = new PaisServicio();
        //puente.crearLista();
        //puente.verPaises();
        //puente.ordenarPaisesNombre();
        //puente.ordenarPaisesPoblacion();
        //puente.desordenar();
        
        puente.crearListaHashSet();
        puente.verPaisesHashSet();
        
    }
    
}
