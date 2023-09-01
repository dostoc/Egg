/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.estancias.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import jdbc.estancias.entidades.Familia;

/**
 *
 * @author jonak
 */
public final class FamiliaDAO  extends DAO{
  
    
    
    public Collection<Familia> listaFamilia (int cantHijos, int edadMax) throws Exception {
        try {
            Collection<Familia> listaFam = new ArrayList();
            String str = "select * from familias  where "+cantHijos+" <= familias.num_hijos and edad_maxima < "+edadMax+";";
            
            consultarBase(str);
            Familia fam = new Familia();
            while (resultado.next()) {
                fam = new Familia();
                fam.setId(resultado.getInt(1));
                fam.setNombre(resultado.getString(2));
                fam.setEdad_minima(resultado.getInt(3));
                fam.setEdad_maxima(resultado.getInt(4));
                fam.setNum_hijos(resultado.getInt(5));
                fam.setEmail(resultado.getString(6));
                listaFam.add(fam);
            }
            
            return listaFam;
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
    
    public Collection<Familia> buscarCorreo(String email)throws Exception{
        try {
            
            Collection<Familia> listaFam = new ArrayList();
            
            String str = "select * from familias where familias.email like '%"+email+"%';";
            
            consultarBase(str);
            Familia fam = null;
            while (resultado.next()) {
                fam= new Familia();
                fam.setId(resultado.getInt(1));
                fam.setNombre(resultado.getString(2));
                fam.setEdad_minima(resultado.getInt(3));
                fam.setEdad_maxima(resultado.getInt(4));
                fam.setNum_hijos(resultado.getInt(5));
                fam.setEmail(resultado.getString(6));
                fam.setId_casa_familia(resultado.getInt(7));
                listaFam.add(fam);
            }
            return listaFam;
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    
    
    
    }
    
}
