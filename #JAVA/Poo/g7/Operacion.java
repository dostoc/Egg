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
public class Operacion {
    //Ejercicio 3
    
    private double numero1;
    private double numero2;

    //a)
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //b)
    public Operacion() {
    }
    
    //c)

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    //d)
    
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número 1: ");
        this.numero1 = leer.nextDouble();
        System.out.println("Ingrese el número 2: ");
        this.numero2 = leer.nextDouble();
    }
    
    //e)
    public double sumar(double numero1, double numero2) {
        double sumar = numero1 + numero2;
        return sumar;
    }
    
    //f)
    public double restar(double numero1, double numero2) {
        double restar = numero1 - numero2;
        return restar;
    }
    
    //g)
    public double multiplicar(double numero1, double numero2) {
        double multiplicar;
        if (numero1 != 0 && numero2 != 0) {
            multiplicar = numero1 * numero2;
        } else {
            System.out.println("Uno de los dos números es 0");
            multiplicar = 0;
        }
        
        return multiplicar;
    }
    
    //h)
    public double dividir(double numero1, double numero2) {
        double dividir;
        if (numero1 != 0 && numero2 != 0) {
            dividir = numero1 / numero2;
        } else {
            System.out.println("El divisor es 0, no se realizó la división");
            dividir = 0;
        }
        return dividir;
    }
}
