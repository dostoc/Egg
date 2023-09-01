/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author jonak
 */
public class Comparadores {
    
    public static Comparator<Pais> OrdenarPorNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
    public static Comparator<Pais> OrdenarPorPoblacion = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPolacion().compareTo(t1.getPolacion());
        }
    };
    
}
