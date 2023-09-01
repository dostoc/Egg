/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g7_5_empleado;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class G7_5_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado();

        e1.setNombre("Juan");
        e1.setEdad(30); // antiguedad?
        e1.setSalario(100);

        System.out.println("ORIGEN");
        System.out.println("Empleado :" + e1.getNombre());
        System.out.println("Antigüedad :" + e1.getEdad());
        System.out.println("Salario :" + e1.getSalario());
        
        System.out.println("NUEVO");
        System.out.println("Empleado :" + e1.getNombre());
        System.out.println("Antigüedad :" + e1.getEdad());
        
        double nuevoSalario = e1.calcular_salario(e1.getEdad(), e1.getSalario());
        e1.setSalario(nuevoSalario);
        System.out.println("Salario :" + e1.getSalario());
        

    }

}
