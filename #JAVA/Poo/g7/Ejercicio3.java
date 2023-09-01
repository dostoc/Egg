/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.orien.obj;

import Clases.Operacion;

/**
 *
 * @author LogiC
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear una clase llamada Operacion que tenga como atributos privados
         * numero1 y numero2. A continuación, se deben crear los siguientes
         * métodos:
         *
         * a) Método constructor con todos los atributos pasados por parámetro.
         *
         * b) Método constructor sin los atributos pasados por parámetro.
         *
         * c) Métodos get y set.
         *
         * d) Método para crearOperacion(): que le pide al usuario los dos
         * números y los guarda en los atributos del objeto.
         *
         * e) Método sumar(): calcular la suma de los números y devolver el
         * resultado al main.
         *
         * f) Método restar(): calcular la resta de los números y devolver el
         * resultado al main
         *
         * g) Método multiplicar(): primero valida que no se haga una
         * multiplicación por cero, si fuera a multiplicar por cero, el método
         * devuelve 0 y se le informa al usuario el error. Si no, se hace la
         * multiplicación y se devuelve el resultado al main
         *
         * h) Método dividir(): primero valida que no se haga una división por
         * cero, si fuera a pasar una división por cero, el método devuelve 0 y
         * se le informa al usuario el error se le informa al usuario. Si no, se
         * hace la división y se devuelve el resultado al main.
         */
        
        Operacion op1 = new Operacion();
        //d) seteamos los valores de número 1 y de número 2
        op1.crearOperacion();
        
        //e) sumamos los números y los mostramos
        System.out.println("La suma de ambos números es: " 
                + op1.sumar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("");
        
        //f) restamos los números y los mostramos
        System.out.println("La resta de ambos números es: " 
                + op1.restar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("");
        
        //g) multiplicamos y lo mostramos
        System.out.println("La multiplicación de ambos números es: " 
                + op1.multiplicar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("");
        
        //h) dividimos y mostramos
        System.out.println("La división de ambos números es: " 
                + op1.dividir(op1.getNumero1(), op1.getNumero2()));
        
    }

}
