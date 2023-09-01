/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.servicios;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class PrincipalServicio {


    AutorServicio aSRV = new AutorServicio();
    EditorialServicio eSRV = new EditorialServicio();
    LibroServicio lSRV = new LibroServicio();
    PrestamoServicio pSRV = new PrestamoServicio();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void principal() throws Exception {
        try {
            int opcion;
            char salir = 'n';
            do {
                System.out.println("----------------------------");
                System.out.println("MENU PRINCIPAL");
                System.out.println("1-Autores");
                System.out.println("2-Editoriales");
                System.out.println("3-Libros");
                System.out.println("4-Prestamos");
                System.out.println("(0)-Salir");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        aSRV.menuAutores();
                        break;
                    case 2:
                        eSRV.menuEditorial();
                        break;
                    case 3:
                        lSRV.menuLibros();
                        break;
                    case 4:
                        pSRV.menuPrestamo();
                        break;
                        
                    case 0:
                        System.out.println("DESEA SALIR S/N");
                        salir = leer.next().charAt(0);
                        break;
                    
                    default:
                        System.out.println("Opcion no reconocida");
                }
                
            } while (!(salir == 'S'));
        } catch (Exception e) {
            throw e;
        }
    }

}
