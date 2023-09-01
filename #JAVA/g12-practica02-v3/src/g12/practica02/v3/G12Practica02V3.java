/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12.practica02.v3;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import servicio.ElectroSrv;
import servicio.GeneralSrv;
import servicio.LavadoraSrv;
import servicio.TelevisorSrv;

/**
 *
 * @author jonak
 */
public class G12Practica02V3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
          
          GeneralSrv puente = new  GeneralSrv();
          puente.crearListaElectro();
          puente.mostrarElectros();
                  
          
    }
    
}
