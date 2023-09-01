/** 4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,  tendremos una clase Pelicula con el título, director y duración de la película (en horas).  Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo  que se pide a continuación:
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario  todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere  crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 * 21
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en  pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en  pantalla.
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static servicio.Comparadores.ordenarPorDirector;
import static servicio.Comparadores.ordenarPorDuracion;
import static servicio.Comparadores.ordenarPorDuracionMasLarga;
import static servicio.Comparadores.ordenarPorTitulo;

/**
 *
 * @author jonak
 */
public class PeliculaServicio {
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        System.out.println("NUEVA PELICULA --------- ");
        System.out.print("Titulo.........: ");
        String titulo = leer.next();
        System.out.print("Director.......: ");
        String director = leer.next();
        System.out.print("Duracion (hs)..: ");
        int duracion = leer.nextInt();
        return new Pelicula(titulo, director, duracion);
    }
    
    public void crearListaPeliculas() {
        listaPeliculas.add(new Pelicula("El perro", "Lalo Losla", 2));
        listaPeliculas.add(new Pelicula("El Gato", "Lacule", 5));
        listaPeliculas.add(new Pelicula("El tigre", "Pancho", 4));
        listaPeliculas.add(new Pelicula("La mugre", "Lalo Losla", 1));
        /*
        do {
            listaPeliculas.add(crearPelicula());
            System.out.println("Desea salir s/n: ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
        */
        
    }
    
    public void  mostrarPeliculas(){
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void mostarPeliculasHora(){
        System.out.println("----PELICULAS 1 Hora ----");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getDuracion()> 1) {
                System.out.println(listaPeliculas.get(i));
            }
        }
    }
    
    public void ordenarPeliculasDuracion(){
        System.out.println("----PELICULAS x Duracion ----");
        Collections.sort(listaPeliculas, ordenarPorDuracion);
    }
    
    public void ordenarPeliculasDuracionMasLarga(){
        System.out.println("----PELICULAS x Duracion ----");
        Collections.sort(listaPeliculas, ordenarPorDuracionMasLarga);
    }
    
    
    
    public void ordenarPeliculasDirector() {
        System.out.println("----PELICULAS x Director ----");
        Collections.sort(listaPeliculas, ordenarPorDirector);
    
    }
    public void ordenarPeliculasTitulo(){
        System.out.println("----PELICULAS x Titulo ----");
        Collections.sort(listaPeliculas, ordenarPorTitulo);
    }
    
    
}
