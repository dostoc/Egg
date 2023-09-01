/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author LogiC
 */
public class Rectangulo {
    //Ejercicio4
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        this.altura = leer.nextDouble();
    }
    
    public double superficieRectangulo(double base, double altura) {
        double superficie = base * altura;
        return superficie;
    }
    
    public double perimetroRectangulo(double base, double altura) {
        double perimetro = (base + altura)*2;
        return perimetro;
    }
    
    public void dibujarRectangulo() {

        for (int y = 0; y < this.altura; y++) { //para x que comienza en 0 hasta punto con paso +1
            for (int x = 0; x < this.base; x++) { //para y que comienza en 0 hasta punto con paso +1
                if (y == 0 || y == this.altura - 1 || x == 0 || x == this.base - 1) { //marcara un asterisco siempre en cuanto estemos en los bordes del cuadrado
                    /*
                    *Son dos for anidados que hacen el barrido como el que usabamos en matrices:
                    *teniendo el valor de la cantidad de asteriscos (en este caso es la varible punto)
                    *tenemos el limite y lo que van a hacer los for pasar y si se cumple algunas de las condiciones
                    *del if en la linea 31, escribira un asterisco, caso contrario no. 
                     */
                    System.out.print("*"); // no se usa System.out.println() por que da salto de linea
                } else {
                    System.out.print(" "); //solo usamos System.out.print()
                }
            }
            System.out.println(); // Aca le metemos este sout, para que haga el salto de linea una vez recorrido cada renglon edl cuadrado. 
        }
    }
    
    
}
