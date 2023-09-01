/*
Método Static y Clase Math
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author jonak
 */
public class ParDeNumerosServicio {
    
    
    //Método mostrarValores que muestra cuáles son los dos números guardados.
    
    public ParDeNumeros mostrarValores(){
        ParDeNumeros puente = new ParDeNumeros();
        System.out.println("Numero 1 : " + puente.getNum1());
        System.out.println("Numero 2 : "+ puente.getNum2());
        return puente;
    }
    
    public void calcularPotencia(ParDeNumeros puente){
        long auxNum1=Math.round(puente.getNum1());
        long auxNum2=Math.round(puente.getNum2());
        /*
        System.out.println(auxNum1 + " | " + auxNum2);
        if (auxNum1>=auxNum2) {
            System.out.println(auxNum1+"("+auxNum2 +")");
            System.out.println(Math.pow(auxNum1, auxNum2));
        }else   {
            System.out.println(auxNum2+"("+auxNum1 +")");
            System.out.println(Math.pow(auxNum2, auxNum1));
        }
        */
        
        System.out.println("El maximo es: " + Math.max(puente.getNum1(), puente.getNum2()));
        System.out.println("El minimo es: " + Math.min(puente.getNum1(), puente.getNum2()));
        
        
        
        
    }
   
    
    public void calcularRaiz(ParDeNumeros puente){
        long auxNum1=Math.round(puente.getNum1());
        long auxNum2=Math.round(puente.getNum2());
        if (auxNum1<auxNum2) {
            System.out.println("Raiz de: "+ auxNum1 + " = " + Math.pow(Math.abs(auxNum1),0.5));
        }else   {
            System.out.println("Raiz de: "+ auxNum2 + " = " + Math.pow(Math.abs(auxNum2),0.5));
        }
    }
    
}
