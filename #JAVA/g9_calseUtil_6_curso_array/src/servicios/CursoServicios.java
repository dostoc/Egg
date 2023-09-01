/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jona
 */
public class CursoServicios {

    Scanner leer = new Scanner(System.in);
    Curso puente = new Curso();

    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
    alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar
    esta información en un arreglo e iterar con un bucle, solicitando en cada
    repetición que se ingrese el nombre de cada alumno.
     */
    
    public String[] cargarAlumnos() {
        String[] aux = new String[5];
        System.out.println("Nombre del alumno");
        for (int i = 0; i < 5; i++) {
            aux[i]=leer.next();
        }
        return aux;
    }

    public void verAlumnos(String[] aux) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ") " + aux[i]);
        }
    }

    /*
    Método crearCurso(): el método crear curso, le pide los valores de los
    atributos al usuario y después se le asignan a sus respectivos atributos 
    para llenar el objeto Curso. En este método invocamos al método cargarAlumnos()
    para asignarle valor al atributo alumnos
     */
    
    public Curso crearCurso() {
        System.out.println("Nombre curso");
        puente.setNombreCurso(leer.next());
        System.out.print("Horas x dias.....: ");
        puente.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Dias  x semana...: ");
        puente.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Turno m/t........: ");
        puente.setTurno(leer.next());
        System.out.print("Ganancias p/hora $");
        puente.setPrecioPorHora(leer.nextInt());
        System.out.println("Cargar Alumnos");
        puente.setAlumnos(cargarAlumnos());
        return puente;
    }

    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
    el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
     */
    
    public int calcularGananciaSemanal(Curso puente) {
        int ganancia = puente.getCantidadHorasPorDia() * puente.getCantidadDiasPorSemana() * puente.getPrecioPorHora();
        return ganancia;
    }

    public void verCruso(Curso puente) {
        System.out.println("**************************");
        System.out.println("Nombre curso......: " + puente.getNombreCurso());
        System.out.println("Horas x dias......: " + puente.getCantidadHorasPorDia());
        System.out.println("Dias  x semana....: " + puente.getCantidadDiasPorSemana());
        System.out.println("Turno m/t.........: " + puente.getTurno());
        System.out.println("Gan. MENSUAL......$ " + calcularGananciaSemanal(puente));
        verAlumnos(puente.getAlumnos());
    }
}
