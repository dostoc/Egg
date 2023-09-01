/*
Clase Date
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios, que tenga los siguientes métodos:

Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 

Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Método fechaActual que cree un objeto fecha con el día actual.

Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();

El método debe retornar el objeto Date.

Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia
de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
package servicio;

import entidad.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    Date puente = new Date();
   
    public Date fechaNacimiento(){        //01-34-6789 arranca a contar desde 0
        System.out.println("Ingrese f.Nac (DD/MM/AAAA): ");
        String fechaString = leer.next();
        puente.setDate(Integer.parseInt(fechaString.substring(0, 2)));
        puente.setMonth(Integer.parseInt(fechaString.substring(3, 5)));
        puente.setYear(Integer.parseInt(fechaString.substring(6, 10)));
        return puente;
    }
    
    
    public Date fechaActual(){
        Date fechaAct = new Date();
        return fechaAct;
    }
    
    public void edad(Date puente, Date fechaAct){
        System.out.println("Tiene: ");
        System.out.println("Anios: "+ (fechaAct.getYear()- puente.getYear()+1900));
    }
}
