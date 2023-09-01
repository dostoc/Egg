/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Date;

/**
 *
 * @author Jona
 */
public class BarcoMotor extends Barco{
    
    protected int cv;

    public BarcoMotor() {
    }

    public BarcoMotor(int cv) {
        this.cv = cv;
    }

    public BarcoMotor(int cv, String matricula, int eslora, Date fabricacion, int costoBase) {
        super(matricula, eslora, fabricacion, costoBase);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "[ MAT: " + matricula + " ESLORA: " + eslora + " mt BOTADURA: " + fabricacion.getYear() + " CV: "+ cv +" ]";
    }
    
    
    
}
