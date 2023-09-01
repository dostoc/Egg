/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.servicios;

import java.util.List;
import java.util.Scanner;
import libreriav1.entidades.Autor;
import libreriav1.persistencia.AutorDAO;

/**
 *
 * @author jonak
 */
public class AutorServicio {

    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Autor autor = null;

    public void menuAutores() throws Exception {
        int opcion;
        char salir = 'n';
        do {
            System.out.println("----------------------------");
            System.out.println("AUTORES:");
            System.out.println("1-Cargar Autores");
            System.out.println("2-Buscar Autor por nombre");
            System.out.println("3-Eliminar Autor");
            System.out.println("4-Mostrar autores");
            System.out.println("5-Editar autores");
            System.out.println("(0)-Volver al menu principal");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearAutores();
                    break;
                case 2:
                    System.out.println("Nombre del autor");
                    mostrarListaAutor(buscarAutor(leer.next()));
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    mostrarListaAutor(listarTodos());
                    break;
                case 5:
                    editarAutor();
                    break;
                case 0:
                    System.out.println("DESEA VOLVER S/N");
                    salir = leer.next().toUpperCase().charAt(0);
                    break;

                default:
                    System.out.println("Opcion no reconocida");
            }

        } while (!(salir == 'S'));

    }

    public void crearAutores() throws Exception {
        try {
            char salir = 'n';
            do {
                crearAutor();
                System.out.println("(s)Salir o enter para continuar carga...");
                leer.nextLine();
                salir = leer.next().toLowerCase().charAt(0);
            } while (salir != 's');
        } catch (Exception e) {
        }
    }

    public void crearAutor() throws Exception {
        try {
            String continuar = "";
            autor = new Autor();
            System.out.println("NUEVO AUTOR...............");

            System.out.print("Apellido, Nombre: ");
            String nombre = leer.next();
            if (nombre.isEmpty()) {
                System.out.println("¡ERROR! Debe ingresar un nombre");
                leer.nextLine();
            } else {
                if (!buscarAutor(nombre).isEmpty()) {
                    System.out.println("ADVERTENCIA! Nobre de autor existente - ENTER para continuar - (S)Salir");
                    continuar = leer.nextLine();
                }
            }
            if (continuar.equalsIgnoreCase("")) {
                autor.setNombre(nombre);
                autor.setAlta(true);
                DAO.guardar(autor);
                System.out.println("Autor: " + autor.getNombre() + " ID: " + autor.getId() + " guardado");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Autor> listarTodos() throws Exception {
        try {
            return DAO.listarTodos();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void mostrarListaAutor(List<Autor> aux) {
        System.out.println("RESULTADO DE BUSQUEDA.......");
        int cont = 0;
        for (Autor autor1 : aux) {
            cont++;
            System.out.println(cont + " ) " + autor1);
        }
    }

    public List<Autor> buscarAutor(String autor) {
        try {
            if (autor == null) {
                throw new Exception("Debe indicar almenos una letra");
            }
            List<Autor> autorBuscado = DAO.buscarCoincidenciasPorNombre(autor);
            return autorBuscado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor seleccionarAutor(List<Autor> auxList) throws Exception {
        try {
            mostrarListaAutor(auxList);
            System.out.println("Seleccione por numero");
            int opcion = leer.nextInt();
            if (auxList.get(opcion - 1) == null) {
                throw new Exception(" Posicion incorrecta");
            }
            return auxList.get(opcion - 1);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminar() {
        try {
            System.out.println("ELIMINAR AUTOR --------");
            System.out.println("Ingrese el nombre del autor o ENTER para ver todos");
            DAO.eliminar(seleccionarAutor(buscarAutor(leer.next())));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Autor estadoAutor(Autor autor) {
        System.out.print("(1)Alta  (2)Baja ");
        boolean salir = false;
        char opcion = leer.next().toUpperCase().charAt(0);
        do {
            switch (opcion) {
                case '1' -> {
                    autor.setAlta(true);
                    salir = true;
                    break;
                }
                case '2' -> {
                    autor.setAlta(false);
                    salir = true;
                    break;
                }
                default ->
                    System.out.println("Opcion Invalida");
            }
        } while (!salir);
        return autor;
    }

    public void editarAutor() {
        try {
            System.out.println("Ingrese el nombre del autor o ENTER para ver todos");
            mostrarListaAutor(buscarAutor(leer.next()));
            System.out.println("Indique ID a modificar");
            Autor autor = DAO.buscarPorId(leer.nextInt());
            if (autor == null) {
                throw new Exception(" ID de auror incorrecto");
            }
            boolean salir = false;
            do {
                System.out.println("1-Modificar Nombre");
                System.out.println("2-Alta/BAJA");
                System.out.println("S-Salir");
                char opcion = leer.next().toUpperCase().charAt(0);
                switch (opcion) {
                    case '1':
                        System.out.println("Ingrese nuevo nombre");
                        String nombre = leer.next();
                        if (buscarAutor(nombre).isEmpty()) {
                            autor.setNombre(nombre);
                        }
                        break;
                    case '2':
                        autor = estadoAutor(autor);
                        break;
                    case 'S':
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                }
            } while (!(salir));
            DAO.editar(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
