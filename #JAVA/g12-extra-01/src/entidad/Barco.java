/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Date;
import java.util.Date;

/**
 *
 * @author jonak
 */
public class Barco {
    
    /**
     * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
     * fabricación. Sin embargo, se pretende diferenciar la información de
     * algunos tipos de barcos especiales: 
     * • Número de mástiles para veleros. 
     * • Potencia en CV para barcos a motor. 
     * • Potencia en CV y número de camarotes para yates de lujo.
     */
    
    protected String matricula;
    protected int eslora;
    protected Date fabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, Date fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }
    
    
    
    
    
}
