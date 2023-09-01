/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import servicio.PerroServicio;

/**
 *
 * @author Jona
 */
public class PerroServicio {
    Scanner leer = new Scanner(System.in);
    
        ArrayList<Perro> arrayPerros = new ArrayList();
        ArrayList vacunasArray = new ArrayList();
        TreeSet vacunasSet = new TreeSet();
        
    

    public Perro crearPerro(){
        int cont = 0;
        System.out.println("-----------ALTA DE PERRO-----------");
        System.out.print("Nombre.....:");
        String nombre = leer.next();
        
        System.out.print("Raza.......:");
        String raza = leer.next();
        
        System.out.print("Edad.......:");
        Integer edad = leer.nextInt();
        
        System.out.print("Vacunas....:");
        do {
            System.out.println("Vac.("+(++cont)+") :");
            vacunasArray.add(leer.next());
            vacunasSet.add(vacunasArray.get(cont-1));
            System.out.println("desea cargar otra (s)Si o pulse ENTER para continuar...");
            if (!(leer.next().equalsIgnoreCase("s"))) {
                System.out.println("Saliendo ...");
                break;
            }
        } while (true);
        return new Perro(raza, edad, nombre, vacunasArray, vacunasSet);
    }
    
    public void crearLista(){
        System.out.println("INGRESE MASCOTAS:");
        do {
            arrayPerros.add(crearPerro());
            System.out.println("Desea ingresar otro perro (s)Si o pulse ENTER para continuar...");
            if (!(leer.next().equalsIgnoreCase("s"))) {
                System.out.println("Saliendo ...");
                break;
            }
        } while (true);
    }
    
          
}
