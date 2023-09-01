/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.Collection;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import principal.Fabricante;
import principal.Producto;

/**
 *
 * @author jonak
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaPU");
            EntityManager em = emf.createEntityManager();

            try {

//                Fabricante fabricante1 = new Fabricante();
//                fabricante1.setId(UUID.randomUUID().toString()); // generador hash
//                fabricante1.setCodigo(1);
//                fabricante1.setNombre("Kasserine");
//                
//                em.getTransaction().begin();
//                em.persist(fabricante1);
//                em.getTransaction().commit();
//                
//                
//                Fabricante fabricante2 = new Fabricante();
//                fabricante2.setId(UUID.randomUUID().toString()); // generador hash
//                fabricante2.setCodigo(2);
//                fabricante2.setNombre("Capilatis");
//                
//                em.getTransaction().begin();
//                em.persist(fabricante2);
//                em.getTransaction().commit();
//                
//                /* CREACION DE PRODUCTOS */
//                
//                Producto prod1 = new Producto();
//                prod1.setId(UUID.randomUUID().toString());
//                prod1.setCodigo(1);
//                prod1.setDescripcion("Shampoo Ortiga Graso 420 ml");
//                prod1.setId_fabrica(fabricante2);
//                
//                em.getTransaction().begin();
//                em.persist(prod1);
//                em.getTransaction().commit();
//                
//                
//                Producto prod2 = new Producto();
//                prod2.setId(UUID.randomUUID().toString());
//                prod2.setDescripcion("Jabon con glicerina 60g");
//                prod2.setId_fabrica(fabricante1);
//                prod2.setCodigo(11);
//                
//                em.getTransaction().begin();
//                em.persist(prod2);
//                em.getTransaction().commit();
//                  Fabricante fabricante1 = (Fabricante) em.createQuery("SELECT f + FROM fabricante f where p.codigo = :codigo").setParameter("codigo", 1).getSingleResult();
                int codigo = 1;
                Fabricante fabricante1 = (Fabricante) em.createQuery("SELECT f FROM Fabricante f WHERE f.codigo = :codigo").setParameter("codigo", codigo).getSingleResult();
                System.out.println(fabricante1);
                
                Fabricante fabricantex = em.find(Fabricante.class, fabricante1.getId());
                System.out.println(fabricantex);
                
                Collection<Fabricante> listaFabricante = em.createQuery("select f from Fabricante f").getResultList();
                for (Fabricante fabricante : listaFabricante) {
                    System.out.println(fabricante);
                }
                
                
               
                
            } catch (Exception e) {
                throw e;
            }

        } catch (Exception e) {
            throw e;
        }

    }

}
