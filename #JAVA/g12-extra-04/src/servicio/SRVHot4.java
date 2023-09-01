/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Hot4;
import entidad.Hotel;

/**
 *
 * @author jonak
 */
public class SRVHot4 {
    
     Hot4 hot4 = new Hot4();
     SRVHotel hotel = new SRVHotel();
    
     public Hot4 crearHotel4(){
         Hotel aux =  hotel.crearHotel();
         hot4.setCantCamas(aux.getCantCamas());
         hot4.setCantHabitacion(aux.getCantHabitacion());
         hot4.setCantPisos(aux.getCantPisos());
         hot4.setPrecioHabitacion(aux.getPrecioHabitacion());
         hot4.setGimnasio("a");
         
         return hot4;
     }
    
}
