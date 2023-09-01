/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author jonak
 */
public class Hot4 extends Hotel{
    
    
        protected String gimnasio;
        protected String resto;
        protected int   restoCapacidad;

    public Hot4() {
    }

    public Hot4(String gimnasio, String resto, int restoCapacidad, int cantHabitacion, int cantCamas, int cantPisos, int precioHabitacion) {
        super(cantHabitacion, cantCamas, cantPisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.resto = resto;
        this.restoCapacidad = restoCapacidad;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getResto() {
        return resto;
    }

    public void setResto(String resto) {
        this.resto = resto;
    }

    public int getRestoCapacidad() {
        return restoCapacidad;
    }

    public void setRestoCapacidad(int restoCapacidad) {
        this.restoCapacidad = restoCapacidad;
    }

    
        
        
        
        

        
    
}
