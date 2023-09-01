/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Enitidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public Cadena mostrarVocales() {
        Cadena puente = new Cadena();
        System.out.println("Ingrese una frase");
        puente.setFrase(leer.nextLine());
        puente.setLongitud(puente.getFrase().length());

        int cantidadVocales = 0;
        for (int i = 0; i < puente.getLongitud(); i++) {
            
            // String.valueof(char ... ) Convierte a String
            // charAt(i) da caracter en posicion i
            // toUpperCase a mayusculas
            // equals("a") busca contenido
            // String c = String.valueOf(puente.getFrase().charAt(i)).toUpperCase(); //String.valueof(char ... )
            
            String c = puente.getFrase().substring(i,i+1).toUpperCase();
            if (c.equals("A")||c.equals("E")||c.equals("I")||c.equals("O")||c.equals("U")) {
                cantidadVocales++;
            }
        }
        System.out.println("La cantidad de Vocales es: " + cantidadVocales);
        return puente;
    }

//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
//pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(Cadena puente) {
        String fraseInvertida = "";
        for (int i = puente.getFrase().length() - 1; i >= 0; i--) {
            fraseInvertida += puente.getFrase().substring(i, i-1);
        }
        System.out.println(fraseInvertida);
    }

    public void vecesRepetido(String letra, Cadena puente) {
        int contCarac = 0;
        String carac;
        for (int i = 0; i < puente.getFrase().length(); i++) {
            carac = puente.getFrase().substring(i,i+1);
            if (letra.equals(carac)) {
                contCarac++;
            }
        }
        System.out.println("Se encontro el caracter " + letra + " tantas" + contCarac + "veces" );
    }
    
    public void compararLongitud(String frase, Cadena puente ){
    
        if (puente.getFrase().length() == frase.length()) {
            System.out.println("Tienen la misma longitud");
        }else   {
            System.out.println("No tienen la misma longitud");
        }
    }
    
    public void unirFrases(String frase, Cadena puente ){
        System.out.println(puente.getFrase() +" "+frase);
    }
    
    public void reemplazar(String letra, Cadena puente){
        String fraseAux;
        fraseAux = puente.getFrase().replace("a", letra);
        System.out.println(fraseAux);
    
    }
    
    public boolean contiene(String letra, Cadena puente){
        return (puente.getFrase().contains(letra));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

