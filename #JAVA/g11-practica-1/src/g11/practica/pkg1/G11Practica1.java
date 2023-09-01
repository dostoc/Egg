package g11.practica.pkg1;

import entidad.Persona;
import entidad.Perro;
import java.util.Scanner;
import servicio.AdoptarMascotaServicio;

public class G11Practica1 {

    public static void main(String[] args) {
        AdoptarMascotaServicio puente = new AdoptarMascotaServicio();
        Scanner leer = new Scanner(System.in);
        boolean salir = true;
        do {
        System.out.println("MENU");
        System.out.println("1 ). Ingreso de personas  ");
        System.out.println("2 ). Ingreso de perros  ");
        System.out.println("3 ). Mostrar perros disponibles  ");
        System.out.println("4 ). Adoptar perros  ");
        System.out.println("5 ). Lista de adoptantes  ");
        System.out.println("6 ). Salir  ");
        
        System.out.println("....opcion: ");
        switch (leer.nextInt()) {
            case 1:
                puente.crearListaPersona();
                break;
            case 2:
                puente.crearListaPerro();
                break;
            case 3:
                 puente.mostrarSetPerrosDisponibles();
                break;
            case 4:
                puente.adoptarPerro();
                break;
            case 5:
                puente.mostrarSetPersonaConPerros();
                break;
            case 6:
                System.out.println("Saliendo.....");
                salir = false;
                break;
            default:
                System.out.println("Opcion no valida");
        }

         } while (salir);
        
       
        
        
       
        
        
        
    }
}
