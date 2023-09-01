/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.List;

/**
 *
 * @author jonak
 */
public class Inmueble {

    private List<Integer> cantPropiedades;

    public Inmueble() {
    }

    public Inmueble(List<Integer> cantPropiedades) {
        this.cantPropiedades = cantPropiedades;
    }

    public List<Integer> getCantPropiedades() {
        return cantPropiedades;
    }

    public void setCantPropiedades(List<Integer> cantPropiedades) {
        this.cantPropiedades = cantPropiedades;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "cantPropiedades=" + cantPropiedades + '}';
    }
    
    
    

}
