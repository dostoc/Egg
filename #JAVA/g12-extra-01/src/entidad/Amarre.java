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
public class Amarre {
    
    protected Barco b1;
    protected Date fIngreso;
    protected Date fPartida;
    protected int costoAlquiler;

    public Amarre() {
    }

    public Amarre(Barco b1, Date fIngreso, Date fPartida, int costoAlquiler) {
        this.b1 = b1;
        this.fIngreso = fIngreso;
        this.fPartida = fPartida;
        this.costoAlquiler = costoAlquiler;
    }

    public Barco getB1() {
        return b1;
    }

    public void setB1(Barco b1) {
        this.b1 = b1;
    }

    public Date getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public Date getfPartida() {
        return fPartida;
    }

    public void setfPartida(Date fPartida) {
        this.fPartida = fPartida;
    }

    public int getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(int costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }
    
    
    
    
    /**
     * 1. En un puerto se alquilan amarres para barcos de distinto tipo. Para
     * cada Alquiler se guarda: el nombre, documento del cliente, la fecha de
     * alquiler, fecha de devolución, la posición del amarre y el barco que lo
     * ocupará. 
     */
    
}
