/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Barco;
import entidad.BarcoMotor;

/**
 *
 * @author Jona
 */
public class SRVBarcoMotor extends SRVBarco{
    
    
    BarcoMotor barcoMotor = new BarcoMotor();
    
    public BarcoMotor crearBarco(){
        Barco barcoAux = super.crearBarco();
        
        barcoMotor.setCostoBase(barcoAux.getCostoBase());
        barcoMotor.setEslora(barcoAux.getEslora());
        barcoMotor.setFabricacion(barcoAux.getFabricacion());
        barcoMotor.setMatricula(barcoAux.getMatricula());
        
        barcoMotor.setCv(20);
        barcoMotor.setCostoBase(moduloBarco());
        return barcoMotor;
    }
    
    /**
     * Esta armado segun (base eslora * 10) + CV
     * @return 
     */
    
    @Override
    public int moduloBarco() {
        int baseBarco = super.moduloBarco();
        baseBarco += barcoMotor.getCv();
        return baseBarco;
    }
}
