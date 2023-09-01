/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class AdoptaUnPerrito {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> perroLista = new ArrayList();
    ArrayList<Persona> personaLista = new ArrayList();

    public Perro CrearPerro() {
        System.out.println("Ingreso de Perros");
        System.out.print("Nombre.....:");
        String nombre = leer.next();
        System.out.print("Raza.......:");
        String raza = leer.next();
        System.out.print("Edad.......:");
        int edad = leer.nextInt();
        System.out.print("Tamaño.....:");
        int tamanio = leer.nextInt();
        return new Perro(nombre, raza, edad, tamanio);
    }

    public Persona CrearPersona() {
        System.out.println("Ingreso de Persona");
        System.out.print("Nombre.....:");
        String nombre = leer.next();
        System.out.print("Apellido.......:");
        String apellido = leer.next();
        System.out.print("Edad.......:");
        int edad = leer.nextInt();
        System.out.print("Documento.....:");
        int documento = leer.nextInt();
        return new Persona(nombre, apellido, edad, documento,new Perro());
    }

    public void crearListaPerro() {
        do {
            perroLista.add(this.CrearPerro());
            System.out.println("(S)Salir ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
    }

    public void crearListaPersona() {
        do {
            personaLista.add(this.CrearPersona());
            System.out.println("(S)Salir ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
    }

    public void mostrarListaPerro() {
        System.out.println("--------MASCOTAS-------");
        for (Perro aux : perroLista) {
            System.out.println(aux);
        }
    }

    public void mostrarListaPersona() {
        System.out.println("--------ADOPTANTES-------");
        for (Persona aux : personaLista) {
            System.out.println(aux);
        }
    }

    public boolean verificarExistenciaPerro(String perroDeseado) {
        boolean existe = false;
        for (int i = 0; i < perroLista.size(); i++) {
            if (perroDeseado.equals(perroLista.get(i).getNombre())) {
                System.out.println("existe desde metodo");
                existe = true;
                break;
            }
        }
        
        if (!(existe)) {
            System.out.println("El perro no existe");
        }
        return existe;
    }

    public boolean verificarPerro(String perroDeseado) {
        String perroAux;
        boolean estaDisponible = true;
        for (int i = 0; i < personaLista.size(); i++) {
            perroAux = personaLista.get(i).getPerrito().getNombre();
            if (perroDeseado.equals(perroAux)) {
                System.out.println("El perro esta adoptado");
                estaDisponible = false;
            }
        }
        return estaDisponible;
    }

    public void verPerrosDisponibles() {
        Perro pAux;
        for (int i = 0; i < perroLista.size(); i++) {
            pAux = perroLista.get(i);
            if (verificarPerro(pAux.getNombre()))
                System.out.println(pAux);
        }
        /*
        for (int i = 0; i < perroLista.size(); i++) {
            pAux = perroLista.get(i);
            boolean disponible = true;
            for (int j = 0; j < personaLista.size(); j++) {
                if (pAux == personaLista.get(j).getPerrito()) {
                    disponible = false;
                    break;
                }
            }
            if (disponible) {
                System.out.println(pAux);
            }
        }
        */
    }

    public void adoptaPerrito() {

        for (int i = 0; i < personaLista.size(); i++) {
            System.out.println(personaLista.get(i).getNombre() + "Indique nombre de su perrito deseado");
            do {
                String perroDeseado = leer.next();
                // verifica existencia
                if (verificarExistenciaPerro(perroDeseado)) {
                    System.out.println("existencia");
                    // verifica disponibilidad
                    if (verificarPerro(perroDeseado)) {
                        System.out.println("disponibilidad");
                        for (int j = 0; j < perroLista.size(); j++) {
                            personaLista.get(i).setPerrito(perroLista.get(j));
                            personaLista.get(i).getPerrito().setTamanio(i);
                            break;
                        }
                    }
                }
                System.out.println("Desea Salir (S) / Ingrese otro perro (N) ");

                if (leer.next().equalsIgnoreCase("s")) {
                    break;
                }
            } while (true);
        }

    }

}
