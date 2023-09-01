/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Jona
 */
public class Cine {
    
    private Pelicula peli;
    private Espectador[][] espec;
    private Double costoEntrada;

    public Cine() {
    }

    public Cine(Pelicula peli, Espectador[][] espec, Double costoEntrada) {
        this.peli = peli;
        this.espec = espec;
        this.costoEntrada = costoEntrada;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Espectador[][] getEspec() {
        return espec;
    }

    public void setEspec(Espectador[][] espec) {
        this.espec = espec;
    }

    public Double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(Double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }
    
    

}
