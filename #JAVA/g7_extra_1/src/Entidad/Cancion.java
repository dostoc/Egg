/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class Cancion {
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void cancionMano (){
        Scanner leer = new Scanner(System.in);
        System.out.print("Titulo..:");
        titulo = leer.next();
        System.out.print("Autor...:");
        autor = leer.next();
               
    }
    
    public void cancionParametro (String titulo, String autor){
        
    }
    
        
}
