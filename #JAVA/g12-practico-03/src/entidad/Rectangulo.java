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
public class Rectangulo  implements CalcularSuperficie {
    
    private int base;
    private int altura;


    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularSuperficie() {
        int area = base*altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (base + altura)*2;
        return perimetro;
    }
    
    
    
}
