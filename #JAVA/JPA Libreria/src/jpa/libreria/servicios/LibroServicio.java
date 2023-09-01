/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.libreria.servicios;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpa.libreria.entidades.Libro;

/**
 *
 * @author jonak
 */
public class LibroServicio {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_LibreriaPU");
    EntityManager em = emf.createEntityManager();

}
