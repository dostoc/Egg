/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class SRVCliente {
    

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Cliente c = new Cliente();
    ArrayList<Cliente> listaCliente = new ArrayList();
    
    boolean salir = true;
    
    public void menuCliente() {
        do {
            System.out.println("MENU");
            System.out.println("1 ) Crear Cliente");
            System.out.println("2 ) Mostrar Clientes");
            System.out.println("9 ) Salir  ");

            System.out.println("....opcion: ");
            switch (leer.nextInt()) {
                case 1:
                    crearListaCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 9:
                    System.out.println("Saliendo.....");
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (salir);
    }


    public Cliente crearCliente() {
        System.out.print("Nuevo cliente: ");
        c.setNroSocio(leer.nextInt());
        return c;
    }

    public ArrayList<Cliente> crearListaCliente() {
        do {
            listaCliente.add(crearCliente());
            System.out.println("Desea cargar otro cliente - (S)Salir ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

        return listaCliente;
    }

    public boolean consultaCliente(int numeroSocio) {
        boolean existe = false;
        for (Cliente aux : listaCliente) {
            if (aux.getNroSocio() == numeroSocio) {
                System.out.println(aux.getNroSocio());
                existe = true;
                break;
            }
        }
        if (!(existe)) {
            System.out.println("Nro de socio inexistente");
            System.out.println("Desea crear Nuevo Socio s/N");
            if (leer.next().equalsIgnoreCase("s")) {
                listaCliente.add(crearCliente());
                existe = true;
            }
        }
        return existe;

    }
    
    public Cliente numeroACliente(int nroSocio){
        for (Cliente aux : listaCliente) {
            if (aux.getNroSocio()== nroSocio) {
                return aux;
            }
        }
        return null;
    }
    
    public void mostrarClientes(){
        for (Cliente aux : listaCliente) {
            System.out.println(aux.getNroSocio());
            
        }
    }

        
}

