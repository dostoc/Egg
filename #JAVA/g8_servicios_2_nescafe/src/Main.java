
import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio puente = new CafeteraServicio();
        Cafetera nesca = puente.llenarCafetera();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-Servir Taza");
            System.out.println("2-Vaciar Cafetera");
            System.out.println("3-Agregar Cafe");
            System.out.println("4-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    puente.servirTaza(nesca);
                    break;
                case 2:
                    puente.vaciarCafetera(nesca);
                    break;
                case 3:
                    puente.agregarCafe(nesca);
                    break;
                case 6:
                    System.out.println("DESEA SALIR S/N");
                    salir = leer.next().charAt(0);
                    break;
                
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (!(salir == 'S'));
        
        
    }
    
}
