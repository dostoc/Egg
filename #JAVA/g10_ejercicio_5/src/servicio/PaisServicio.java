/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class PaisServicio {

    /**
     * 5. Se requiere un programa que lea y guarde países, y para evitar que se
     * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
     * bucle, se guardará el país en el conjunto y después se le preguntará al
     * usuario si quiere guardar otro país o si quiere salir, si decide salir,
     * se mostrará todos los países guardados en el conjunto. (Recordemos hacer
     * los servicios en la clase correspondiente) Después deberemos mostrar el
     * conjunto ordenado alfabéticamente: para esto recordar cómo se ordena un
     * conjunto. Por último, al usuario se le pedirá un país y se recorrerá el
     * conjunto con un Iterator, se buscará el país en el conjunto y si está en
     * el conjunto se eliminará el país que ingresó el usuario y se
     */
    Scanner leer = new Scanner(System.in);
    HashSet<Pais> conjuntoPais = new HashSet();

    public void cargaPais() {
        //Precarga
        conjuntoPais.add(new Pais("Argentina"));
        conjuntoPais.add(new Pais("Argentina"));
        conjuntoPais.add(new Pais("Paraguay"));
        conjuntoPais.add(new Pais("Brasil"));
        conjuntoPais.add(new Pais("Chile"));
    }

    public void cargaManualPais() {
        System.out.println("Ingrese Pais.....:");
        do {
            conjuntoPais.add(new Pais(leer.next()));
            System.out.println("Desea otro s/n");
            if (leer.next().equalsIgnoreCase("n")) {
                System.out.println("Saliendo ...");
                break;
            }
        } while (true);

    }

    public void imprimirConjunto() {

        for (Pais aux : conjuntoPais) {
            System.out.println(aux);
        }
    }

    //ordenar
    // Es como el conjunto esta definido como HashSet y no matiene un orden es necesario convertirlo a lista
    //1 Crear comparator en entidad (Pais)
    /**
     *
     */
    public static Comparator<Pais> ordenarAlfebeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombrePais().compareTo(o2.getNombrePais());
        }
    };

    //Crear un iterator
    public ArrayList<Pais> conjuntoPaisLista = new ArrayList<>(conjuntoPais);
    public void ordenarPais() {
        Collections.sort(conjuntoPaisLista, ordenarAlfebeticamente);
    }
    
    public void conjuntoPaisListaPrint(){
        for (Pais aux : conjuntoPaisLista) {
            System.out.println("Ordenado: "+ aux);
            
        }
    }

}
