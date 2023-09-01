/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.servicios;

import java.util.List;
import java.util.Scanner;
import libreriav1.entidades.Autor;
import libreriav1.entidades.Cliente;
import libreriav1.persistencia.ClienteDAO;

/**
 *
 * @author jonak
 */
public class ClienteServicio {
    
    private final ClienteDAO DAO;

    public ClienteServicio() {
        this.DAO = new ClienteDAO();
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Cliente cliente = null;

    public void menuClientes() throws Exception {
        int opcion;
        char salir = 'n';
        do {
            System.out.println("----------------------------");
            System.out.println("CLIENTES:");
            System.out.println("1-Cargar Clientes");
            System.out.println("2-Ver Clientes");
            System.out.println("3-Mostrar libros alquilados");
            System.out.println("4-Eliminar Cliente");
            System.out.println("(0)-Volver al menu principal");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    mostrarListaCliente(listarTodos());
                    break;
                case 3:
                    //mostrarLibrosAlquilados();
                    break;
                case 4:
                    eliminar();
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

    public Cliente crearCliente() throws Exception {
        try {
            System.out.print("DOCUMENTO: ");
            Long documento = leer.nextLong();
            if (!(validarDocumento(documento))) {
                throw new Exception("Numero de DNI ya registrado");
            }
            cliente.setDocumento(documento);
            
            char eleccion;
            cliente = new Cliente();
            System.out.println("NUEVO CLIENTE...............");

            System.out.print("NOMBRE: ");
            String nombre= leer.next();
            if (nombre.isEmpty()) {
                throw new Exception("ERROR!: Falta ingresar dato");
            }
            cliente.setNombre(leer.next());
            
            System.out.print("APELLIDO: ");
            String apellido= leer.next();
            if (apellido.isEmpty()) {
                throw new Exception("ERROR!: Falta ingresar dato");
            }
            cliente.setApellido(leer.next());

            System.out.print("TELEFONO: ");
            String telefono= leer.next();
            if (telefono.isEmpty()) {
                throw new Exception("ERROR!: Falta ingresar dato");
            }
            cliente.setTelefono(leer.next());
            
            DAO.guardar(cliente);
            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }
    

    public List<Cliente> buscarCliete(String cliente) {
        try {
            if (cliente == null) {
                throw new Exception("Debe indicar almenos una letra");
            }
            List<Cliente> autorBuscado = DAO.buscarCoincidenciasPorNombre(cliente);
            return autorBuscado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Cliente> listarTodos() throws Exception {
        try {
            return DAO.listarTodos();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void mostrarListaCliente(List<Cliente> aux) {
        System.out.println("RESULTADO DE BUSQUEDA.......");
        int cont = 0;
        for (Cliente cliente1 : aux) {
            cont++;
            System.out.println(cont + " ) " + cliente1);
        }
    }

        public Cliente seleccionarCliente(List<Cliente> auxList) throws Exception {
        try {
            mostrarListaCliente(auxList);
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
            mostrarListaCliente(listarTodos());
            System.out.println("Indique ID a eliminar");
            DAO.eliminar(leer.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
    public boolean validarDocumento(Long aux){
        return DAO.validarExistenciaLONG(aux);
    }
}
    
