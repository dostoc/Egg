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
    
    protected int nroMastil;

    public BarcoVelero() {
    }

    public BarcoVelero(int nroMastil) {
        this.nroMastil = nroMastil;
    }

    public BarcoVelero(int nroMastil, String matricula, int eslora, Date fabricacion, int costoBase) {
        super(matricula, eslora, fabricacion, costoBase);
        this.nroMastil = nroMastil;
    }

    public int getNroMastil() {
        return nroMastil;
    }

    public void setNroMastil(int nroMastil) {
        this.nroMastil = nroMastil;
    }

    
    
    @Override
    public String toString() {
        return "[ MAT: " + matricula + " ESLORA: " + eslora + " mt BOTADURA: " + fabricacion.getYear() + " MASTILES: "+ nroMastil +" ]";
    }
    
    
    
    
}
