/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.persistencia;

import java.util.List;
import libreriav1.entidades.Editorial;

/**
 *
 * @author jonak
 */
public class EditorialDAO extends DAO<Editorial> {
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    @Override
    public void eliminar(Editorial objeto)  {
        super.eliminar(objeto);
    
    }

    
    /*
    entityManager.getTransaction().begin(); 
   Libro libroAdmin = entityManager.merge(libro); // Fusionar la entidad 
    entityManager.remove(libroAdmin); // Eliminar la entidad fusionada 
    entityManager.getTransaction().commit(); 
    
    
    */
    
    
//    @Override
//    public void eliminar(Editorial editorial) {
//        try {
//            conectar();
//                em.getTransaction().begin();
//                Editorial entidadFusionada = em.merge(editorial);
//                em.remove(entidadFusionada);
//                em.getTransaction().commit();
//            desconectar();
//            
//        } catch (Exception e) {
//            throw e;
//        }
//    }

    @Override
    public void editar(Editorial editorial) {
        conectar();
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
        desconectar();
    }
    

    public Editorial buscarPorId(Integer id) throws Exception {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }

    public List<Editorial> buscarCoincidenciasPorNombre(String nombre) throws Exception {
        conectar();
        List<Editorial> autorBuscLado = (List<Editorial>) em.createQuery("SELECT at from Editorial at where at.nombre Like :nombre").setParameter("nombre", nombre + "%").getResultList();
        desconectar();
        return autorBuscLado;
    }


    public List<Editorial> listarTodos() {
        try {
        conectar();
             List<Editorial> autores;
            autores = em.createQuery("SELECT a FROM Editorial a").getResultList();
        desconectar(); 
        return autores;
            
        } catch (Exception e) {
            return null;
        }
    }
    
}
