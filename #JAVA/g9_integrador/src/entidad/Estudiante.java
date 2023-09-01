/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Jona
 */
public class Estudiante {
    
    /*
    Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y nota (representando la nota obtenida en el final). 
    */ 
    
    private String nombre;
    private double nota;
    private Estudiante[] arrayEstudiantes = new Estudiante[8];

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Estudiante[] getArrayEstudiantes() {
        return arrayEstudiantes;
    }

    public void setArrayEstudiantes(Estudiante[] arrayEstudiantes) {
        this.arrayEstudiantes = arrayEstudiantes;
    }
    
    
    
}
