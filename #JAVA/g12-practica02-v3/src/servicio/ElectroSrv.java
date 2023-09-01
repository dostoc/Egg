/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class ElectroSrv {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Electrodomestico electro = new Electrodomestico();

    public Electrodomestico crearElectrodomestico() {
        System.out.println("Creando electro");
        System.out.println("Precio 1000 por defecto");
        electro.setPrecio(1000);
        System.out.print("Peso...........: ");
        electro.setPeso(leer.nextInt());
        System.out.print("Consumo........: ");
        electro.setConsumo(comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0)));
        
//        electro.setPrecio(electro.getPrecio()+this.precioFinal());
        System.out.print("Color..........: ");
        electro.setColor(comprobarColor(leer.next().toUpperCase()));
        return electro;
    }

    public int precioFinal() {
        int incremento = 0;
        switch (electro.getConsumo()) {
            case 'A':
                incremento = 1000;
                break;
            case 'B':
                incremento = 800;
                break;
            case 'C':
                incremento = 600;
                break;
            case 'D':
                incremento = 500;
                break;
            case 'E':
                incremento = 300;
                break;
            case 'F':
                incremento = 100;
                break;
        }

        int pesoAux = electro.getPeso();
        if (pesoAux <= 19) {
            incremento += 100;
        }else if (pesoAux >= 20 && pesoAux <= 49) {
            incremento += 500;
        }else if (pesoAux >= 50 && pesoAux <= 79) {
            incremento += 800;
        }else if (pesoAux >= 80) {
            incremento += 1000;
        }
        return incremento;
    }

    protected char comprobarConsumoEnergetico(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        } else {
            System.out.println("Valor por defecto F");
            return 'F';
        }
        
    }

    protected String comprobarColor(String color) {
        String variosColores = "BLANCO NEGRO ROJO AZUL GRIS";
        if (variosColores.contentEquals(color)) {
            return color;
        } else {
            return "BLANCO";
        }
    }
}
