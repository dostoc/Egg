/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author jonak
 */
public class ListaServicio {
    private Scanner leer;
    
    
    
    private ArrayList<Pais> Paises;

    public ListaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.Paises = new ArrayList();
    }
    
    public Pais crearPais(){
        System.out.print("Nuevo pais / Sigla: ");
        String nombre= leer.next();
        
        System.out.print("Nuevo pais / Poblacion: ");
        int poblacion= leer.nextInt();
        
        return new Pais(nombre, poblacion);
    }
    
    public void agregarListaPaises(Pais nuevoPais){
        Paises.add(nuevoPais);
    }
    
    public void fabricaPaices (int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Pais nuevoPais = crearPais();
            agregarListaPaises(nuevoPais);
            System.out.println("Nuevo pais es: " + nuevoPais.toString());
        }
    }
    
    public void printArray(){
        for (Pais aux : Paises) {
            System.out.println(aux.toString());
        }
        System.out.println("Paises: " + Paises.size());
        
    }
    
    
    // MODIFICACIONES DE UN LISTA U OBJETO DENTRO DE LA LISTA
    
    // Modifica una variable del objeto
    public void actualizarPais(int index){
        System.out.println("Actualizar Poblacion");
        Pais aux = Paises.get(index);
        System.out.println("Pais: " + aux.getNombre() + "Poblacion Actual: " + aux.getPolacion());
        //Este metodo IMPACTA !!! directamente en la collection, no es necesario volver a guardar la lista
        aux.setPolacion(leer.nextInt());
    }
    
    // Reemplaza un objeto por otro
    public void reemplazarPais(int index){
        System.out.println("Reemplazar Pais");
        Pais aux = crearPais();
        Paises.set(index, aux);
    }
    
    // Borrar un objeto
    public void borrarPais(int index){
        // Es IMPORTANTE que exista esa posicion sino da ERROR
        if (index <= (Paises.size()-1)) {
            Paises.remove(index);
        } else {
            System.out.println("INDICE ERRONEO");
        }
    
    }
    
    // Otras funciones
    // Pasar de un Array a una Lista Array
    public void otrasFunciones() {
    String[] nombres = {"pepe","pepa"};
    ArrayList<String> nombreList = new ArrayList(Arrays.asList(nombres));
            
    // Cargar una Lista desde otra en una posicion inicial (INDEX: 1)
    ArrayList<String> nombreLista2 = new ArrayList();
    nombreLista2.addAll(1, nombreList);
    }
    
    
    
    
    
    //RECORRER LISTAS DE OBJETOS
    
    
    private ArrayList<Pais> listaRecorridos = new ArrayList();
    
    public void recPrecarga(){
    listaRecorridos.add(new Pais("arg",10));
    listaRecorridos.add(new Pais("ven",30));
    listaRecorridos.add(new Pais("bul",15));
    listaRecorridos.add(new Pais("est",25));
    listaRecorridos.add(new Pais("lit",8));
    }
    
    
    // FOREACH - Solo sive para mostrar - es el mas comun
    public void recFore(){
//        for (Pais aux : listaRecorridos) {
//            System.out.println(aux);
//        }
        //Otra manera de comprimir el foreach
        System.out.println("--------------------------");
        listaRecorridos.forEach((e)-> System.out.println(e));
    }
    
    // FORI
    
    public void recFori(){
        for (int i = 0; i < listaRecorridos.size(); i++) {
            System.out.println(listaRecorridos.get(i));
        }
    }
    
    // ELIMINAR CON FORI
    
    public void eliminarFori(){
        for (int i = 0; i < listaRecorridos.size(); i++) {
            Pais aux = listaRecorridos.get(i);
            if(aux.getNombre().equalsIgnoreCase("arg")) {
                listaRecorridos.remove(i);
            }
        }
    }
    
    // ELIMINAR CON ITERATOR
    public void recIterator(){
        Iterator<Pais> it = listaRecorridos.iterator();
        while (it.hasNext()) {
            Pais next = it.next();
            if (next.getNombre().equals("bul")) {
                it.remove();
            }
        }
    }
    
    // ELIMINAR CON PARAMETRO DE LA FORMA CORRECTA busca y elimina
    public void buscaElimina (String busqueda){
        for (int i = 0; i < listaRecorridos.size(); i++) {
            Pais aux = listaRecorridos.get(i);
            if (aux.getNombre().equalsIgnoreCase(busqueda)) {
                listaRecorridos.remove(i);
            }
            
        }
    }
    
    // MODIFICAR OBJETO ****** AL SETEAR AUX IMAPACTA DIRECAMENTE EN ARRAYLIST
    public void modificarObjeto (String viejo, String nuevo){
        for (int i = 0; i < listaRecorridos.size(); i++) {
            Pais aux = listaRecorridos.get(i);
            if (aux.getNombre().equals(viejo)){
                aux.setNombre(nuevo);
            }
        }
    }
    
    
    
    
    }
    
    