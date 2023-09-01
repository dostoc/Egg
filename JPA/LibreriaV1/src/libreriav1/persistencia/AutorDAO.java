/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.persistencia;

import java.util.List;
import libreriav1.entidades.Autor;

/**
 *
 * @author jonak
 */

public class AutorDAO extends DAO<Autor>{
    
    
    
    @Override
    public void guardar(Autor aux) {
        super.guardar(aux);
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor); 
    }
        
    @Override
    public void eliminar(Autor autor) {
        try {
            conectar();
                em.getTransaction().begin();
                Autor entidadFusionada = em.merge(autor);
                em.remove(entidadFusionada);
                em.getTransaction().commit();
            desconectar();
            
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor buscarPorId(Integer id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public List<Autor> buscarCoincidenciasPorNombre(String nombre) throws Exception {
        conectar();
        List<Autor> autorBuscLado = (List<Autor>) em.createQuery("SELECT at from Autor at where at.nombre Like :nombre").setParameter("nombre", nombre + "%").getResultList();
        desconectar();
        return autorBuscLado;
    }


    public List<Autor> listarTodos() throws Exception {
        try {
        conectar();
             List<Autor> autores;
            autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar(); 
        return autores;
            
        } catch (Exception e) {
            return null;
        }
    }

    
    
    
}
