/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Amarre;
import entidad.Barco;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jonak
 */
public class SrvAmarre {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Amarre a1 = new Amarre();
    SrvBarco b1 = new SrvBarco();
    ArrayList<Amarre> listaAmarres = new ArrayList();
    
    public Amarre ingresoPuerto(){
        a1.setB1( b1.crearBarco());
        a1.setfIngreso(fechaToDate());
        a1.setfPartida(fechaToDate());
        a1.setCostoAlquiler(costoAlquiler());
        return a1;
    }
    
    public int costoAlquiler(){
        System.out.println("Estadia..(dd/mm/aaaa).........");
        System.out.print("Ingreso......................: ");
        Date ingreso = fechaToDate();
        System.out.print("Egreso.......................: ");
        Date salida = fechaToDate();
        int estadia = (int)TimeUnit.MILLISECONDS.toDays(ingreso.getTime()-salida.getTime());
        int costoEstadia = estadia * this.moduloBarco();
        return costoEstadia;
    }
    
    public Date fechaToDate(){
    Date fecha= null;
    String fechaString = leer.next();
        DateFormat formatoFecha = new SimpleDateFormat("DD-MM-AAAA");

        try {
            fecha = formatoFecha.parse(fechaString);
        } catch (ParseException ex) {
            System.out.println("Error fecha");
        }
        return fecha;
    }
    public int moduloBarco(){
        return (a1.getB1().getEslora()*10);
    } 
    
    public void crearListaAmarres(){
        System.out.println("Lista de amarres");
    }
    
    
}
