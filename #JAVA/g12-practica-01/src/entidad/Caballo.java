/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Jona
 */
public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String Raza) {
        super(nombre, alimento, edad, Raza);
    }

    @Override
    public void Alimentarse(){
        System.out.println("Este " + this.getClass().toString().substring(14) + " se llama "+ nombre +" y come " + alimento);
    
    }
    
    
}
