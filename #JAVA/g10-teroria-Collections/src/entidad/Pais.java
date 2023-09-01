/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Objects;

/**
 *
 * @author jonak
 */
public class Pais implements Comparable<Pais> {
    
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
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.polacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.polacion, other.polacion);
    }

    
    
    
    @Override
    public String toString() {
        return "Pais: "+ nombre +" Poblacion: "+ polacion; 

    }
    
    
    //Ordena los paises del junjunto cuando se cargan
    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareTo(t.getNombre());
    }
    
    
    
    

}
