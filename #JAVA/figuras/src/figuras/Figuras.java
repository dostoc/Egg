/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

import figuras.Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia();
        System.out.println("Circunferencia...:");
        c1.crearCircunferencia();
        System.out.println("Area...:" + c1.Area());
        System.out.println("Perimetro...:" + c1.perimetro());
        
        
    
        
    }
    
}
