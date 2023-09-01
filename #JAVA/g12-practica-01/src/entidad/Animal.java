/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Jona
 */
public class Animal {
    
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String Raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String Raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.Raza = Raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    
    public void Alimentarse(){
        System.out.println("Este " + this.getClass().toString().substring(14) + " se llama "+ nombre +" y come " + alimento);
    
    }
    
}
