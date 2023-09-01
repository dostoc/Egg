/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12.extra.pkg04;

import entidad.Hot5;
import servicio.SRVHot5;

/**
 *
 * @author jonak
 */
public class G12Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SRVHot5 puente = new SRVHot5();
        Hot5 h5 = puente.crearHotel5();
        
        System.out.println(h5);
    }
    
}
