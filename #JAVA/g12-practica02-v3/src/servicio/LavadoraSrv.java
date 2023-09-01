/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Electrodomestico;
import entidad.Lavadora;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class LavadoraSrv extends ElectroSrv {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Lavadora puenteLav = new Lavadora();

    //int carga;

    public Lavadora crearLavadora() {
        Electrodomestico auxElec = crearElectrodomestico();
        System.out.print("Carga..........: ");
        puenteLav.setCargaLav(leer.nextInt());
        
        puenteLav.setColor(auxElec.getColor());
        puenteLav.setConsumo(auxElec.getConsumo());
        puenteLav.setPrecio(auxElec.getPrecio());
        puenteLav.setPeso(auxElec.getPeso());
        
        puenteLav.setPrecio(auxElec.getPrecio()+ precioFinal());
        return puenteLav;
    }

    @Override
    public int precioFinal() {
        int incrementoElectro = super.precioFinal();
        int incremento = 0;
        if (puenteLav.getCargaLav()> 30) {
            incremento = 500;
        }
        return incremento + incrementoElectro;
    }
}
