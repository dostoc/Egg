/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriav1;

import libreriav1.servicios.PrincipalServicio;

/**
 *
 * @author jonak
 */
public class LibreriaV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PrincipalServicio pSRV = new PrincipalServicio();
        try {
            pSRV.principal();
            
        } catch (Exception e) {
            System.out.println("la cagaste" + e.getMessage());
        }
    }

}
