/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener 
la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera)
. Agregar constructor vacío y con parámetros así como setters y getters. 
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe 
el tamaño de la taza y simula la acción de servir la taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza,
y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
*/
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;



/**
 *
 * @author jonak
 */
public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cafetera llenarCafetera(){
        Cafetera cf = new Cafetera();
        System.out.print("Cap. Maxima Cafetera....: ");
        cf.setCapacidadMáxima(leer.nextInt());
        cf.setCantidadActual(cf.getCapacidadMáxima());
        System.out.print("Carga Actual Cafetera...: " + cf.getCantidadActual());
        System.out.println("");
        System.out.println("CAP ACUTAL:" + cf.getCantidadActual());
        return cf;
    }
    public void servirTaza(Cafetera cf){
        System.out.print("Capacidad de la taza....: ");
        int taza = leer.nextInt();
        if (taza <= cf.getCantidadActual()) {
            cf.setCantidadActual(cf.getCantidadActual()-taza);
            System.out.print("Taza completa (retire)..: ");
            
        }else {
            System.out.println("Se cargaron: " + cf.getCantidadActual());
            cf.setCantidadActual(0);
            System.out.println("Regargue Cafetera.");
        }
        System.out.println("CAP ACUTAL:" + cf.getCantidadActual());
    }
        
    public void vaciarCafetera(Cafetera cf){
        System.out.println("Vaciando cafetera");
        cf.setCantidadActual(0);
        System.out.println("CAP ACUTAL:" + cf.getCantidadActual());
    }
    
    public void agregarCafe(Cafetera cf) {
        System.out.println("Ingrese la cantidad a agregar: ");
        int agregar;
        do {
        agregar = leer.nextInt();
            if (agregar > (cf.getCapacidadMáxima()- cf.getCantidadActual())) {
                System.out.println("Cantidad supera maximo");
            }else {
                System.out.println("Recargando....");
                cf.setCantidadActual(cf.getCantidadActual()+agregar);
                break;
            }
        } while (agregar > (cf.getCapacidadMáxima()- cf.getCantidadActual()));
        System.out.println("CAP ACUTAL:" + cf.getCantidadActual());
    }
    
    
    
    
    
    
}
