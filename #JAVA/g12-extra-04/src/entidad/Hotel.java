/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author jonak
 */
public class Hotel {
    
        protected int cantHabitacion;
        protected int cantCamas;
        protected int cantPisos;
        protected int precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitacion, int cantCamas, int cantPisos, int precioHabitacion) {
        this.cantHabitacion = cantHabitacion;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantHabitacion() {
        return cantHabitacion;
    }

    public void setCantHabitacion(int cantHabitacion) {
        this.cantHabitacion = cantHabitacion;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
                
    
}
