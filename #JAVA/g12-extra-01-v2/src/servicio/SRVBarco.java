/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Amarre;
import entidad.Barco;
import java.time.Instant;
import java.util.Date;


/**
 *
 * @author jonak
 */
public class SRVBarco {
    
    Barco barco = new Barco();
    
    public Barco crearBarco(){
        barco.setEslora(10);
        Date fecha = new Date(2000, 8, 8);
        barco.setFabricacion(fecha);
        barco.setMatricula("AF001");
        barco.setCostoBase(moduloBarco());
        System.out.println("**Barco Creado**");
        return barco;
    }
    
    public int moduloBarco() {
        return (barco.getEslora() * 10);
    }
    
    
}
