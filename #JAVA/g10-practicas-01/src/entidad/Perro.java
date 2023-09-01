package entidad;


import java.util.ArrayList;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jona
 */
public class Perro {
    private String raza;
    private Integer edad;
    private String nombre;
    private ArrayList<String> vacunasArray;
    private TreeSet<String> vacunasTree;

    public Perro() {
    }

    public Perro(String raza, Integer edad, String nombre, ArrayList<String> vacunasArray, TreeSet<String> vacunasTree) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.vacunasArray = vacunasArray;
        this.vacunasTree = vacunasTree;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getVacunasArray() {
        return vacunasArray;
    }

    public void setVacunasArray(ArrayList<String> vacunasArray) {
        this.vacunasArray = vacunasArray;
    }

    public TreeSet<String> getVacunasTree() {
        return vacunasTree;
    }

    public void setVacunasTree(TreeSet<String> vacunasTree) {
        this.vacunasTree = vacunasTree;
    }
    
    
    
    
}
