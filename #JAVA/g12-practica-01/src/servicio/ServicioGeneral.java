/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class ServicioGeneral {
    
    Animal m1 = new Animal();
    Animal m2 = new Perro("Perri", "carne", 5, "Colie");
    Animal m3 = new Gato("Juan", "pescado", 6, "angora");
    Animal m4 = new Caballo("Pedro", "pasto", 7, "malacara");
    
    ArrayList <Animal> listaAnimal  = new ArrayList();
   
    public void agregarLista(){
        listaAnimal.add(m1);
        listaAnimal.add(m2);
        listaAnimal.add(m3);
        listaAnimal.add(m4);
    }
    
    public void mostrarAlimento(){
        for (Animal aux : listaAnimal) {
            aux.Alimentarse();
        }
    }
    
    
    
    
}
