/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jonak
 */
public class Pais {
    
    private String nombre;
    private Integer polacion;

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPolacion() {
        return polacion;
    }

    public void setPolacion(Integer polacion) {
        this.polacion = polacion;
    }

    public Pais(String nombre, Integer polacion) {
        this.nombre = nombre;
        this.polacion = polacion;
    }

    
    @Override
    public String toString() {
        return "Pais: "+ nombre +" Poblacion: "+ polacion; 

    }
    
    
    
    

}
