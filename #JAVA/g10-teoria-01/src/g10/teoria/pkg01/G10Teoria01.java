/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10.teoria.pkg01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import servicio.ListaServicio;

/**
 *
 * @author jonak
 */
public class G10Teoria01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // manos a la obra
        ListaServicio puente = new ListaServicio();
        //puente.fabricaPaices(2);
        //puente.actualizarPais(0);
        //puente.reemplazarPais(1);
        //puente.printArray();
        
        puente.recPrecarga();
        puente.recFore();
        puente.eliminarFori();
        puente.recFore();
        puente.recIterator();
        puente.recFore();
        puente.buscaElimina("lit");
        puente.recFore();
        puente.modificarObjeto("ven", "xxx");
        puente.recFore();
        
    }
    
}
