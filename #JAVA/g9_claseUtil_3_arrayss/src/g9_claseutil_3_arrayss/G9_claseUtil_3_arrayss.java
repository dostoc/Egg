/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_claseutil_3_arrayss;

import servicio.ArregloServicio;


/**
 *
 * @author jonak
 */
public class G9_claseUtil_3_arrayss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloServicio puente = new ArregloServicio();
        double[] array1 = new double[50]; 
        double[] array2 = new double[20]; 
        
        puente.iniciarARRAY(array1);
        System.out.println("ARRAY 1:");
        puente.mostrar(array1);
        
        System.out.println("ORDENAR ARRAY 1:");
        puente.ordenarArray(array1);
        puente.mostrar(array1);
        
        System.out.println("Iniciar  ARRAY 2:");
        array2=puente.inicializarB(array1);
        
        System.out.println("MOSTRAR  ARRAY 1:");
        puente.mostrar(array1);
        System.out.println("MOSTRAR  ARRAY 2:");
        puente.mostrar(array2);
        
        
    }
    
}
