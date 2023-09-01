/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_claseutil_date;

import entidad.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/**
 *
 * @author jonak
 */
public class G9_claseUtil_date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio puente = new PersonaServicio();
        Persona per= puente.crearPersona();
        
        puente.calcuarEdad(per);
        System.out.println("Ingresar una edad a comprar");
        if (puente.menorQue(per, leer.nextInt())){
            System.out.println("ES MAYOR A ESA EDAD");
        }else {
            System.out.println("ES MENOR A ESA EDAD");
        }
        puente.mostrarPersona(per);
       
        
    }
    
}
