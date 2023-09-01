/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import tienda.servicios.MenuService;

/**
 *
 * @author jonak
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        MenuService menu = new MenuService();
        menu.menuPrincipal();
        
    }
    
}
