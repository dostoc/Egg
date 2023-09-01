/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *g12.practica02.v3;
 * @author jonak
 */
public class Lavadora extends Electrodomestico{
    
    protected int cargaLav; 

    public Lavadora() {
    }
    
    public Lavadora(int cargaLav, Integer precio, Integer peso, Character consumo, String color) {
        super(precio, peso, consumo, color);
        this.cargaLav = cargaLav;
    }

    public int getCargaLav() {
        return cargaLav;
    }

    public void setCargaLav(int cargaLav) {
        this.cargaLav = cargaLav;
    }
    
    @Override
    public String toString() {
        return "LAVADORA_______________________ \n"
            +  "Precio................$ " + precio +"\n"
            +  "Peso..................: " + peso   +"\n"
            +  "Consumo...............: " + consumo +"\n"
            +  "Color.................: " + color+"\n"
            +  "Carga.................: " + cargaLav+"\n"
            ;
    }
    
    public Lavadora convertirLavadora(Electrodomestico aux){
        Lavadora auxLav = (Lavadora) aux;
       return auxLav;
    }
    
    
}
