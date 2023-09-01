/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Hot4;
import entidad.Hot5;

/**
 *
 * @author jonak
 */
public class SRVHot5 {
    
    Hot5 hot5 = new Hot5();
    SRVHot4 hot4= new SRVHot4();
    public Hot5 crearHotel5(){
    Hot4 aux = hot4.crearHotel4();
    hot5.setCantCamas(aux.getCantCamas());
    hot5.setCantHabitacion(aux.getCantHabitacion());
    hot5.setCantPisos(aux.getCantPisos());
    hot5.setGimnasio(aux.getGimnasio());
    hot5.setResto(aux.getResto());
    hot5.setPrecioHabitacion(aux.getPrecioHabitacion());
    return hot5;
    }
   
}
