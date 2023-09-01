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
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.libreria.entidades.Autor;

/**
 *
 * @author jonak
 */
public class AutorServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_LibreriaPU");
    EntityManager em = emf.createEntityManager();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random rnd = new Random();

    public void transaccion(Object aux) {
        em.getTransaction().begin();
        em.persist(aux);
        em.getTransaction().commit();
    }

    Collection<Autor> listaAutor = new ArrayList();
    

    public void crearAutor() {
        try {
            Autor aut1 = new Autor();
                System.out.println("CREAR AUTOR");
                System.out.print("ID.........:");
                aut1.setId(leer.nextInt());
                System.out.print("NOMBRE.....:");
                aut1.setNombre(leer.next());
                System.out.print("ALTA..T/F..:");
                aut1.setAlta(leer.nextBoolean());

                transaccion(aut1);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarAutor(){
        System.out.println("Indique nombre Autor...:");
        String nombre = leer.next();
        Collection<Autor> autAux = em.createQuery("Select a from autor a where a.NOMBRE LIKE :NOMBRE").setParameter("NOMBRE", "%"+nombre+"%").getResultList();
        for (Autor autor : autAux) {
            System.out.println(autor);
        }
    
    }
                

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

}
