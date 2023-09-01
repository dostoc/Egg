/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.General;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class SRVGeneral {
    
   Scanner leer = new Scanner(System.in);
    
   SRVCliente puenteC = new SRVCliente();
   SRVAmarre puenteA = new SRVAmarre();
    
   General g = new General();
   
   public void menu(){
       boolean salir = true;
       do {
           System.out.println("MENU");
           System.out.println("1 ) AMARRAS");
           System.out.println("2 ) CLIENTES ");
           System.out.println("9 ) Salir  ");
           
           System.out.println("....opcion: ");
           switch (leer.nextInt()) {
               case 1:
                   puenteA.menuAmarres();
                   break;
               case 2:
                   puenteC.menuCliente();
                   break;
               case 9:
                   System.out.println("Saliendo.....");
                   salir = false;
                   break;
               default:
                   System.out.println("Opcion no valida");
           }
           
       } while (salir);
       
   }
    
}
