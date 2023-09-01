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
public class BarcoYate extends Barco {
    
    //  * • Potencia en CV y número de camarotes para yates de lujo.
    
    protected int cv;
    protected int camarotes;

    public BarcoYate() {
    }
    
    public BarcoYate(int cv, int camarotes) {
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public BarcoYate(int cv, int camarotes, String matricula, int eslora, Date fabricacion) {
        super(matricula, eslora, fabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    

    
    
    
}
