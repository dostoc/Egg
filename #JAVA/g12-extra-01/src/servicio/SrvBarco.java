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
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonak
 */
public class SrvBarco extends SrvAmarre{
    
    
    
    
    public Barco crearBarco(){
        Barco b1 = new Barco();
        System.out.println("Fecha fabricacion: ");
        b1.setFabricacion(super.fechaToDate());
        System.out.println("Eslora................: ");
        b1.setEslora(leer.nextInt());
        System.out.println("Matricula.............: ");
        b1.setMatricula(leer.next());
        return b1;
    }
    
   
    
    
    
    

    
    
    
    
    /**
     * En los barcos de tipo especial el módulo de cada barco se calcula sacando
     * el módulo normal y sumándole el atributo particular de cada barco. En los
     * veleros se suma el número de mástiles, en los barcos a motor se le suma
     * la potencia en CV y en los yates se suma la potencia en CV y el número de
     * camarotes.
     */
    
    
        
}
