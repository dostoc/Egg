/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersonaServicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo crearPersona(): el método crear persona, le pide los valores de 
    //los atributos al usuario y después se le asignan a sus respectivos atributos
    //para llenar el objeto Persona. Además, comprueba que el sexo introducido 
    // sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    public Persona crearPersona() {

        Persona puente = new Persona();
//        
//        System.out.println("Ingresar DATOS persona:");
//        
//        System.out.print("Nombre:");
//        puente.setNombre(leer.next());
//        
//        System.out.print("Edad:");
//        puente.setEdad(leer.nextInt());
//        
//        System.out.print("Sexo:(H/M/O)");
//            do {
//            puente.setSexo(leer.next());
//            if ((puente.getSexo().equals("H") || puente.getSexo().equals("M") || puente.getSexo().equals("O"))) {
//                break;
//            }
//                System.out.println("Opcion no reconocida intente nuevamente H/M/O");
//            } while(true); 
//        
//        System.out.print("Peso:");
//        puente.setPeso(leer.nextInt());
//        
//        System.out.print("Altura (cm):");
//        puente.setAltura(leer.nextInt());
//        
//        System.out.print("Hobby:");
//        puente.setHobby(leer.next());

        puente = new Persona(nombre, 0, sexo, 0, 0, hobby);

        return puente;

    }

    // DEL EJERCICIO DE G.13 Errores
    /**
     *
     * 1. Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
     * Servicios, a null y tratar de invocar el método esMayorDeEdad() a través
     * de ese objeto. Luego, englobe el código con una cláusula try-catch para
     * probar la nueva excepción que debe ser controlada.
     */
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona puente) throws Exception {
        boolean esmayor = false;

        try {
            if (puente.getEdad() >= 18) {
                esmayor = true;
            }

        } catch (Exception e) {
            System.out.println("Error persona eterea");
        }

        return esmayor;
    }

//    Método calcularIMC(): calculara si la persona está en su peso ideal 
//    (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
//            menor que 20, significa que la persona está por debajo de su peso 
//            ideal y la función devuelve un -1. Si la fórmula da por resultado 
//            un número entre 20 y 25 (incluidos), significa que la persona está 
//            en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//            de la fórmula es un valor mayor que 25 significa que la persona 
//            tiene sobrepeso, y la función devuelve un 1.
//    
    public int calcularIMC(Persona puente) {

        double imc = (puente.getPeso() / ((puente.getAltura() / 100) * (puente.getAltura() / 100)));
        System.out.println("-IMC(" + imc + ")");
        int salida = 0;
        if (imc <= 20) {
            salida = -1;
        }
        if (imc > 25) {
            salida = 1;
        }
        return salida;
    }

    public String mayorEdad(Persona puente) {
        String salida;
        if (puente.getEdad() >= 18) {
            salida = "MAYOR";
        } else {
            salida = "MENOR";
        }
        return salida;
    }

    public void verPersona(Persona puente) {
        System.out.println("Nombre: " + puente.getNombre());
        System.out.println("Edad: " + puente.getEdad() + " - " + mayorEdad(puente));
        System.out.println("Sexto: " + puente.getSexo());
        System.out.println("Peso: " + puente.getPeso());
        System.out.println("Altura: " + puente.getAltura());
        System.out.println("Hobby: " + puente.getHobby());

        System.out.print("IMC: ");
        switch (calcularIMC(puente)) {
            case (-1):
                System.out.print("BAJO PESO");
                break;
            case (0):
                System.out.print("PESO NORMAL");
                break;
            case (1):
                System.out.print("SOBRE PESO");
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("");

    }

}
