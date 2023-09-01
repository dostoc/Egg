/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g10.practica.pkg03;

import java.util.Scanner;
import servicio.AlumnoServicio;

/**
 *
 * @author jonak
 */
public class G10Practica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio puente = new AlumnoServicio();
        puente.crearListaAlumnos();

        do {
            System.out.println("----VER PROMEDIOS----");
            System.out.println("Ingrese nombre Alumno");
            String alumno = leer.next();
            if (puente.esAlumno(alumno)) {
                puente.notaFinal(alumno);
            } else {
                System.out.println("El alumno no existe");
            }
            System.out.println("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

    }

}
