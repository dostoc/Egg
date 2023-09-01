/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Date;

/**
 *
 * @author jonak
 */
public class BarcoVelero extends Barco{
    
    //• Número de mástiles para veleros. 
    
    protected int mastiles;

    public BarcoVelero(int mastiles) {
        this.mastiles = mastiles;
    }

    public BarcoVelero(int mastiles, String matricula, int eslora, Date fabricacion) {
        super(matricula, eslora, fabricacion);
        this.mastiles = mastiles;
    }

    public BarcoVelero() {
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    
    
}
