/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author jonak
 */
public class Animal {
    
         
         public String nombre;
         public String alimento;
         public Integer edad;
         public String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
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
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void hacerRuido(){
        System.out.println("Hola");
    }
    
    
    public void Alimentarse(){
            alimento = "comidita";
    }

  
    
    
    
    /**
         * EJERCICIO ANIMAL Vamos a crear una clase Animal que tenga un método
         * hacerRuido() que devuelva un saludo “Hola”. Luego haremos clase Perro
         * y clase Gato que extiendan de Animal y sobreescriban el método
         * hacerRuido() con el ruido que corresponda a cada uno. Luego, en el
         * main vamos a crear un ArrayList de animales y los siguientes animales
         * Animal a = new Animal(); Animal b = new Perro(); Animal c = new
         * Gato(); Agregaremos a la lista a cada uno y luego, con un for each,
         * recorreremos la lista llamando al método hacerRuido() de cada ítem.
         */
    
    
    
}
