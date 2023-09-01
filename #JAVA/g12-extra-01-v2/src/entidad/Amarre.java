/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jonak
 */


public class Amarre {
    
    
        protected Barco barco;
        protected Cliente cliente;
        protected Date fIngreso;
        protected Date fPartida;
        protected int costoAmarre;

    public Amarre() {
    }

    public Amarre(Barco barco, Cliente cliente, Date fIngreso, Date fPartida, int costoAmarre) {
        this.barco = barco;
        this.cliente = cliente;
        this.fIngreso = fIngreso;
        this.fPartida = fPartida;
        this.costoAmarre = costoAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public Date getfPartida() {
        return fPartida;
    }

    public void setfPartida(Date fPartida) {
        this.fPartida = fPartida;
    }

    public int getCostoAmarre() {
        return costoAmarre;
    }

    public void setCostoAmarre(int costoAmarre) {
        this.costoAmarre = costoAmarre;
    }


    
    public String formatoDDMMYYYY (Date aux){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(aux);
        return fechaFormateada;
    }

    @Override
    public String toString() {
        return    ".....................Amarre....................." + "\n"
                + "Barco....:" + barco  + "\n"
                + "Ingreso..:" + formatoDDMMYYYY(fIngreso) + "\n"
                + "Partida..:" + formatoDDMMYYYY(fPartida) + "\n"
                + "Alquiler.$" + costoAmarre  + "\n";
    }
    
    
    
    
    
    
        
        
}
