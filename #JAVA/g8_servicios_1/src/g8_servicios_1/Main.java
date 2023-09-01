/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8_servicios_1;

import Entidad.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancariaServicio;

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = cbs.crearCuenta();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
     int opcion;
     char salir = 'n';
        do {
            System.out.println("1-Ingresar Saldo");
            System.out.println("2-Retirar");
            System.out.println("3-Extraccion rapida");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar Datos");
            System.out.println("6-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cbs.ingresar(cuenta1);
                    break;
                case 2:
                    cbs.retirar(cuenta1);
                    break;
                case 3:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cbs.consultaSaldo(cuenta1);
                    break;
                case 5:
                    cbs.consultaDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("DESEA SALIR S/N");
                    salir = leer.next().charAt(0);
                    break;
                    
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (!(salir=='S'));


        
    }
    
}
