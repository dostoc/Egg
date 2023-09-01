/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.practica.pkg08;

/**
 *
 * @author jonak
 */
public class G13Practica08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Uno p = new Uno();
        
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }

}

