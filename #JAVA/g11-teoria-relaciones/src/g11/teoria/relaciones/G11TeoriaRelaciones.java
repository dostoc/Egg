/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g11.teoria.relaciones;

import entidad.Dni;
import entidad.Inmueble;
import entidad.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonak
 */
public class G11TeoriaRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Dni dp1 = new Dni();
        Inmueble in1 = new Inmueble();
        
        p1.setDocumento(dp1); // Se relaciona persona p1 con objeto tipo dni dp1
        
        p1.setApellido("Ape");
        p1.setNombre("Nom");
        
        p1.getDocumento().setNumero(9999);
        p1.getDocumento().setSerie('a');
        
        
        //Agregando un array
        List<Integer> propiedades = new ArrayList();
        propiedades.add(5);
        
        in1.setCantPropiedades(propiedades);
        p1.setCantInmuebles(in1);
        
       
        p1.getCantInmuebles().getCantPropiedades().add(1, 16);
        
        
        // hay que reescribir toString en persona y dni
        System.out.println(p1.toString());
        
       
       
    }
    
}
