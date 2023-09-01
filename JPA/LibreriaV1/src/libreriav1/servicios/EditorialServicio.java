/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.servicios;

import java.util.List;
import java.util.Scanner;
import libreriav1.entidades.Editorial;
import libreriav1.persistencia.EditorialDAO;

/**
 *
 * @author jonak
 */
public class EditorialServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final EditorialDAO DAO;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }

    Editorial editorial = null;

    public void menuEditorial() throws Exception {
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-Cargar Editoriales");
            System.out.println("2-Buscar Editorial por nombre");
            System.out.println("3-Eliminar Editorial");
            System.out.println("4-Editar");
            System.out.println("(0)-Volver al menu principal");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearEditorial();
                    break;
                case 2:
                    mostrarListaEditorial(buscarEditorial());
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    editarEditorial();
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

    public Editorial crearEditorial() {
        try {
            char eleccion;
            editorial = new Editorial();
            System.out.println("NUEVA EDITORIAL...............");
            System.out.print("Razon Social: ");

            editorial.setNombre(leer.next());
            editorial.setAlta(true);

            DAO.guardar(editorial);
            return editorial;

        } catch (Exception e) {
            throw e;
        } finally {
        }
    }

    public List<Editorial> buscarEditorial() throws Exception {
        System.out.println("Nombre del Editorial:");
        String nombre = leer.next();
        if (nombre == null) {
            throw new Exception("Debe indicar almenos una letra");
        }
        List<Editorial> editorialBuscado = DAO.buscarCoincidenciasPorNombre(nombre);
        System.out.println("Coincidencias: " + editorialBuscado.size());
        return editorialBuscado;
    }

    public List<Editorial> listarTodos() throws Exception {
        try {
            return DAO.listarTodos();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void mostrarListaEditorial(List<Editorial> aux) {
        System.out.println("RESULTADO DE BUSQUEDA.......");
        int cont = 0;
        for (Editorial editorial1 : aux) {
            cont++;
            System.out.println(cont + " ) " + editorial1);
        }
    }

    public Editorial seleccionarEditorial(List<Editorial> auxList) {
        Editorial resultado = null;
        int cont = 0;
        if (auxList.size() > 0) {
            mostrarListaEditorial(auxList);
            System.out.println("Seleccione por numero o indique(0) si no figura en la lista");
            int opcion = leer.nextInt();
            if (opcion == 0) {
                System.out.println("¿Desea crear nueva Editorial s/N?");
                if (leer.next().equalsIgnoreCase("S")) {
                    return crearEditorial();
                }
                resultado = null;
            } else {
                return auxList.get(opcion - 1);
            }
        }
        return resultado;
    }

    public void eliminar() {
        try {
            mostrarListaEditorial(listarTodos());
            System.out.println("Indique ID a eliminar");
            Editorial editorial = DAO.buscarPorId(leer.nextInt());
            if (editorial != null) {
                DAO.eliminar(editorial);
            } else {
                System.out.println("No existe editorial con ese ID");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Editorial estadoEditorial(Editorial editorial) {
        System.out.print("(1)Alta  (2)Baja ");
        boolean salir = false;
        char opcion = leer.next().toUpperCase().charAt(0);
        do {
            switch (opcion) {
                case '1' -> { editorial.setAlta(true);
                    salir = true; break;
                }
                case '2' -> { editorial.setAlta(false);
                    salir = true; break;
                }
                default -> System.out.println("Opcion Invalida");
            }
        } while (!salir);
        return editorial;
    }

    public void editarEditorial() {
        try {
            mostrarListaEditorial(listarTodos());
            System.out.println("Indique ID a modificar");
            Editorial editorial = DAO.buscarPorId(leer.nextInt());
            boolean salir = false;
            do {
                System.out.println("1-Modificar Nombre");
                System.out.println("2-Alta/BAJA");
                System.out.println("S-Salir");
                char opcion = leer.next().toUpperCase().charAt(0);
                switch (opcion) {
                    case '1':
                        System.out.println("Ingrese nuevo nombre");
                        editorial.setNombre(leer.next());
                        break;
                    case '2':
                        editorial = estadoEditorial(editorial);
                        break;
                    case 'S':
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                }
            } while (!(salir));

            if (editorial != null) {
                DAO.editar(editorial);
            } else {
                System.err.println("No existe editorial con ese ID");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
