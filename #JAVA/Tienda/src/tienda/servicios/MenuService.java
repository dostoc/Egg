/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.Persistencia.FabricanteDAO;
import tienda.Persistencia.ProductoDAO;

/**
 *
 * @author jonak
 */
public class MenuService {
    
    FabricanteDAO fDAO = new FabricanteDAO();
    FabricanteService fSRV = new FabricanteService(fDAO);
    
    ProductoDAO pDAO = new ProductoDAO();
    ProductoService pSRV = new ProductoService(pDAO);
    
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void menuPrincipal() {
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-FABRICANTES");
            System.out.println("2-PRODUCTOS");
            System.out.println("(N)-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                      menuFabricante();
                    break;
                case 2:
                      menuProducto();
                              
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
    
    public void menuFabricante(){
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-Listado de Fabricantes");
            System.out.println("2-....");
            System.out.println("(0)-Volver");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    fSRV.mostrarFabricantes();
                    break;
                case 2:
                    //cosas
                    break;
                case 0:
                    
                    salir = 'S';
                    break;
                
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (!(salir == 'S'));
    
    
    }
    
    public void menuProducto(){
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-.Listado x nombre");
            System.out.println("2-.Listado x nombre + precio");
            System.out.println("3-.Listado x Minimo - Maximo");
            System.out.println("4-.Listado x Busqueda");
            System.out.println("5-.Mais Baratu");
            System.out.println("6-.Cargar Producto");
            System.out.println("7-.Modificar Producto");
            System.out.println("(0)-Volver");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    pSRV.listarProductosNombre();
                    break;
                case 2:
                    
                    pSRV.listarProductosNombrePrecio();
                    break;
                case 3:
                    pSRV.listaProductoMinMax();
                    break;
                case 4:
                    pSRV.buscarPorNombre();
                    break;
                case 5:
                    pSRV.masBaratou();
                    break;
                case 6:
                    pSRV.cargarProducto();
                     break;
                case 7:
                    menuProductoMod();
                     break;
                    
                case 0:
                    salir = 'S';
                    break;
                
                default:
                    System.out.println("Opcion no reconocida");
            }
            
        } while (!(salir == 'S'));
    
    
    
    }
    
    
    public void menuProductoMod(){
        int opcion;
        char salir = 'n';
        do {
            
            System.out.println("1-Editar TODO");
            System.out.println("2-Editar NOMBRE");
            System.out.println("3-Editar PRECIO");
            System.out.println("3-Editar FABRICANTE");
            System.out.println("(0)-Volver");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    pSRV.modificarProducto();
                    break;
                case 2:
                     pSRV.modificarNombre();
                    break;
                case 3:
                    //pDAO.modificarFabricante();
                    break;
                case 0:
                        salir = 'S';
                    break;
            }
            
        } while (!(salir == 'S'));
    
    
    }
    
    
    
}
