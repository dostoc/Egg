/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class GeneralSrv {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Electrodomestico> listaElectro = new ArrayList();

    public Electrodomestico crearElectro() {
        System.out.println("(1) Televisor (2) Lavadora");
        String tipo = leer.next();
        if (tipo.equals("1")) {
            System.out.println("Creando Televisor...");
            Televisor aux = crearTelevisorServicio();
            return aux;
        }
        if (tipo.equals("2")) {
            System.out.println("Creando Lavadora....");
            Lavadora aux = crearLavadoraServicio();
            return aux;
        }
        return null;
    }

    public void crearListaElectro() {
        do {
            System.out.println("CARGA DE ELECTRODOMESTICOS.......");

            listaElectro.add(crearElectro());

            System.out.println("Cargar otros electrodomestico (S)Si. (N)No");
            if (leer.next().equalsIgnoreCase("N")) {
                System.out.println("Saliendo de crear Lista ELECTROS...");
                break;
            }

        } while (true);
    }

    public void mostrarElectros() {
        System.out.println("*************LISTADO DE ELECTROS ************");
        for (Electrodomestico aux : listaElectro) {
            System.out.println(aux);
        }
        totalPrecios();

    }

    private Lavadora crearLavadoraServicio() {
        LavadoraSrv aux = new LavadoraSrv();
        return aux.crearLavadora();
    }

    private Televisor crearTelevisorServicio() {
        TelevisorSrv aux = new TelevisorSrv();
        return aux.crearTelevisor();
    }

    private void totalPrecios() {
        int sumaTelevisor = 0;
        int sumaLavadora = 0;
        for (Electrodomestico aux : listaElectro) {
            if (aux instanceof Televisor) {
                sumaTelevisor = sumaTelevisor + aux.getPrecio();
            }
            if (aux instanceof Lavadora) {
                sumaLavadora = sumaLavadora + aux.getPrecio();
            }
            
            
        }
        System.out.println("TOTAL ELECTRO....: " + (sumaLavadora + sumaTelevisor));
        System.out.println("TOTAL LAVADORA...: " + sumaLavadora);
        System.out.println("TOTAL TELEVISOR..: " + sumaTelevisor);
    
        
        
    }
        
        
}
