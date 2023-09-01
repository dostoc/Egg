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
public class Barco {
    
    protected String matricula;
    protected int eslora;
    protected Date fabricacion;
    protected int costoBase;
  
            

    public Barco() {
    }

    public Barco(String matricula, int eslora, Date fabricacion, int costoBase) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
        this.costoBase = costoBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }
    
    

    @Override
    public String toString() {
        return "[ MAT: " + matricula + " ESLORA: " + eslora + " mt BOTADURA: " + fabricacion.getYear() + " ]";
    }
    
    
    
}
