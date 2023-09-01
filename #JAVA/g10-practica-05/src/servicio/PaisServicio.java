/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jonak
 */
public class PaisServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Set<Pais> paisSet = new TreeSet();
    
    public Pais crearPais(){
        System.out.print("Pais: ");
        String nuevoP = leer.next();
        return new Pais(nuevoP);
    }
    /**
     *  CUANDO SE CREAM TreeSet hay que tener en cuenta que un objeto nuevo debe ser comprarable con otro que ya este
     En classe de entidad 
     public class Pais ++ implements Comparable<Pais> ++ {
     va a pedir importar metodos abstract
     en el final modificar el override
     
    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareTo(t.getNombre());
    }
    * 
    * notar que esta en uso this.(atributo).Nombre y compara al atributo del nuevo objeto t.getNombre
     */
    public boolean validarNoExistencia(Pais nuevoPais){
    boolean existe = false;
    Iterator<Pais> it = paisSet.iterator();
        while (it.hasNext()) {
            Pais next = it.next();
            if (nuevoPais.equals(next)) {
                existe = true;
                break;
            }
        }
    return existe;
    }
    
    public void crearPaices() {
        do {
            Pais aux = crearPais();
            if (!(validarNoExistencia(aux))){
                paisSet.add(aux);
            } else  {
                System.out.println("Pais ya existente");
            }
            System.out.println("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
    }
    
    public void mostrarSet(){
        for (Pais aux : paisSet) {
            System.out.println(aux);
            
        }
    
    }
    
    public void eliminarPais(Pais aux) {
        Iterator<Pais> it = paisSet.iterator();
        while (it.hasNext()) {
            if (aux.equals(it.next())) {
                it.remove();
            }
        }
    }
    
}
