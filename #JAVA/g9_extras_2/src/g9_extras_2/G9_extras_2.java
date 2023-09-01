/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_extras_2;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import servicio.AhorcadoServicio;

/**
 *
 * @author jonak
 */
public class G9_extras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio puente = new AhorcadoServicio();
        Ahorcado juego = new Ahorcado();
        puente.juego(juego);
    
}}
