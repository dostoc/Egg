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
public class BarcoYate extends Barco{
    
    protected int cv;
    protected int numeroCamarotes;

    public BarcoYate(int cv, int numeroCamarotes) {
        this.cv = cv;
        this.numeroCamarotes = numeroCamarotes;
    }

    public BarcoYate(int cv, int numeroCamarotes, String matricula, int eslora, Date fabricacion, int costoBase) {
        super(matricula, eslora, fabricacion, costoBase);
        this.cv = cv;
        this.numeroCamarotes = numeroCamarotes;
    }

    public BarcoYate() {
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }
    
    @Override
    public String toString() {
        return "[ MAT: " + matricula + " ESLORA: " + eslora + " mt BOTADURA: " + fabricacion.getYear() + " CV: "+ cv + " CAMAROTES: "+ numeroCamarotes + " ]";
    }
    
}
