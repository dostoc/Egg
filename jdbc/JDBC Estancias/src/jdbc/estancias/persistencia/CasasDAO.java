/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.estancias.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import jdbc.estancias.entidades.Casas;

/**
 *
 * @author jonak
 */
public final class CasasDAO extends DAO{
    
    public Collection<Casas> disponiblePais(String pais, String inicio, String fin ) throws Exception{
        try {
            Collection<Casas> listaCasa = new ArrayList();
            String str = "select * from casas where casas.pais like '%"+pais+"%' and not exists  (select * from casas  where fecha_desde>= "+inicio+" and fecha_hasta <="+fin+")    ;";
            //String str = "select * from casas where casas.pais like 'Reino Unido' and not exists  (select * from casas  where fecha_desde>= 2020-08-01 and fecha_hasta <=2020-08-31);";
            consultarBase(str);
            Casas aux = null;
            while (resultado.next()) {                
               aux = new Casas();
               aux.setId_casa(resultado.getInt(1));
               aux.setCalle(resultado.getString(2));
               aux.setNumero(resultado.getInt(3));
               aux.setCodigo_postal(resultado.getString(4));
               aux.setCiudad(resultado.getString(5));
               aux.setPais(resultado.getString(6));
               aux.setFecha_desde(resultado.getDate(7));
               aux.setFecha_hasta(resultado.getDate(8));
               aux.setTiempo_minimo(resultado.getInt(9));
               aux.setTiempo_maximo(resultado.getInt(10));
               aux.setPrecio_habitacion(resultado.getDouble(11));
               aux.setTipo_vivienda(resultado.getString(12));
               listaCasa.add(aux);
               
            }
            
            return listaCasa;
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
        
    
    }
    
    public Collection<Casas> disponibleEstadia(String inicio, int duracion) throws Exception {
        try {
            Collection<Casas> listaCasa = new ArrayList();
            
            String str = 
            
            return listaCasa;
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    
    
    
    
    
    }
    
    
}
