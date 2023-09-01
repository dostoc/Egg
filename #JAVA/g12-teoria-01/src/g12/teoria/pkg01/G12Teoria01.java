/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12.teoria.pkg01;

import entidad.Animal;
import entidad.Gato;
import entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonak
 */
public class G12Teoria01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal m1 = new Animal();
        Animal m2 = new Gato();
        Animal m3 = new Perro();
        
        List<Animal> listaM = new ArrayList();
        
        listaM.add(m1);
        listaM.add(m2);
        listaM.add(m3);
        
        m1.setSaludo("Saludos");
        
        for (Animal aux : listaM) {
            if (aux instanceof Gato) {
                Gato object = (Gato)aux;
                object.setSaludo("Miau");
                System.out.println(object.getSaludo());
                continue;
                
            }
            if (aux instanceof Perro) {
                Perro object = (Perro)aux;
                object.setSaludo("Guau");
                System.out.println(object.getSaludo());
                continue;
                
            }
            if (aux instanceof Animal) {
                Animal object = (Animal)aux;
                object.setSaludo("Hola");
                System.out.println(object.getSaludo());
                continue;
                
            }
        }
        
    }
    
}
