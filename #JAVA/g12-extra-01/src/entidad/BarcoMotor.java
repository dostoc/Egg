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
public class BarcoMotor extends Barco{
    
    // * • Potencia en CV para barcos a motor. 
    
    protected int cv;

    public BarcoMotor() {
    }

    public BarcoMotor(int cv) {
        this.cv = cv;
    }

    public BarcoMotor(int cv, String matricula, int eslora, Date fabricacion) {
        super(matricula, eslora, fabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    
    
    
    
}
