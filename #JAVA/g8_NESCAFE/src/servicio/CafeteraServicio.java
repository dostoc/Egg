/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class CafeteraServicio {
//    Método llenarCafetera(): hace que la cantidad actual sea igual a la 
//    capacidad máxima.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    
    public Cafetera iniciarCafetera() {
        Cafetera puente = new Cafetera();
        System.out.println("Ingrese Capacidad Maxima: ");
        puente.setCapacidadMáxima(leer.nextInt());
        puente.setCantidadActual(puente.getCapacidadMáxima());
        System.out.println("Cantidad Actual: " + puente.getCantidadActual());
           
    return puente; 
    }
    
//    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
//            el tamaño de la taza y simula la acción de servir la taza con la capacidad 
//            indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
//            se sirve lo que quede. El método le informará al usuario si se llenó o no 
//            la taza, y de no haberse llenado en cuanto quedó la taza.

    public void servirTaza(Cafetera puente){
        System.out.println("Cant taza: ");
        int taza = leer.nextInt();
        
    
    
    
    }
    
    
    
}
