/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *g12.practica02.v3;
 * @author jonak
 */
public class Electrodomestico {
    
    protected int precio;
    protected Integer peso;
    protected Character consumo;
    protected String color;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, Integer peso, Character consumo, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", consumo=" + consumo + ", color=" + color + '}';
    }

    
    
}
