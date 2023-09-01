/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.servicios;

import java.text.ParseException;
import java.util.Scanner;
import libreriav1.entidades.Libro;
import libreriav1.entidades.Prestamo;
import libreriav1.persistencia.PrestamoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import libreriav1.entidades.Cliente;

/**
 *
 * @author jonak
 */
public class PrestamoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ClienteServicio cSRV = new ClienteServicio();

    private final PrestamoDAO DAO;
    private LibroServicio lSRV = new LibroServicio();

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public PrestamoServicio() {
        this.DAO = new PrestamoDAO();
    }

    public void menuPrestamo() throws Exception {
        System.out.println("MENU PRESTAMOS");
        int opcion;
        char salir = 'n';
        do {
            System.out.println("1-Prestar Libro");
            System.out.println("2-Devolver Libro");
            System.out.println("3-Consultar fecha de libro");
            System.out.println("(S)-Salir");
            opcion = leer.next().toUpperCase().charAt(0);
            switch (opcion) {
                case '1':
                    crearPrestamo();
                    break;
                case '2':
                    devolverPrestamo();
                    break;
                case '3':
                    System.out.println("NO HABILITADO");
                    //disponibilidadLibro();
                    break;
                case 'S':
                    System.out.println("DESEA SALIR S/N");
                    salir = leer.next().toUpperCase().charAt(0);
                    break;

                default:
                    System.out.println("Opcion no reconocida");
            }

        } while (salir != 'S');
    }

    public Libro seleccionarLibro() {
        System.out.println("(1) Indique ISBN o (2)Busqueda por NOMBRE (3) Busqueda por Titulo");
        switch (leer.next()) {
            case "1":
                System.out.println("ISBN....: ");
                return lSRV.buscarPorISBN(leer.nextInt());
            case "2":
                lSRV.mostrarListaDeLibro(lSRV.buscarPorNombre());
            case "3":
                lSRV.mostrarListaDeLibro(lSRV.buscarPorAutor());
                break;
            default:
                throw new AssertionError();
        }
        return lSRV.buscarPorISBN(leer.nextInt());
    }

    public void crearPrestamo() {
        try {
            Prestamo prestamo = new Prestamo();
            System.out.println("Nuevo retiro: ");
            System.out.println("Ingrese Nombre de cliente: ");
            String cliente = leer.next();
            prestamo.setCliente(cSRV.seleccionarCliente(cSRV.buscarCliete(cliente)));
            prestamo.setLibro(lSRV.seleccionarLibro(lSRV.buscarLibro()));
            System.out.println("RECUERDE DEVOLVER EL LIBRO ANTES DE LOS 20 dias: ");
            prestamo.setFechaPrestamo(new Date());
            // la idea es consultar a la base 20 dias despues de la fecha de creacion si el libro esta devuelto
            prestamo.setFechaDevolucion(null);
            
            DAO.guardar(prestamo);
            lSRV.alquilarLibro(prestamo.getLibro());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolverPrestamo() {
        try {
            System.out.println("Ingrese nombre del cliente: ");
            Prestamo prestamo = seleccionarPrestamo(prestamosPorCliente(cSRV.seleccionarCliente((cSRV.buscarCliete(leer.next())))));
            System.out.println("Fecha de devolucion (DD-MM-AAAA)");
            try {
            Date fechaDevol = dateFormat.parse(leer.next());
            prestamo.setFechaDevolucion(fechaDevol);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Fecha de devolución inválida. Asegúrate de seguir el formato DD-MM-AAAA.");
            }
            
            lSRV.devolverLibro(prestamo.getLibro());
            DAO.editar(prestamo);
        } catch (Exception e) {
        }
    }

    public List<Prestamo> prestamosPorCliente(Cliente cliente) {
        return DAO.prestamosPorCliente(cliente);
    }

    public void mostrarListaCliente(List<Prestamo> aux) {
        System.out.println("RESULTADO DE BUSQUEDA.......");
        int cont = 0;
        for (Prestamo prestamo1 : aux) {
            cont++;
            System.out.println(cont + " ) " + prestamo1.getLibro().getTitulo()+ " de " + prestamo1.getLibro().getAutor());
        }
    }

    public Prestamo seleccionarPrestamo(List<Prestamo> auxList) {
        try {
            
        mostrarListaCliente(auxList);
        System.out.println("Seleccione el libro a devolver");
        int opcion = leer.nextInt();
        if (auxList.get(opcion - 1) == null){
            System.out.println("no existe");
        }
        return auxList.get(opcion - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
