/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g7_6_rectangulo;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class G7_6_rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        
        System.out.println("Ingrese base : ");
        r1.setLado1(leer.nextInt());
        System.out.println("Ingrese altura : ");
        r1.setLado2(leer.nextInt());
        
        r1.calcular_area(r1.getLado1(),r1.getLado2());
        
        System.out.println("");
        
        r2.setLado1(4);//altura
        r2.setLado2(6);//base
        
        r2.rectangulo1(r2.getLado1(),r2.getLado2());
        
                
        
    }
    
}
