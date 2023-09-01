/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class EstudianteServicio {
    
    /*
    Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo 
    de objetos tipo Estudiante, usando ese arreglo tenemos 
    que realizar las dos tareas que nos ha pedido la escuela.
    
    Calcular y mostrar el promedio de notas de todo el curso
    
    Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso

    Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

    Nota: para crear un vector de objetos la definición es la siguiente:
    Objeto nombreVector[] = new Objeto[];
    */
    Scanner leer = new Scanner(System.in);
    
    public Estudiante crearEstudiante(){
        Estudiante puente = new Estudiante();
        System.out.print("Ingrese Nombre del alumno: ");
        puente.setNombre(leer.next());
        System.out.print("Ingrese Nota Fianl: ");
        puente.setNota(leer.nextDouble());
        System.out.println("-----------------------------");
    return puente;    
    }
    
    public void crearEscuela(Estudiante puente){
        Estudiante[] aux = new Estudiante[puente.getArrayEstudiantes().length];
        for (int i = 0; i < puente.getArrayEstudiantes().length; i++) {
            aux[i]=this.crearEstudiante();
        }
        puente.setArrayEstudiantes(aux);
    }
    // Calcular y mostrar el promedio de notas de todo el curso
    
    public double promedioEscuela(Estudiante puente){
        double notas=0;
        Estudiante[] aux=puente.getArrayEstudiantes();
        
        for (int i = 0; i < (puente.getArrayEstudiantes().length); i++) {
            notas = notas + aux[i].getNota();
        }
        return (notas/puente.getArrayEstudiantes().length);
    }
    
//Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    
    
    public String[] mejorEscuela(Estudiante puente){
        Estudiante[] aux = puente.getArrayEstudiantes();
        String[] mejores = new String[puente.getArrayEstudiantes().length];
        double promedio = this.promedioEscuela(puente);
        System.out.println("Promedio del alumnado: "+ promedio);
        for (int i = 0; i < (puente.getArrayEstudiantes().length); i++) {
            if (aux[i].getNota() > promedio){
                mejores[i]=aux[i].getNombre();
            }
        }
    return mejores;
    }
    
    
//Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio
    
    public void notaNombre(Estudiante puente){
        double promedio = this.promedioEscuela(puente);
        System.out.println("Promedio Alumando: " + promedio);
        Estudiante[] aux = puente.getArrayEstudiantes();
        System.out.println("Alumnos Destacados: ");
        for (int i = 0; i < (puente.getArrayEstudiantes().length); i++) {
            if (aux[i].getNota() > promedio) {
                System.out.println(aux[i].getNota()+ " : " + aux[i].getNombre());
            }
        }
    }
    
    
    
    
    
}
