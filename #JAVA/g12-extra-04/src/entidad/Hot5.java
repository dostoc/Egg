/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author jonak
 */
public class Hot5 extends Hot4{
    
    
     protected int saloneCant;
        protected int suitCant;
        protected int limoCant;

    public Hot5() {
    }

    public Hot5(int saloneCant, int suitCant, int limoCant, String gimnasio, String resto, int restoCapacidad, int cantHabitacion, int cantCamas, int cantPisos, int precioHabitacion) {
        super(gimnasio, resto, restoCapacidad, cantHabitacion, cantCamas, cantPisos, precioHabitacion);
        this.saloneCant = saloneCant;
        this.suitCant = suitCant;
        this.limoCant = limoCant;
    }

    public int getSaloneCant() {
        return saloneCant;
    }

    public void setSaloneCant(int saloneCant) {
        this.saloneCant = saloneCant;
    }

    public int getSuitCant() {
        return suitCant;
    }

    public void setSuitCant(int suitCant) {
        this.suitCant = suitCant;
    }

    public int getLimoCant() {
        return limoCant;
    }

    public void setLimoCant(int limoCant) {
        this.limoCant = limoCant;
    }
    
    
}
