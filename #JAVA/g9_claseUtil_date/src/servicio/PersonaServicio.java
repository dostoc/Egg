/*
Implemente la clase Persona en el paquete entidades. Una persona tiene 
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
constructor parametrizado, get y set. Crear una clase PersonaService, 
en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona 
a crear. Retornar el objeto Persona creado.

Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
*/
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona() {
        Persona puente = new Persona();
        System.out.println("Ingrese Nombre");
        puente.setNombre(leer.next());
        System.out.println("Ingrese Fecha Nacimiento(AAAA MM DD) : ");
        puente.setFnacimiento(new Date(leer.nextInt()-1900,leer.nextInt()-1,leer.nextInt()));
        return puente;
    }
    
    // Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha
    // de nacimiento y la fecha actual.
    
    public int calcuarEdad(Persona puente){
        Date fechaActual= new Date();
        return (fechaActual.getYear() - puente.getFnacimiento().getYear());
    }
    
    // Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
    // persona es menor que la edad consultada o false en caso contrario.
    
    public boolean menorQue (Persona puente, int edad){
        if (calcuarEdad(puente)>edad) {
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarPersona(Persona puente){
        System.out.println("Nombre: "+ puente.getNombre());
        System.out.println("Fecha Nacimiento: " + puente.getFnacimiento().getDay() +"/"+puente.getFnacimiento().getMonth()+"/" +puente.getFnacimiento().getYear());
    }
}
