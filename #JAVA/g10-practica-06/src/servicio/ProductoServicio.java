/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class ProductoServicio {

    /**
     * 6. Se necesita una aplicación para una tienda en la cual queremos
     * almacenar los distintos productos que venderemos y el precio que tendrán.
     * Además, se necesita que la aplicación cuente con las funciones básicas.
     * Estas las realizaremos en el servicio. Como, introducir un elemento,
     * modificar su precio, eliminar un producto y mostrar los productos que
     * tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el
     * nombre del producto y de valor el precio. Realizar un menú para lograr
     * todas las acciones previamente mencionadas.
     */

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String, Integer> stockProductos = new HashMap();

    public Producto crearProducto() {
        System.out.println("Nuevo producto");
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Precio: ");
        int precio = leer.nextInt();
        return new Producto(nombre, precio);
    }

    public void crearStock() {
        do {
            Producto aux = crearProducto();
            stockProductos.put(aux.getNombre(), aux.getPrecio());
            System.out.println("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
    }

    public void verProductos() {
        for (Map.Entry<String, Integer> aux : stockProductos.entrySet()) {
            String key = aux.getKey();
            Integer val = aux.getValue();

            System.out.println("Producto: " + key + " $ " + val);

        }

    }
    public void eliminarProductos(){
        System.out.print("producto a quitar: ");
        stockProductos.remove(leer.next());
    }
    public void modificarProductos(){
        System.out.println("producto a modificar: ");
        String prodModif  = leer.next();
        Integer auxProd = stockProductos.get(prodModif);
        stockProductos.remove(prodModif);
        
        System.out.println("1-Modificar Nombre");
        System.out.println("2-Modificar Precio");
        System.out.println("3-Salir");
        switch (leer.nextInt()) {
            case 1:
                System.out.print("Nombre..:");
                stockProductos.put(leer.next(), auxProd);
                break;
            case 2:
                System.out.print("Precio..:");
                stockProductos.put(prodModif, leer.nextInt());
                break;
            case 3:
                break;
        }
    }
    
    
    
    
}
