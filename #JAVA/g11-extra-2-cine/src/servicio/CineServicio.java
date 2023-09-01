/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Cine;
import entidad.Espectador;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class CineServicio {
    Scanner leer = new Scanner(System.in);
    Random rand = new Random();
    
    private Pelicula crearPelicula(){
        System.out.print("Titulo.......................: ");
        String titulo = leer.next();
        System.out.print("Duración................: ");
        double duracion = leer.nextDouble();
        System.out.print("Edad minima.........: ");
        int edad = leer.nextInt();
        System.out.print("Director..................: ");
        String director = leer.next();
    return new Pelicula(titulo, director, edad, director);
    }
    
    public Cine crearCine(){
        Cine cin = new Cine();
        cin.setPeli(this.crearPelicula());
        cin.setEspec(this.asignarAsiento(this.crearEspectadorRandom()));
        System.out.print("Costo de la entrada....$: ");
        cin.setCostoEntrada(leer.nextDouble());
        return cin;
    }
    
    private Espectador crearEspectador(){
        System.out.print("Nombre.....................: ");
        String nombre = leer.next();
        System.out.print("Edad.........: ");
        int edad = leer.nextInt();
        System.out.print("Dinero.........: ");
        double dinero = leer.nextDouble();
       return new Espectador(nombre, edad, dinero);
    }
    
    private Espectador crearEspectadorRandom(){
              return new Espectador(("Persona-"+(rand.nextInt(999)+1000)), (rand.nextInt(100)+12), (rand.nextDouble(5000)));
    }
    
    public boolean dinerodisponible(double costo, double dineroDisponible){
       return (costo>dineroDisponible);
    }
    
    public boolean disponibilidadAsiento(Espectador[][] sala,int fila, String columna){
        return (sala[fila][(int)columna.charAt(0)] ==  null);
    }
    
    public Espectador[][] asignarAsiento(Espectador espectador){
       
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                int estado = rand.nextInt(1);
                if (estado == 1){
                  
                   //if (auxExpectador.getDineroDisponible() >=  this.crearCine().getCostoEntrada()) {
                    sala[i][j] = auxExpectador;
                    //sala[i][j] = espectador;
                   //}
                }               
            }
        }
        return sala;
    }


public void mostrarCine(Cine cin) {
    Espectador[][] sala = cin.getEspec();
    
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 8; j++) {
            System.out.print(sala[ i ][ j ]);
        }
        
    }
        
    }
}