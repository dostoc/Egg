/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 3. Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main. *
 */
public class AlumnoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList();

    public Alumno crearAlumno() {
        ArrayList<Integer> notasAux = new ArrayList();
        System.out.println("Ingrese datos del alumno: ");
        System.out.print("Nombre....:");
        String nombre = leer.next();
        System.out.println("Ingrese notas:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota (" + (i + 1) + ") :");
            notasAux.add(leer.nextInt());
        }
        return new Alumno(nombre, notasAux);
    }

    public void crearListaAlumnos() {
        do {
            listaAlumnos.add(crearAlumno());
            System.out.println("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
    }

    public boolean esAlumno(String alumno) {
        boolean existe = false;
        for (Alumno listaAlumno : listaAlumnos) {
            if (listaAlumno.getNombre().equals(alumno)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void notaFinal(String alumno) {
        int nota = 0;
        int j = 0;
        int notaPromedio = 0;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(alumno)) {
                ArrayList<Integer> notas = listaAlumnos.get(i).getNotas();
                for (j = 0; j < notas.size(); j++) {
                    notaPromedio = notaPromedio + notas.get(i);
                }
            }
        }
        System.out.println("Nota Promedio de " + alumno + " es " + (notaPromedio / j));
    }
}
