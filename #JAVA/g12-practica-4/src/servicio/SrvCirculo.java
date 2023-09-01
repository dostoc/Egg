/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Circulo;
import interfaz.calculosFormas;
import java.util.Scanner;


/**
 *
 * @author jonak
 */
public class SrvCirculo implements calculosFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        Circulo c1 = new Circulo();
    
    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie Calculada....: " + (Math.PI*(Math.pow(c1.getRadio(), 2))));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Calculado.....: " + (Math.PI*(c1.getRadio()*2)));
    }

    @Override
    public void objetoGeometrico() {
        System.out.println("Circulo");
        System.out.print("Radio.....................: ");
        c1.setRadio(leer.nextDouble());
        calcularSuperficie();
        calcularPerimetro();
    }
    
    
    
}
