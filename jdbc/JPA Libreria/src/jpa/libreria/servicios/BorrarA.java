/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jonak
 */
public class BorrarA {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_LibreriaPU");
    EntityManager em = emf.createEntityManager();
    
    public void transaccion(Object aux) {
        em.getTransaction().begin();
        em.persist(aux);
        em.getTransaction().commit();
    }
    
}
