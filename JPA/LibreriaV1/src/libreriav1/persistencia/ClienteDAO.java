/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.persistencia;

import java.util.List;
import libreriav1.entidades.Cliente;

/**
 *
 * @author jonak
 */
public class ClienteDAO extends DAO<Cliente>{
    
            @Override
    public void guardar(Cliente aux) {
        super.guardar(aux);
    }
        
    public void eliminar(Integer id) throws Exception {
        try {
            Cliente autor = buscarPorId(id);
            conectar();
                em.getTransaction().begin();
                Cliente entidadFusionada = em.merge(autor);
                em.remove(entidadFusionada);
                em.getTransaction().commit();
            desconectar();
            
        } catch (Exception e) {
            throw e;
        }
    }

    public Cliente buscarPorId(Integer id) throws Exception {
        conectar();
        Cliente autor = em.find(Cliente.class, id);
        desconectar();
        return autor;
    }

    public List<Cliente> buscarCoincidenciasPorNombre(String nombre) throws Exception {
        conectar();
        List<Cliente> autorBuscLado = (List<Cliente>) em.createQuery("SELECT at from Cliente at where at.nombre Like :nombre").setParameter("nombre", nombre + "%").getResultList();
        desconectar();
        return autorBuscLado;
    }


    public List<Cliente> listarTodos() throws Exception {
        try {
        conectar();
             List<Cliente> autores;
            autores = em.createQuery("SELECT c FROM Cliente c").getResultList();
        desconectar(); 
        return autores;
            
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean validarExistenciaLONG(Long documento){
        conectar();
         List<Cliente>  lista = (List<Cliente> )em.createQuery("Select c from Cliente c where c.documento = :documento").setParameter("documento", documento).getResultList();
        desconectar();
        return (lista.isEmpty());
    }
    
    
}
