/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author fer_c
 */
public class Cine {
    
    private Pelicula pelicula;
    private Double costoEntrada;
    private Espectador[][] espectador;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Double costoEntrada, Espectador[][] espectador) {
        this.pelicula = pelicula;
        this.costoEntrada = costoEntrada;
        this.espectador = espectador;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(Double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    public Espectador[][] getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador[][] espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", costoEntrada=" + costoEntrada + ", espectador=" + espectador + '}';
    }
    
    
    
    
    

    
    
    
}
