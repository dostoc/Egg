/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.libreria.servicios;

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

    Random rnd = new Random();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void transaccion(Object aux) {
        em.getTransaction().begin();
        em.persist(aux);
        em.getTransaction().commit();
    }

    public void crearAutor() {
        Autor aut1 = new Autor();
        aut1.setId((rnd.nextInt(999 - 0 + 1) + 0));
        aut1.setNombre("JRR Tolkien");
        aut1.setAlta(true);
        transaccion(aut1);
    }
    
    public void crearDB(){
        do {
            crearAutor();
            System.out.println("(S)Salir ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }
        } while (true);
        
    }
    public void buscarAutor(){
        System.out.println("Indique nombre Autor...:");
        String nombre = leer.next();
        Collection<Autor> autAux = em.createQuery("Select a from autor a where a.NOMBRE LIKE :NOMBRE").setParameter("NOMBRE", "%"+nombre+"%").getResultList();
        for (Autor autor : autAux) {
            System.out.println(autor);
        }
    
    }

}
