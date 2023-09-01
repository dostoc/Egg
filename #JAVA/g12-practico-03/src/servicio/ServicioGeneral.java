/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Circulo;
import entidad.Rectangulo;

/**
 *
 * @author Jona
 */
public class ServicioGeneral  {
    
    public void calcularRectangulo(){
        int base = 20;
        int altura = 30;
        Rectangulo rec = new Rectangulo(base, altura);
        double area = rec.calcularSuperficie();
        System.out.println("Rectangulo area: " + area);
        
        double perimetro = rec.calcularPerimetro();
        System.out.println("Rectangulo perimetro: " + perimetro);
    }
    
    
    public void calcularCirculo(){
        int radio = 10;
        Circulo circ = new Circulo(radio);
        double area = circ.calcularSuperficie();
        System.out.println("Circulo area: "+ area);
        
        double perimetro = circ.calcularPerimetro();
        System.out.println("Circulo perimetro: " + perimetro);
    }
    
   
    
}
