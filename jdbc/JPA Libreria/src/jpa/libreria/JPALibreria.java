/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpa.libreria;

import jpa.libreria.servicios.generalDB;

/**
 *
 * @author jonak
 */
public class JPALibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        generalDB gdb = new generalDB();
        gdb.crearDB();
    }
    
}
