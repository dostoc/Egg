package servicio;

import java.util.Comparator;
import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class AdoptarMascotaServicio {

    private TreeSet<Persona> personaSet = new TreeSet<>(new Persona.ordenaPersonas());
    private TreeSet<Perro> perroSet = new TreeSet<>(new Perro.ordenarPerros());

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("NUEVA PERSONA");
        System.out.print("Nombre.......:");
        String nombre = leer.next();
        System.out.print("Apellido.....:");
        String apellido = leer.next();
        System.out.print("Edad.........:");
        Integer edad = leer.nextInt();
        System.out.print("Documento....:");
        Integer documento = leer.nextInt();
        return new Persona(nombre, apellido, edad, documento, new Perro());
    }

    public Perro crearPerro() {
        System.out.println("NUEVO PERRO");
        System.out.print("Nombre.......:");
        String nombre = leer.next();
        System.out.print("Edad.........:");
        Integer edad = leer.nextInt();
        System.out.print("Raza.........:");
        String raza = leer.next();
        System.out.print("Tamanio......:");
        Integer tamanio = leer.nextInt();
        return new Perro(nombre, raza, edad, tamanio);
    }

    public TreeSet<Persona> crearListaPersona() {
        System.out.println("Cantidad de adoptantes.......: ");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            personaSet.add(this.crearPersona());
        }
        return personaSet;
    }

    public TreeSet<Perro> crearListaPerro() {
        System.out.println("Cantidad de perros..........: ");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            perroSet.add(this.crearPerro());
        }
        return perroSet;
    }

    public boolean validarmascota(String nombrePerro) {
        boolean libre = true;
        Iterator<Persona> it = personaSet.iterator();
        while (it.hasNext()) {
            Persona next = it.next();
            String nombrePerroActual = next.getPerritoAdoptado().getNombre();
            if (nombrePerro.equalsIgnoreCase(nombrePerroActual)) {
                libre = false;
            }
        }
        return libre;
    }
    
    public boolean tienemascota(String nombre){
        boolean tiene= true;
        for (Persona persona : personaSet) {
            if (persona.getNombre().equals(nombre)) {
            } if (persona.getPerritoAdoptado() == null) {
                tiene =  false;
            } else {
                tiene = true;
            }
        }
        return tiene;
    }

    public boolean validarNombrePersona(String nombre) {
        boolean existe = false;
        for (Persona persona : personaSet) {
            if (persona.getNombre().equals(nombre)) {
                if (this.tienemascota(nombre)) {
                existe = true;
                break;
                }
            } else {
                System.out.println("No se encuentra registrado ");
                System.out.println("¿Desea Registar? s/n");
                if (leer.next().equalsIgnoreCase("s")) {
                    personaSet.add(crearPersona());
                    existe = true;
                }
            }
        }
        return existe;
    }

    public boolean validarNombreMascota(String nombre) {
        boolean existe = false;
        for (Perro perro : perroSet) {
            if (perro.getNombre().equals(nombre)) {
                existe = true;
            } else {
                System.out.println("No se encuentra registrado ");
                System.out.println("¿Desea Registar? s/n");
                if (leer.next().equalsIgnoreCase("s")) {
                    perroSet.add(crearPerro());
                    existe = true;
                }
            }
        }
        return existe;
    }

    public boolean validarRegistro(){
        boolean registroP = true;
        boolean registroM = true;
        if (personaSet.size() == 0) {
            System.out.println("No hay registro de personas");
            registroP =  false;
        }
        if (perroSet.size() == 0) {
            System.out.println("No hay registro de mascotas");
            registroM = false;
        }
        return (registroP && registroM == true);
    } 
    
    public Perro asignarPerro(String nombrePerro) {
        Perro perroAsignado = null;
        for (Perro perroAux : perroSet) {
            if (perroAux.getNombre().equalsIgnoreCase(nombrePerro)) {
                perroAsignado = perroAux;
            }
        }
        return perroAsignado;
    }

    public void adoptarPerro() {
        if (validarRegistro()) {
        System.out.println("Nombre de la persona adoptante: ");
        String adoptante = leer.next();
        if (validarNombrePersona(adoptante)) {
            for (Persona auxPersona : personaSet) {
                if (adoptante.equals(auxPersona.getNombre())) {
                    System.out.println("Nombre del perro: ");
                    String nombrePerro = leer.next();
                    if (validarNombreMascota(nombrePerro)) {
                        if (validarmascota(nombrePerro)) {
                            auxPersona.setPerritoAdoptado(this.asignarPerro(nombrePerro));
                            System.out.println("Perro " + auxPersona.getPerritoAdoptado().getNombre() + "  Asignado a -> Nombre  " + auxPersona.getNombre() + " " + auxPersona.getApellido());
                            break;
                        } else {
                            System.out.println("Perro no disponible!");
                        }
                    }
                    System.out.println(".......................................");
                }
            }
        }
        }
    }

    public void mostrarSetPersonaConPerros() {
        System.out.println("Lista de Personas con mascotas:.......");
        for (Persona persona : personaSet) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + "Mascota: " + persona.getPerritoAdoptado().getNombre());
        }
    }

    public boolean perroLibre(Perro pAux) {
        boolean libre = true;
        Iterator<Persona> it = personaSet.iterator();
        while (it.hasNext()) {
            Persona next = it.next();
            if (pAux == next.getPerritoAdoptado()) {
                libre = false;
            }
        }
        return libre;
    }

    public void mostrarSetPerrosDisponibles() {
        int cont = 0;
        System.out.println("Lista de Perros disponibles:");
        Iterator<Perro> it = perroSet.iterator();
        while (it.hasNext()) {
            Perro next = it.next();
            if (perroLibre(next)) {
                System.out.println(next);
                cont ++;
                System.out.println(cont);
            }
            if (cont==0){
                System.out.println("No hay perros disponibles");
            }
        }
    }
}

