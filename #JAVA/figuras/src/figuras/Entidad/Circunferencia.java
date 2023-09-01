/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.Entidad;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
        //this es la misma variable del atributo
    }

    public Circunferencia() {
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el R circunferencia: ");
        radio = leer.nextDouble();
    }
    
    public double Area() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }
    
    public double perimetro() {
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    
    }

}
