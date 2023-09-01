/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaces.CalcularSuperficie;

/**
 *
 * @author Jona
 */
public class Circulo implements CalcularSuperficie{
    
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularSuperficie() {
        double area = (radio*radio) * 3.14; 
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 3.14*radio*2;
        return perimetro;
    }
    
}
