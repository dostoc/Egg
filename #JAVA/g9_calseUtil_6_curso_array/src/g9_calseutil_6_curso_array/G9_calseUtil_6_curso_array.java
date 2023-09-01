/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_calseutil_6_curso_array;

import entidad.Curso;
import servicios.CursoServicios;

/**
 *
 * @author Jona
 */
public class G9_calseUtil_6_curso_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicios puente = new CursoServicios();
        Curso cr = puente.crearCurso();
        
        puente.verCruso(cr);
        
    }
    
}