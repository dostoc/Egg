/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10.practica.pkg04.cine;

import servicio.PeliculaServicio;

/**
 *
 * @author jonak
 */
public class G10Practica04Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio puente = new PeliculaServicio();
        puente.crearListaPeliculas();
        puente.mostrarPeliculas();
        puente.mostarPeliculasHora();
        puente.ordenarPeliculasDuracion();
        puente.mostrarPeliculas();
        puente.ordenarPeliculasDuracionMasLarga();
        puente.mostrarPeliculas();
        puente.ordenarPeliculasDirector();
        puente.mostrarPeliculas();
        puente.ordenarPeliculasTitulo();
        puente.mostrarPeliculas();
    }   
    
}
