/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);
    Raices puente = new Raices();

    public Raices constructor() {
        System.out.println("INGRESE VALORES");
        System.out.print("A: ");
        puente.setA(leer.nextDouble());

        System.out.print("B: ");
        puente.setB(leer.nextDouble());

        System.out.print("C: ");
        puente.setC(leer.nextDouble());

        return puente;
    }

    public double getDiscriminante(Raices puente) {
        //(b^2)-4*a*c
        double Discriminante = (Math.pow(puente.getB(), 2)) - (4 * puente.getA() * puente.getC());
        return Discriminante;
    }

    public boolean tieneRaices(Raices puente) {
        boolean retorno = true;
        return (getDiscriminante(puente) > 0);
    }

    public boolean tieneRaiz(Raices puente) {
        boolean retorno = true;
        return (getDiscriminante(puente) == 0);
    }

//    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime 
//            las 2 posibles soluciones.
    public void obtenerRaices(Raices puente) {
        if (tieneRaices(puente)) {
            //(-b±√discriminante/(2*a) = (-b±√(discriminante))/(2*a)
            System.out.print("Las raices son: ");
            System.out.print( ((-(puente.getB()) + Math.sqrt((getDiscriminante(puente))))/(2 * puente.getA())));
            //(-b+√(discriminante))/(2*a)
            System.out.print(" y ");
            System.out.print( ((-(puente.getB()) - Math.sqrt((getDiscriminante(puente))))/(2 * puente.getA())));
            //(-b-√(discriminante))/(2*a) 
        } else if (tieneRaiz(puente)) {
            System.out.print("La raiz es: ");
            System.out.print( ((-(puente.getB()) - Math.sqrt((getDiscriminante(puente))))/(2 * puente.getA())));
            //-b/(2*a)
        }
    }
    
}
