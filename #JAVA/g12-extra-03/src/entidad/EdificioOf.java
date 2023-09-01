/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaz.CalculosInterface;

/**
 *
 * @author Jona
 */
public class EdificioOf extends Edificio implements CalculosInterface{
    
    
    /**
     *      * • Clase EdificioDeOficinas con sus atributos número
     * de oficinas, cantidad de personas por oficina y número de pisos. Esta
     * clase implementará los dos métodos abstractos y los atributos del padre.
     * De esta clase nos interesa saber cuántas personas pueden trabajar en todo
     * el edificio, el usuario dirá cuántas personas entran en cada oficina,
     * cuantas oficinas y el número de piso (suponiendo que en cada piso hay una
     * oficina). Crear el método cantPersonas(), que muestre cuantas personas
     * entrarían en un piso y cuantas en todo el edificio.
     */
    
    
    
    protected int nroOficinas;
    protected int cantPerXOf;
    protected int nroPisos;

    public EdificioOf() {
    }
    
    public EdificioOf(int nroOficinas, int cantPerXOf, int nroPisos, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.nroOficinas = nroOficinas;
        this.cantPerXOf = cantPerXOf;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPerXOf() {
        return cantPerXOf;
    }

    public void setCantPerXOf(int cantPerXOf) {
        this.cantPerXOf = cantPerXOf;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public String toString() {
        return "EdificioOf{" + "nroOficinas=" + nroOficinas + ", cantPerXOf=" + cantPerXOf + ", nroPisos=" + nroPisos + '}';
    }

   
    @Override
    public int calcularSuperficie() {
        return this.ancho * this.largo;
    }
    

    @Override
    public int calcularVolumen() {
        return this.ancho * this.largo * this.alto;
    }
    
}
