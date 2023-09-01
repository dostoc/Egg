/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Hotel;

/**
 *
 * @author jonak
 */
public class SRVHotel {
    Hotel h1 = new Hotel();
    public Hotel crearHotel(){
        Hotel hotel = new Hotel(5, 10, 2, 50);
        return hotel;
    }
    
}
