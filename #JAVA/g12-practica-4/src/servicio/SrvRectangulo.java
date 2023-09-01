/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Rectangulo;
import interfaz.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class SrvRectangulo implements calculosFormas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r1 = new Rectangulo();

    public void calculosGeometricos(){
        
    }
    
    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie Calculada....: " + (r1.getBase()*r1.getAltura()));
        
        
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro Calculado.....:" + ((r1.getBase()+r1.getAltura())*2));
    }

    @Override
    public void objetoGeometrico() {
        System.out.println("Calculos Rectangulo");
        System.out.print("Base......................: ");
        r1.setBase(leer.nextDouble());
        System.out.print("Altura....................: ");
        r1.setAltura(leer.nextDouble());
        calcularSuperficie();
        calcularPerimetro();
    }
    
    
    
}
