
import entidad.Estudiante;
import servicio.EstudianteServicio;

/*a
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Jona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteServicio puente = new EstudianteServicio();
        Estudiante est = new Estudiante();
        
        
        puente.crearEscuela(est);
        double promedio=puente.promedioEscuela(est);
        puente.notaNombre(est);
        
        
        
    }
    
}