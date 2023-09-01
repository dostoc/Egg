/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author jonak
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Dni documento; // queda relacionado con la clase mascota
    
    private Inmueble cantInmuebles;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Inmueble cantInmuebles, Dni documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantInmuebles = cantInmuebles;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Inmueble getCantInmuebles() {
        return cantInmuebles;
    }

    public void setCantInmuebles(Inmueble cantInmuebles) {
        this.cantInmuebles = cantInmuebles;
    }

    public Dni getDocumento() {
        return documento;
    }

    public void setDocumento(Dni documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", cantInmuebles=" + cantInmuebles + '}';
    }

    
    
    




    
    
    
}
