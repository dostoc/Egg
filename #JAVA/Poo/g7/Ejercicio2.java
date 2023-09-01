/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.orien.obj;

import Clases.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Declarar una clase llamada Circunferencia que tenga como atributo
         * privado el radio de tipo real. A continuación, se deben crear los
         * siguientes métodos: 
         * 
         * a) Método constructor que inicialice el radio pasado
         * como parámetro. 
         * 
         * b) Métodos get y set para el atributo radio de la clase
         * Circunferencia. 
         * 
         * c) Método para crearCircunferencia(): que le pide el
         * radio y lo guarda en el atributo del objeto. 
         * 
         * d) Método area(): para
         * calcular el área de la circunferencia (Area=〖π*radio〗^2). 
         * 
         * e) Método
         * perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
         *
         */
        
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Crearemos una circunferencia, ingrese el radio de la misma");
        
        //c
        System.out.println("La circunferencia tiene un radio de: " 
                + c1.crearCircunferencia());
        System.out.println("");
        //d
        System.out.println("El área de la circunferencia es: " 
                + c1.area(c1.getRadio()));
        System.out.println("");
        //e
        System.out.println("El perímetro de la circunferencia es: " 
                + c1.perimetro(c1.getRadio()));
        
        
        
    }

}
