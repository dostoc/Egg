/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_claseutil_4_date;

import entidad.Fecha;
import java.util.Date;
import servicio.FechaService;

/**
 *
 * @author Jona
 */
public class G9_claseUtil_4_date {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        FechaService puente=new FechaService();
        Date fc = puente.fechaNacimiento();
        
        puente.fechaActual();
        // TODO code application logic here
        
        puente.edad(fc, puente.fechaActual());
        
        
        
    }
    
}
