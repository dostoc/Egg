/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11.practica.pkg3.cartas;

import java.util.Scanner;
import servicio.MazoServicio;

/**
 *
 * @author jonak
 */
public class G11Practica3Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MazoServicio baraja = new MazoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        baraja.crearMazo();
        baraja.barajar();
        baraja.verMazo();
        System.out.println("******REPARTIR********");
        do {
            baraja.cartasDisponibles();
            baraja.darCartas();
            baraja.cartasMonton();
            System.out.println("(S)Salir ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
        
        System.out.println("***CARTAS SIN SALIR***");
        baraja.mostrarBaraja();
        
        
        
        
        // TODO code application logic here
    }
    
}
