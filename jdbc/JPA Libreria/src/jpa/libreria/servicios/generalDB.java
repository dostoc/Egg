/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.libreria.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.libreria.entidades.Autor;
import jpa.libreria.entidades.Libro;

/**
 *
 * @author jonak
 */
public class generalDB {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_LibreriaPU");
    EntityManager em = emf.createEntityManager();
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void transaccion(Object aux){
        em.getTransaction().begin();
        em.persist(aux);
        em.getTransaction().commit();
    }
    
            Collection<Autor> listaAutor = new ArrayList();                    

    public void crearDB() {
        try {
            do {
                //UUID.randomUUID().toString();
                Random rnd = new Random();
                Autor aut1 =  new Autor();
                aut1.setId((rnd.nextInt(999 - 0 + 1) + 0));
                aut1.setNombre("JRR Tolkien");
                aut1.setAlta(true);
                transaccion(aut1);
                System.out.println("(S)Salir ");
                if (leer.next().equalsIgnoreCase("s")) {
                    break;
                }
            } while (true);
            
            do {
                //UUID.randomUUID().toString();
                Random rnd = new Random();
                Autor aut1 =  new Autor();
                aut1.setId((rnd.nextInt(999 - 0 + 1) + 0));
                aut1.setNombre("JRR Tolkien");
                aut1.setAlta(true);
                transaccion(aut1);
                System.out.println("(S)Salir ");
                if (leer.next().equalsIgnoreCase("s")) {
                    break;
                }
            } while (true);
            
            
            
            
            
            
            
            
            
//            
//            do {
//                Libro lib1 = new Libro();
//                lib1.setIsbn((long)(rnd.nextInt(99999999 - 0 + 1) + 0));
//                lib1.setTitulo("El señor de los anillos - Las dos torres");
//                lib1.setAnio(1980);
//                lib1.setEjemplares(20);
//                lib1.setEjemplaresPrestados(10);
//                lib1.setEjemplaresRestantes(10);
//                lib1.setAlta(true);
//                
//                System.out.println("Autor: ");
//                
//                lib1.setAutor(aut1);
//                lib1.setEditorial(editorial);
//            
//                 transaccion(lib1);
//                
//                System.out.println("(S)Salir ");
//                if (leer.next().equalsIgnoreCase("s")) {
//                    break;
//                }
//                
//            } while (true);
//            
            
//            
//            Random rnd = new Random();
//            Autor aut1 =  new Autor();
//            aut1.setId((rnd.nextInt(99999999 - 0 + 1) + 0));
//            aut1.setNombre("JRR Tolkien");
//            aut1.setAlta(true);
//            
//            transaccion(aut1);
//            
//            
            
//            Libro lib1 = new Libro();
//            lib1.setIsbn((long)(rnd.nextInt(99999999 - 0 + 1) + 0));
//            lib1.setTitulo("El señor de los anillos - Las dos torres");
//            lib1.setAnio(1980);
//            lib1.setEjemplares(20);
//            lib1.setEjemplaresPrestados(10);
//            lib1.setEjemplaresRestantes(10);
//            lib1.setAlta(true);
//            lib1.setAutor(aut1);
//            
//            transaccion(lib1);
//            
//            em.getTransaction().begin();
//            em.persist(lib1);
//            em.getTransaction().commit();
//            
            
            

            /*
            @Id
            private Long isbn;
            private String titulo;
            private Integer anio;
            private Integer ejemplares;
            private Integer ejemplaresPrestados;
            private Integer ejemplaresRestantes;
            private Boolean alta;

            @OneToOne
            private Autor autor;

            @OneToOne
            private Editorial editorial;
             */
        } catch (Exception e) {
            throw e;
        }

    }
}
