/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.sql.ResultSet;
import java.util.Collection;
import java.util.Scanner;
import tienda.Persistencia.ProductoDAO;
import tienda.entidades.Producto;

/**
 *
 * @author jonak
 */
public class ProductoService {
    
    ProductoDAO pDAO;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ProductoService(ProductoDAO pDAO){
        this.pDAO = pDAO;
    }
    
    public void cargarProducto() {
        try {
            System.out.println("CREAR PRODUCTO");
            System.out.println("Ingrese nombre de producto......:");
            String nombre = leer.next();
            System.out.print("Ingrese nombre de precio......:");
            double precio = leer.nextDouble();
            System.out.print("Ingrese ID de fabricante......:");
            int codigo_fabricante = leer.nextInt();
            
            pDAO.cargarProducto(new Producto(0,nombre, precio, codigo_fabricante));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
        }
    
    public void modificarProducto(Producto producto){
        System.out.println("Ingrese ID producto a modificar");
    }
    
    
    // listar productos
    
    public void listarProductos() {
        try {
            Collection<Producto> listaProductos = pDAO.listaProductos();
            for (Producto listaProducto : listaProductos) {
                System.out.println(listaProducto);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public void listarProductosNombre() {
        try {
            Collection<Producto> listaProductos = pDAO.listaProductosNombre();
            for (Producto listaProducto : listaProductos) {
                System.out.println(listaProducto.getNombre());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    
    public void listarProductosNombrePrecio() {
        try {
            Collection<Producto> listaProductos = pDAO.listaProductosNombrePrecio();
            for (Producto listaProducto : listaProductos) {
                      System.out.println(listaProducto.getNombre() + " ......$ "+listaProducto.getPrecio());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public void listaProductoMinMax(){
        try {
            System.out.println("Ingrese Minimo......$ ");
            double pMin = leer.nextDouble();
            System.out.println("Ingrese Maximo......$ ");
            double pMax = leer.nextDouble();
            
            Collection<Producto> listaProducto = pDAO.listaProductoMinMax(pMin, pMax);
            for (Producto producto : listaProducto) {
                System.out.println(producto);
                
            }
            
        } catch (Exception e) {
        }
    }
    
    
    public void buscarPorNombre(){
        try {
            System.out.println("Ingrese nombre del producto");
            String buscado = leer.next();
            Collection<Producto>listaProducto=pDAO.buscarPorNombre(buscado);
            for (Producto producto : listaProducto) {
                  System.out.println(producto);
                
            }
            
        } catch (Exception e) {
        }
    }
    
    public void masBaratou(){
        try {
            Producto pAux = pDAO.masBarato();
            
            if (pAux == null) {
                throw new Exception("No existe");
            }
            
            System.out.println(pAux);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    
    }
    
    public void modificarProducto(){
        try {
            
            System.out.println("Ingrese ID");
            int id = leer.nextInt();
            
            System.out.println("ARTICULO:");
            pDAO.mostrarProductoCodigo(id);

            
            System.out.println("Ingrese nuevo Nombre");
            String nuevo = leer.next();
            
            System.out.println("Ingrese Precio");
            double precio = leer.nextDouble();
            
            System.out.println("Ingrese Cod. Fabricante");
            int fab = leer.nextInt();
            
            Producto aux = new Producto(id, nuevo, precio,fab);
            pDAO.modificarProducto(aux);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void modificarNombre(){
        try {
            System.out.println("Ingrese ID");
            int id = leer.nextInt();
            
            ResultSet resultado = ( pDAO.mostrarProductoCodigo(id));
            
            
            
            System.out.println("Nuevo Nombre....:");
            String nuevoNombre = leer.next();
            pDAO.modificarNombre(convertirResultado(resultado),nuevoNombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public Producto convertirResultado(ResultSet auxRes) throws Exception{
        try {
            if (auxRes == null) {
                System.out.println("Falla de obtencio de resultado");
            }
            if (auxRes.next()){
                Producto nuevoRest = new Producto(auxRes.getInt(1), auxRes.getString(2), auxRes.getDouble(3), auxRes.getInt(4));
                return nuevoRest;
            }
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return null;
    }
    
    
    
}
    