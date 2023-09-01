/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12.extra.pkg03;

import entidad.Edificio;
import entidad.EdificioOf;
import entidad.Polideportivo;
import java.util.ArrayList;
import servicio.SRVEdificioOf;

/**
 *
 * @author Jona
 */
public class G12Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Edificio> listaEdificio = new ArrayList();
        SRVEdificioOf puente = new SRVEdificioOf();
        EdificioOf auxEdof = new EdificioOf();
        
        listaEdificio.add(puente.crearEdificioOf());
        listaEdificio.add(new EdificioOf(5, 10, 15, 10, 20, 10));
        listaEdificio.add(new Polideportivo("Peteco", true, 10, 10, 5));
        listaEdificio.add(new Polideportivo("Coloso", false, 10, 10, 5));
        
        for (Edificio aux : listaEdificio) {
            
            if (aux instanceof EdificioOf) {
                auxEdof = (EdificioOf) aux;
                puente.mostrarEdificioOf(auxEdof);
            }
            if (aux instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) aux;
                System.out.println("Polideportivo: " + object.getNombre() + " Techado: " + object.isTechado());
                
            }
                
            }
            
        }
        
    }
    
