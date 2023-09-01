/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class FechaServicio {
    private Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento (){
        
        
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = leer.nextInt();
        
        Date fecha = new Date (anio - 1900, mes-1,dia);
        
        
        return fecha;
    }
    
    public Date fechaActual(){
        
       Date fechaActual = new Date();
       return fechaActual;
        
    }
    
    public int diferencia (Date fechaNacimiento , Date fechaActual){
        
        int x = fechaActual.getYear() - fechaNacimiento.getYear();
        return x;
    }
    
    
    
    
}