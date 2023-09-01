/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import enumeraciones.SexoHumano;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jona
 */
public class Usuario {
    
     
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
   
    private List<Mascota> mascotas;
    public Usuario() {
    
    }
    
    
}
