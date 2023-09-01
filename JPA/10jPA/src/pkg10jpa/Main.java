package pkg10jpa;

import entidades.Autor;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        try {
             EntityManager em = Persistence.createEntityManagerFactory("10jPAPU").createEntityManager();
             try {
                Autor autor = new Autor( "borges",true);
                em.getTransaction().begin();
                em.persist(autor);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog( null, "coneccion correcta a la base de datos");
            } catch (Exception e) {
                JOptionPane.showMessageDialog( null, "error: " + e.toString());
            }
        } catch (Exception e) {
        }
//        try {
//            EntityManager em=Persistence.createEntityManagerFactory("10jPAPU").createEntityManager();
//            try {
//                Libro libro = new Libro()
//            } catch (Exception e) {
//            }
//        } catch (Exception e) {
//        }
       
    }
  
}