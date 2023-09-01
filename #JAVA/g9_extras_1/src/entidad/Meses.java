/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author jonak
 */
public class Meses {
    private String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesX = meses[(int)(Math.random()*11)];

    public Meses() {
    }

    public Meses(String mesX) {
        this.mesX = mesX;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesX() {
        return mesX;
    }

    public void setMesX(String mesX) {
        this.mesX = mesX;
    }

        
       
}
