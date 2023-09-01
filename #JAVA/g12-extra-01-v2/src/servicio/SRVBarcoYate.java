/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Barco;
import entidad.BarcoMotor;
import entidad.BarcoVelero;
import entidad.BarcoYate;

/**
 *
 * @author Jona
 */
public class SRVBarcoYate extends SRVBarco{
    
    
    BarcoYate barcoYate = new BarcoYate();
    SRVBarco b;
    
    public BarcoYate crearBarco(){
        Barco barcoAux = super.crearBarco();
        
        barcoYate.setCostoBase(barcoAux.getCostoBase());
        barcoYate.setEslora(barcoAux.getEslora());
        barcoYate.setFabricacion(barcoAux.getFabricacion());
        barcoYate.setMatricula(barcoAux.getMatricula());
        
        barcoYate.setCv(6);
        barcoYate.setNumeroCamarotes(10);
        
        barcoYate.setCostoBase(moduloBarco());
        return barcoYate;
    }

    @Override
    public int moduloBarco() {
        int baseBarco = super.moduloBarco();
        baseBarco += (barcoYate.getCv()+barcoYate.getNumeroCamarotes());
        return baseBarco;
    }
}
