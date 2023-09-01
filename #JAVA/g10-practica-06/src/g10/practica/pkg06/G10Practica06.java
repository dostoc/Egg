/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10.practica.pkg06;

import java.util.Scanner;
import servicio.ProductoServicio;

/**
 *
 * @author jonak
 */
public class G10Practica06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicio puente = new ProductoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int opcion;
        char salir = 'n';
        do {
            System.out.println("------CONTROL DE PRODUCTOS------");
            System.out.println("1-CARGA de Productos");
            System.out.println("2-VER todos los productos");
            System.out.println("3-ELIMINAR productos");
            System.out.println("4-MODIFICAR precio de producto");
            System.out.println("9-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    puente.crearStock();
                    break;
                case 2:
                    puente.verProductos();
                    break;
                case 3:
                   
                    puente.eliminarProductos();
                    break;
                case 4:
                    puente.modificarProductos();
                    break;
                    
                case 9:
                    break;
                
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (!(salir == 'S')&&(salir == 's'));
        
        
        
    }
    
}
