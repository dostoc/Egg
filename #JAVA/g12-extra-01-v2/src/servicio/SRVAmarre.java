/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Amarre;
import entidad.Barco;
import entidad.BarcoMotor;
import entidad.BarcoVelero;
import entidad.BarcoYate;
import entidad.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jonak
 */
public class SRVAmarre {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Amarre> amarresLista = new ArrayList();
    
    public void menuAmarres(){
        boolean salir = true;
        do {
            System.out.println("MENU");
            System.out.println("1 ) Ingreso de Barco");
            System.out.println("2 ) Alquiler de Barco ");
            System.out.println("3 ) Lista de Barcos");
            System.out.println("4 ) Lista de Barcos Disponibles ");
            System.out.println("5 ) Inyectar Amarres ");
            System.out.println("9 ). Salir  ");
            
            System.out.println("....opcion: ");
            switch (leer.nextInt()) {
                case 1:
                    crearListaAmarre();
                    break;
                case 2:
                    alquilerBarco();
                    break;
                case 3:
                    mostrarAmarre();
                    break;
                case 4:
                    barcosDisponibles();
                    break;
                case 5:
                    inyectarAmarres();
                    break;
                case 9:
                    System.out.println("(S) para salir u otra letra para continuar...");
                    if (leer.next().equalsIgnoreCase("s")) {System.out.println("Saliendo ...");salir= false;break;}
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while (salir);
    }
    
    
    public Barco nuevoBarco() {
        System.out.println("INGRESO DE BARCOS A PUERTO");
        System.out.println("1 ) Barco Generico ");
        System.out.println("2 ) Barco a Vela ");
        System.out.println("3 ) Barco a Motor ");
        System.out.println("4 ) Yate de Lujo ");
        System.out.println("9 ) Salir  ");

        System.out.println("....opcion: ");
        switch (leer.nextInt()) {
            case 1:
                return crearBarco();
            case 2:
                return crearBarcoVelero();
            case 3:
                return crearBarcoMotor();
            case 4:
                return crearBarcoYate();
            case 9:
                System.out.println("(S) para salir u otra letra para continuar...");
                if (leer.next().equalsIgnoreCase("s")) {System.out.println("Saliendo ...");break;}
            default:
                System.out.println("Opcion no valida");
        }
        return null;
    }
    

    public Amarre crearAmarre() {
        Amarre a1 = new Amarre();
        a1.setBarco(nuevoBarco());
        System.out.print("Ingreso.....:");
        a1.setfIngreso(fechaToDate());
        System.out.print("Egreso......:");
        a1.setfPartida(fechaToDate());
        a1.setCostoAmarre(costoEstadia(a1));
        return a1;
    }

    public ArrayList<Amarre> crearListaAmarre() {
        do {
            amarresLista.add(crearAmarre());
            System.out.println("(S) para salir u otra letra para continuar...");
            if (leer.next().equalsIgnoreCase("s")) {
                System.out.println("Saliendo ...");
                break;
            }
        } while (true);
        return amarresLista;
    }

    public void mostrarAmarre() {
        for (Amarre aux : amarresLista) {
            if(aux.getCliente()!= null) {
                System.out.println("** Embarcacion Alquilada** Amarre: "+ amarresLista.indexOf(aux));
                System.out.println("Socio: "+ aux.getCliente());
            }
            printBarco(aux.getBarco());
        }
    }
    
    public void inyectarAmarres(){
        amarresLista.add(new Amarre(new Barco("A01", 0, new Date(1999, 01, 01), 0), new Cliente(100), new Date(2000, 01, 01), new Date(2000, 2, 1), 100));
        amarresLista.add(new Amarre(new Barco("A03", 0, new Date(1999, 01, 01), 0), new Cliente(120), new Date(2000, 01, 01), new Date(2000, 2, 1), 100));
        amarresLista.add(new Amarre(new Barco("A04", 0, new Date(1999, 01, 01), 0), null, new Date(2000, 01, 01), new Date(2000, 2, 1), 100));
        
    }

    

    /**
     * CREACIONES DE BARCOS
     */
    
    public Barco crearBarco() {
        SRVBarco b1 = new SRVBarco();
        return b1.crearBarco();
    }

    public BarcoVelero crearBarcoVelero() {
        SRVBarcoVelero b1 = new SRVBarcoVelero();
        return b1.crearBarco();
    }

    public BarcoMotor crearBarcoMotor() {
        SRVBarcoMotor b3 = new SRVBarcoMotor();
        return b3.crearBarco();
    }

    public BarcoYate crearBarcoYate() {
        SRVBarcoYate b4 = new SRVBarcoYate();
        return b4.crearBarco();
    }

    /**
     *
     * FECHAS
     *
     */
    
    public Date fechaToDate() {
        System.out.println("(DD/MM/AAAA)");
        Date fechaDate = null;
        String fechaString = leer.next();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            fechaDate = formatoFecha.parse(fechaString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fechaDate;
    }

    /**
     * Calculo Alquiler dias X BASE
     */
    public int costoEstadia(Amarre aux) {
        int costo = aux.getBarco().getCostoBase() * diasAmarrado(aux);
        System.out.print(" c/TOTAL $ " + costo);
        System.out.println("");
        return costo;
    }

    public int diasAmarrado(Amarre aux) {
        long diferenciaEnMilisegundos = aux.getfPartida().getTime() - aux.getfIngreso().getTime();
        int dias = (int) TimeUnit.MILLISECONDS.toDays(diferenciaEnMilisegundos);
        System.out.print("Cant. DIAS: " + dias);
        return dias;
    }

// DIAS AMARRADO
    public void printBarco(Barco auxBarco) {
        System.out.println("BARCOS:");
        System.out.println("AMARRA Nro: " + amarresLista.indexOf(auxBarco) + " Eslora " + auxBarco.getEslora() + " " + " Botaje " + auxBarco.getFabricacion().getYear() + " MAT: " + auxBarco.getMatricula());
        
        if (auxBarco instanceof BarcoMotor) {
            System.out.println("TIPO AUTOPROPULSADO: MOTOR CV: " + ((BarcoMotor) auxBarco).getCv());
        }
        if (auxBarco instanceof BarcoVelero) {
            System.out.println("TIPO VELERO: MOTOR CV: " + ((BarcoVelero) auxBarco).getNroMastil());
        }

        if (auxBarco instanceof BarcoYate) {
            System.out.println("TIPO YATES DE LUJO: MOTOR CV: " + ((BarcoYate) auxBarco).getCv() + "CAMAROTES: " + ((BarcoYate) auxBarco).getNumeroCamarotes());
        }
        
        
    }
    
    SRVCliente puenteC = new SRVCliente();
    
    public void alquilerBarco(){
        System.out.println("Nro Cliente:");
        int numero = leer.nextInt();
        if(puenteC.consultaCliente(numero)) {
            barcosDisponibles();
            
            System.out.println("Seleccione una amarra ");
            int amarra = leer.nextInt();
            alquilarEsteBarco(amarra, numero);
        }
    }
    
    public void barcosDisponibles(){
        for (Amarre aux : amarresLista) {
            if (aux.getCliente()==null) {
                printBarco(aux.getBarco());
            }
        }
    }
    
    public void barcosNoDisponibles(){
        for (Amarre aux : amarresLista) {
            if (aux.getCliente()!=null) {
                printBarco(aux.getBarco());
            }
        }
    }
    
    
    public void alquilarEsteBarco(int index, int socio){
        if (puenteC.consultaCliente(socio)) {
            amarresLista.get(index).setCliente(puenteC.numeroACliente(socio));
        }
    }

}
