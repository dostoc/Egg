/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class NIFServicio {
//    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra 
//    que le corresponderá. Una vez calculado, le asigna la letra que le 
//    corresponde según
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String[] arrayLetra  = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};   
    NIF puente = new NIF();
    
    public NIF ingresarDatos(){
        System.out.println("Ingrese su documento: ");
        puente.setDNI(leer.nextLong());
        return puente;
        
    }
    
    public void crearNif(String[] arrayLetra, NIF puente) {
        puente.setLetra(arrayLetra[(int)(puente.getDNI()%24)]);
        System.out.println("LETRA NIF: " + puente.getLetra());
    }
        /*
          Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y
          la letra en mayúscula; por ejemplo: 00395469-F).
        */
    public void mostrar(NIF puente,String[] arrayLetra) {
        System.out.println("NIF: " + puente.getDNI()+"-"+puente.getLetra());
    }
    
    
}
