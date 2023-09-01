
import Entidad.Punto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jonak
 */
public class Distancia_Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.crearPuntos();
        System.out.println("La distancia entre los objetos es :");
        System.out.println(p1.distancia(p1.getX1(),p1.getY1(),p1.getX2(),p1.getY2()));
        
        
        
    }
    
}
