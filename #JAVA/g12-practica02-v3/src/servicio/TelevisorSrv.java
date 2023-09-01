/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Electrodomestico;
import entidad.Televisor;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class TelevisorSrv extends ElectroSrv{
    
    Televisor tel = new Televisor();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Televisor crearTelevisor(){
         Electrodomestico auxElec = crearElectrodomestico();
        System.out.println("Sintoniz..S/N: ");
        if (leer.next().equalsIgnoreCase("s")) {
            tel.setTdt(true);
        } else {
            tel.setTdt(false);
        }
        System.out.println("Pantalla size..........: ");
        tel.setPantallaSize(leer.nextInt());
        tel.setColor(auxElec.getColor());
        tel.setConsumo(auxElec.getConsumo());
        tel.setPeso(auxElec.getPeso());
        tel.setPrecio(auxElec.getPrecio());
        tel.setPrecio(precioFinal());
    return tel;
    }

    @Override
    public int precioFinal() {
        int precioElect = super.precioFinal();
        int incremento = 0;
        if (tel.getPantallaSize() >= 40) {
            incremento = (int)(precioElect+ precioElect*0.3);
        }
        if (tel.isTdt()) {
            incremento = incremento + 500;
        }
        return incremento+precioElect;
    }
}
