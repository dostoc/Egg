
import Enitidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio puente = new CadenaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena fr = puente.mostrarVocales();
        puente.invertirFrase(fr);

        
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();
        puente.vecesRepetido(letra, fr);
         
        System.out.println("Ingrese una Frase a comparar: ");
        String frase = leer.next();
        puente.compararLongitud(frase, fr);

        puente.unirFrases(frase, fr);

        System.out.println("Ingrese una letra: ");
        String carac = leer.next();
        puente.reemplazar(carac, fr);

        System.out.println("Ingrese una letra a buscar: ");
        carac = leer.next();
        System.out.println("La letra esta??? " + puente.contiene(carac, fr));

    }

}
