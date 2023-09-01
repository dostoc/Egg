/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.estancias.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import jdbc.estancias.entidades.Casas;
import jdbc.estancias.persistencia.CasasDAO;

/**
 *
 * @author jonak
 */
public class CasasServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CasasDAO cDAO = new CasasDAO();
    Casas casa = new Casas();
    
    public CasasServicio(CasasDAO cDAO) {
        this.cDAO = cDAO;
    }
    
    public void listarCasasPaisOcupacion(){
        try {
            
            Collection listaCasas = new ArrayList();
            
            String pais = "Reino Unido";
            String inicio = "2020-08-01";
            String fin = "2020-08-31";
            
            listaCasas = cDAO.disponiblePais(pais, inicio, fin);
            
            for (Object listaCasa : listaCasas) {
                System.out.println(listaCasas);
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    
    
    }
    
    
    public void listarCasasLibresOcupacion(){
        try {
            
            Collection listaCasas = new ArrayList();
            
            System.out.println("Ingrese fecha de inicio AAAA - MM - DD");
            String inicio = leer.next();
            
            System.out.println("Ingrese estadia");
            int duracion = leer.nextInt();
            
            listaCasas = cDAO.disponibleEstadia(inicio, duracion);
            
            for (Object listaCasa : listaCasas) {
                System.out.println(listaCasas);
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    
    
    }
    
    
    
}
