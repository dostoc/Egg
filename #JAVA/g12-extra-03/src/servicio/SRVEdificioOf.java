/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Edificio;
import entidad.EdificioOf;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class SRVEdificioOf extends SRVEdificio{

    Scanner leer = new Scanner(System.in);

    /**
     * De esta clase nos interesa saber cuántas personas pueden trabajar en todo
     * el edificio, el usuario dirá cuántas personas entran en cada oficina,
     * cuantas oficinas y el número de piso (suponiendo que en cada piso hay una
     * oficina). Crear el método cantPersonas(), que muestre cuantas personas
     * entrarían en un piso y cuantas en todo el edificio.
     *
     * 16 Por último, en el main vamos a crear un ArrayList de tipo Edificio. El
     * ArrayList debe contener dos polideportivos y dos edificios de oficinas.
     * Luego, recorrer este array y ejecutar los métodos calcularSuperficie y
     * calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el
     * volumen de cada edificio.
     */
    
    SRVEdificio ed = new SRVEdificio();
    EdificioOf edOf = new EdificioOf();

    public EdificioOf crearEdificioOf() {
        Edificio edi = super.crearEdificio();
        edOf.setAlto(edi.getAlto());
        edOf.setAncho(edi.getAncho());
        edOf.setLargo(edi.getLargo());
        
        System.out.println("Personas por oficina: ");
        edOf.setCantPerXOf(leer.nextInt());
        
        System.out.println("Cantidad de pisos: ");
        edOf.setNroPisos(leer.nextInt());
        
        System.out.println("Cantidad de oficinas x piso: ");
        edOf.setNroOficinas(leer.nextInt());
        
        return edOf;
    }

    public void cantPersonasPiso(EdificioOf edOf) {
        System.out.println("Personas por Piso: " + edOf.getNroOficinas() * edOf.getCantPerXOf());
    }
    
    public int cantPersonasEdificio(EdificioOf edOf) {
        return edOf.getNroOficinas() * edOf.getCantPerXOf() * edOf.getNroPisos();
    }
    
    
    public void mostrarEdificioOf(EdificioOf edOf) {
        System.out.println("Edificio OFICINA");
        
        System.out.println("SUP...: " + edOf.calcularSuperficie() + "m2");
        System.out.println("VOL...: " + edOf.calcularVolumen() + "m3");
        System.out.println("PISOS.: " + edOf.getNroPisos() + "m3");
        System.out.println("Personas....: " + cantPersonasEdificio(edOf));
    }
    
    
    

}
