/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *g12.practica02.v3;
 * @author jonak
 */
public class Televisor extends Electrodomestico{
    
    protected boolean tdt;
    protected int pantallaSize;

    public Televisor(boolean tdt, int pantallaSize, Integer precio, Integer peso, Character consumo, String color) {
        super(precio, peso, consumo, color);
        this.tdt = tdt;
        this.pantallaSize = pantallaSize;
    }

    public Televisor() {
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public int getPantallaSize() {
        return pantallaSize;
    }

    public void setPantallaSize(int pantallaSize) {
        this.pantallaSize = pantallaSize;
    }

  
    
    @Override
    public String toString() {
        return "TELEVISOR______________________ \n"
            +  "Precio................$ " + precio +"\n"
            +  "Peso..................: " + peso   +"\n"
            +  "Consumo...............: " + consumo +"\n"
            +  "Color.................: " + color+"\n"
            +  "Sintonizador..........: " + tdt +"\n"
            +  "Pantalla..pulgadas...: " + pantallaSize+"\n"
            ;
    }
}
