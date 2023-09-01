/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Pais;
import utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jonak
 */
public class PaisServicio {
    
    ArrayList<Pais> listaPaises = new ArrayList();
    
    public void crearLista(){
        listaPaises.add(new Pais("Arg",10));
        listaPaises.add(new Pais("Lit",15));
        listaPaises.add(new Pais("Rum",67));
        listaPaises.add(new Pais("Fin",8));
        listaPaises.add(new Pais("Din",14));
        listaPaises.add(new Pais("Uru",36));
    }
    public void verPaises(){
        System.out.println("---------------------");
        listaPaises.forEach((e)->System.out.println(e));
    }
    
    // USO DE COMPARADORES - IMPORTANTE COLLECTION.SORT MODIFICA LA COLECCION
    // Hay un package Utilidades que contiene los comparadores dentro de una clase
    public void ordenarPaisesNombre() {
        Collections.sort(listaPaises, Comparadores.OrdenarPorNombre);
        this.verPaises();
    }
    
    public void ordenarPaisesPoblacion() {
        Collections.sort(listaPaises, Comparadores.OrdenarPorPoblacion);
        this.verPaises();
    }
    
    public void desordenar() {
        Collections.shuffle(listaPaises);
        this.verPaises();
    
    }
    
    Set<Pais>TreeListaPaises = new TreeSet();
    // Tener en cuenta que los conjuntos se ordenan de manera automatica en entidad
    // ver el compareTo
    public void crearListaHashSet(){
        TreeListaPaises.add(new Pais("Arg",10));
        TreeListaPaises.add(new Pais("Lit",15));
        TreeListaPaises.add(new Pais("Rum",67));
        TreeListaPaises.add(new Pais("Fin",8));
        TreeListaPaises.add(new Pais("Din",14));
        
        // VER PARA EJEMPLIFICAR QUE Uru esta 3 veses
        // para que los objetos se puedan comparar hay que "habilitar" la compararacion 
        // de sus propiedades.
        // antes del @Override toString ALT+INSER CODE 
        // Generate Equals and HashCode y seleccionar todo
        
        TreeListaPaises.add(new Pais("Uru",36));
        TreeListaPaises.add(new Pais("Uru",36));
        TreeListaPaises.add(new Pais("Uru",36));
    }
    
    public void verPaisesHashSet(){
        System.out.println("---------------------");
        TreeListaPaises.forEach((e)->System.out.println(e));
    }
    
    
    
    public void ordenarPaisesPoblacionTreeSet() {
        
        this.verPaises();
    }
    
}
