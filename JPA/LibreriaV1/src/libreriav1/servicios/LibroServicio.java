/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.servicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreriav1.entidades.Editorial;
import libreriav1.entidades.Libro;
import libreriav1.persistencia.LibroDAO;

/**
 *
 * @author jonak
 */
public class LibroServicio {

    AutorServicio aSRV = new AutorServicio();
    EditorialServicio eSRV = new EditorialServicio();

    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Libro libro = null;

    public void menuLibros() {
        int opcion;
        char salir = 'n';
        do {
            System.out.println("----------------------------");
            System.out.println("Libros:");
            System.out.println("1-Cargar Libro");
            System.out.println("2-Buscar Libro por Titulo");
            System.out.println("3-Buscar Libro por Autor");
            System.out.println("4-Buscar Libro por Editorial");
            System.out.println("5-Eliminar");
            System.out.println("6-Editar");
            System.out.println("(0)-Volver al menu principal");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    mostrarListaDeLibro(buscarPorNombre());
                    break;
                case 3:
                    mostrarListaDeLibro(buscarPorAutor());
                    break;
                case 4:
                    mostrarListaDeLibro(buscarPorEditorial());
                    break;
                case 5:
                    eliminar();
                    break;
                case 6:
                    editarLibro(seleccionarLibro(buscarLibro()));
                    break;
                case 0:
                    System.out.println("DESEA VOLVER S/N");
                    salir = leer.next().toUpperCase().charAt(0);
                    break;

                default:
                    System.out.println("Opcion no reconocida");
            }

        } while (salir != 'S');
    }

    public Libro crearLibro() {
        try {
            Libro libro = new Libro();
            System.out.println("Ingrese nombre del autor");
            String nombre = leer.next();
            libro.setAutor(aSRV.seleccionarAutor(aSRV.buscarAutor(nombre)));

            System.out.println("Ingrese nombre de la Editorial");
            libro.setEditorial(eSRV.seleccionarEditorial(eSRV.listarTodos()));

            System.out.println("Ingrese ISBN");
            Integer isbn = leer.nextInt();

            if (isbn == null) {
                throw new Exception("Debe indicar el isbn");
            }
            if (buscarPorISBN(isbn) != null) {
                throw new Exception("Ya existe un libro con ese isbn " + isbn);
            }
            libro.setIsbn(isbn);

            System.out.println("Ingrese titulo del libro: ");
            String titulo = leer.next();
            if (titulo == null) {
                throw new Exception("Debe indicar el titulo");
            }
            libro.setTitulo(titulo);

            System.out.println("Ingrese año de fabricacion: ");
            Integer anio = null;
            try {
                anio = leer.nextInt();
            } catch (InputMismatchException e) {
                throw new Exception("Debe ingresar un valor numérico para el año");
            }
            if (anio == null) {
                throw new Exception("Debe indicar el año");
            }
            libro.setAnio(anio);

            System.out.println("Ingrese el numero de ejemplares: ");
            Integer ejemplares = null;
            try {
                ejemplares = leer.nextInt();
            } catch (InputMismatchException e) {
                throw new Exception("Debe ingresar un valor numérico para el numero de ejemplares");
            }
            if (ejemplares == null) {
                throw new Exception("Debe indicar el numero de ejemplares");
            }
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(ejemplares);
            libro.setAlta(estado());

            DAO.guardar(libro);
            
            if (DAO.buscarPorISBN(libro.getIsbn())!= null) {
                System.out.println("Libro creado correctamente");
            }
            return libro;
        } catch (Exception e) {
            // Mostrar el mensaje de error en la consola
            System.err.println("Error al crear el libro: " + e.getMessage());
            return null;
        }
    }

    public void mostrarAutor(List<Editorial> aux) {
        for (Editorial editorial : aux) {
            System.out.println(editorial);
        }
    }

    public Libro buscarPorISBN(Integer isbn) {
        try {
            return DAO.buscarPorISBN(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Libro> buscarPorNombre() {
        try {
            System.out.println("Ingrese nombre del autor:");
            String titulo = leer.next();

            return DAO.buscarCoincidenciasPorNombre(titulo);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    public void mostrarListaDeLibro(List<Libro> aux) {
        if (aux != null) {
            System.out.println("RESULTADO DE BUSQUEDA.......");
            int cont = 0;
            for (Libro autor1 : aux) {
                cont++;
                System.out.println(cont + " ) " + autor1);
            }
        }else{
            System.out.println("No se registran coincidencias");
        }
    }

    public List<Libro> buscarPorAutor() {
        try {

            System.out.println("Ingrese nombre del autor:");
            String autor = leer.next();
            return DAO.buscarPorAutor(autor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorEditorial() {
        try {
            System.out.println("Ingrese nombre de la editorial:");
            String nombre = leer.next();
            return DAO.buscarPorEditorial(nombre);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void eliminar() {
        try {
            mostrarListaDeLibro(DAO.listarTodos());
            System.out.println("Indique ISBN a eliminar");
            Libro libro = DAO.buscarPorISBN(leer.nextInt());
            if (libro != null) {
                DAO.eliminar(libro);
            } else {
                System.err.println("No existe editorial con ese ID");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Libro> buscarLibro() {
        try {
            System.out.println("Nombre del Libro:");
            String nombre = leer.next();
            if (nombre == null) {
                throw new Exception("Debe indicar almenos una letra");
            }

            List<Libro> libroBuscado = DAO.buscarCoincidenciasPorNombre(nombre);
            System.out.println("Coincidencias: " + libroBuscado.size());
            return libroBuscado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro seleccionarLibro(List<Libro> auxList) {
        Libro resultado = null;
        int cont = 0;
        if (auxList != null) {
            mostrarListaDeLibro(auxList);
            System.out.println("Seleccione por numero o indique(0) si no figura en la lista");
            int opcion = leer.nextInt();
            if (opcion == 0) {
                System.out.println("¿Desea cargar nuevo libro s/N?");
                if (leer.next().equalsIgnoreCase("S")) {
                    return crearLibro();
                }
                resultado = null;
            } else {
                return auxList.get(opcion - 1);
            }
        }
        return resultado;
    }

    // USADOS POR PRESTAMOS
    public boolean enExistencia(Libro libro) {
        try {
            boolean aux = DAO.disponibleLibro(libro);
            return aux;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean disponibleLibro(Libro libro) {
        return DAO.disponibleLibro(libro);
    }

    public Libro alquilarLibro(Libro libro) {
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
        DAO.editar(libro);
        return libro;
    }
    
    public Libro devolverLibro(Libro libro) {
        try {
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
        DAO.editar(libro);
        return libro;
        } catch (Exception e) {
            System.out.println("Operacion canselada " + e.getMessage());
        }
        return  null;
    }
    
    public void editarLibro(Libro libro){
        try {
            
        System.out.println("Datos originales");
        System.out.println(libro);
        System.out.println("Modificar Titulo");
        String titulo = leer.next();
        if (titulo != null){
            libro.setTitulo(titulo);
        }
        System.out.println("Modificar autor");
        System.out.print("(1)SI  (2)NO");
        char opcion = leer.next().toUpperCase().charAt(0);
        boolean salir = false;
        do {
            switch (opcion) {
                case '1' -> { 
                    System.out.print("Nombre Autor: ");
                    String nombre = leer.next();
                    libro.setAutor(aSRV.seleccionarAutor(aSRV.buscarAutor(nombre)));
                    salir = true;
                }
                case '2' -> { //op2;
                    salir = true;
                }
                default ->
                    System.out.println("Opcion Invalida");
            }
        } while (!salir);
        
        System.out.println("Modificar Total Libros");
        int total = leer.nextInt();
            libro.setEjemplares(total);
        System.out.println("Modificar Anio");
        int anio = leer.nextInt();
            libro.setEjemplares(anio);
            System.out.println("Indicar estado Alta/Baja");
            libro.setAlta(estado());
        DAO.editar(libro);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    public boolean estado(){
        try {
            System.out.println("Ingrese estado (A)alta (B)baja");
            char opcion = leer.next().toUpperCase().charAt(0);
            boolean salir = false;
            do {
                switch (opcion) {
                    case 'A' -> { return true;
                    }
                    case 'B' -> { return false;
                    }
                    default ->
                        System.out.println("Opcion Invalida");
                }
            } while (!salir);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return false;
    }
    
    
    
}
