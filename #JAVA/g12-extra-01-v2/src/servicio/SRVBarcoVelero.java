/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Barco;
import entidad.BarcoVelero;
import java.util.Date;

/**
 *
 * @author jonak
 */
public class SRVBarcoVelero extends SRVBarco {
    
    BarcoVelero barcoVelero = new BarcoVelero();
    
    public BarcoVelero crearBarco(){
        Barco barcoAux = super.crearBarco();
        
        barcoVelero.setCostoBase(barcoAux.getCostoBase());
        barcoVelero.setEslora(barcoAux.getEslora());
        barcoVelero.setFabricacion(barcoAux.getFabricacion());
        barcoVelero.setMatricula(barcoAux.getMatricula());
        
        barcoVelero.setNroMastil(6);
        barcoVelero.setCostoBase(moduloBarco());
        return barcoVelero;
    }

    @Override
    public int moduloBarco() {
        int baseBarco = super.moduloBarco();
        baseBarco += barcoVelero.getNroMastil();
        return baseBarco;
    }
    
    
    
    
}
