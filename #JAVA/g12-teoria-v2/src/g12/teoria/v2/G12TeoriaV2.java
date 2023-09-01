/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12.teoria.v2;

import entidade.Animal;
import entidade.Caballo;
import entidade.Gato;
import entidade.Perro;
import java.util.ArrayList;
import java.util.List;


public class G12TeoriaV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * 1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro,
         * Gato, Caballo. La clase Animal tendrá como atributos el nombre,
         * alimento, edad y raza del Animal. Crear un método en la clase Animal
         * a través del cual cada clase hija deberá mostrar luego un mensaje por
         * pantalla informando de que se alimenta. Generar una clase Main que
         * realice lo
siguiente:
         */
        
        List<Animal> listaAnimal = new ArrayList();
        
        Animal a = new Animal();
        Animal  m1 = new Gato("gatito", "fideos", 5, "dalmata");
        Animal m2 = new Perro("chiquin", "patata", 6, "siames");
        Animal m3 = new Caballo("juan", "pasto", 19, "africano");
                
        listaAnimal.add(a);
        listaAnimal.add(m1);
        listaAnimal.add(m2);
        listaAnimal.add(m3);
        
        
        for (Animal aux : listaAnimal) {
            aux.Alimentarse();
            System.out.println(aux.getNombre()+ " come " + aux.alimento);
        }
        
        
        
    }
    
}
