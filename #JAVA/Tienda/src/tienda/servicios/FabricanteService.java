/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.Persistencia.FabricanteDAO;

/**
 *
 * @author jonak
 */
public class FabricanteService {
    
    FabricanteDAO fDAO ;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FabricanteService(FabricanteDAO fDAO) {
        this.fDAO = fDAO;
    }
    
    public void cargarFabricante() {
        try {
            
            System.out.println("Ingrese el nombre del fabricante");
            String nombre = leer.next();
            
            fDAO.cargarFabricante(new Fabricante(0, nombre));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void mostrarFabricantes() {
        try {
            
            Collection<Fabricante> listaFabricantes = fDAO.listarFabricante();
            
            System.out.println("**TABLA DE FABRICANTES**");
            System.out.println("**CODIGO -- NOMBRE**");
            
            for (Fabricante fabricante : listaFabricantes) {
                System.out.println(fabricante.getNombre());
            }
            System.out.println("-------------------------------------");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}