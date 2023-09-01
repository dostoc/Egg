/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.estancias.servicios;

import jdbc.estancias.persistencia.CasasDAO;
import jdbc.estancias.persistencia.FamiliaDAO;

/**
 *
 * @author jonak
 */
public class MenuServicio {
    
        FamiliaDAO fDAO = new FamiliaDAO();
        FamiliaServicio fSRV = new FamiliaServicio(fDAO);
        
        CasasDAO cDAO = new CasasDAO();
        CasasServicio cSRV = new CasasServicio(cDAO);
        
        public void menu(){
        
            //fSRV.listarfamilia();
            //cSRV.listarCasasPaisOcupacion();
            //fSRV.listaFamiliaCorreo();
        
        }
        
}
