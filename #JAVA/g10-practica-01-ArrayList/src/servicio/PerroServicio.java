/**
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class PerroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> perrosLista = new ArrayList();

    //Crear raza de perro
    public Perro crearRazas() {
        System.out.print("Ingrese Raza...: ");
        String raza = leer.next();
        return new Perro(raza);
    }

    //Crear Lista raza de perros
    public void listaRazas() {
        do {
            perrosLista.add(crearRazas());
            System.out.print("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
    }

    //Iterator
    /**
     * Continuando el ejercicio anterior, después de mostrar los perros, al
     * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
     * buscará el perro en la lista. Si el perro está en la lista, se eliminará
     * el perro que ingresó el usuario y se mostrará la lista ordenada. Si el
     * perro no se encuentra en la lista, se le informará al usuario y se
     * mostrará la lista ordenada.
     */
    public void imprimirLista() {
        System.out.println("--------Razas Ingresadas--------");
        for (Perro aux : perrosLista) {
            System.out.println(aux);
        }
    }

    public void recorrerIterator(String razaBuscada) {
        // IMPORTANTE DEFINIR EL ITEARTOR DENTRO DEL METODO
        Iterator<Perro> it = perrosLista.iterator();
        boolean existe = false;
        while (it.hasNext()) {
            Perro next = it.next();
            if (next.getRaza().equals(razaBuscada)) {
                it.remove();
                existe = true;
                break;
            }
            if (!(existe)) {
                System.out.println("La raza no se ");
            }
        }
    }

}
