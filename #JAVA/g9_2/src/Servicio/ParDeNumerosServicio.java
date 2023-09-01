/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.ParDeNumeros;
import static java.lang.Math.max;

/**
 *
 * @author jonak
 */
public class ParDeNumerosServicio {
    
    public ParDeNumeros mostrarValores(){
    ParDeNumeros puente = new ParDeNumeros();
        System.out.println("Num1: " + puente.getNum1());
        System.out.println("Num2: " + puente.getNum2());
    return puente;
    
    }
    
    public void devolverMayor(ParDeNumeros puente) {
    
    double mayor = max(puente.getNum1(),puente.getNum2());
        System.out.println("El mayor es " + mayor);
    }
    
//    public void redondeo(ParDeNumeros puente){
//    double aux = (int)puente.getNum1()*10000;
//    puente.setNum1(aux/100);
//    puente.setNum2(aux/100);
//        System.out.println(puente.getNum1());
//        System.out.println(puente.getNum2());
//    
//    }
    
    
    


    
    
    //Método devolverMayor para retornar cuál de los dos atributos tiene 
    // el mayor valor
    
    
    
    
    
    
            
    
}
