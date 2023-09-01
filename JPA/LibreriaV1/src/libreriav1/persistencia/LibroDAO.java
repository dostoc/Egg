/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.persistencia;

import java.util.List;
import libreriav1.entidades.Libro;

/**
 *
 * @author jonak
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro aux) {
        super.guardar(aux);
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro); 
    }

//    @Override
//    public void eliminar(Libro objeto) {
//        super.eliminar(objeto); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
//    // acomodar de libroSRV
//    public void eliminarDeElias(Libro objeto){
//        conectar();
//        super.eliminar2(objeto);
//        desconectar();
//    }

    
    
    @Override
    public void eliminar(Libro libro){
        try {
            conectar();
            em.getTransaction().begin();
            Libro entidadFusionada = em.merge(libro);
            em.remove(entidadFusionada);
            em.getTransaction().commit();
            desconectar();
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarPorISBN(Integer id) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }

    public List<Libro> buscarCoincidenciasPorNombre(String titulo) throws Exception {
        conectar();
        List<Libro> autorBuscLado = (List<Libro>) em.createQuery("SELECT lib from Libro lib where lib.titulo Like :titulo").setParameter("titulo", titulo + "%").getResultList();
        desconectar();
        return autorBuscLado;
    }

    public List<Libro> buscarPorAutor(String autor) throws Exception {
        conectar();
        List<Libro> autorBuscLado = (List<Libro>) em.createQuery("SELECT lib FROM Libro lib INNER JOIN lib.autor a WHERE a.nombre LIKE :autor").setParameter("autor", autor + "%").getResultList();
        desconectar();
        return autorBuscLado;
    }

    public List<Libro> buscarPorEditorial(String editorial) throws Exception {
        conectar();
        List<Libro> autorBuscLado = (List<Libro>) em.createQuery("SELECT lib FROM Libro lib INNER JOIN lib.editorial ed WHERE ed.nombre LIKE :editorial").setParameter("editorial", editorial + "%").getResultList();
        desconectar();
        return autorBuscLado;
    }

    public List<Libro> listarTodos() throws Exception {
        try {
            conectar();
            List<Libro> autores;
            autores = em.createQuery("SELECT a FROM Libro a").getResultList();
            desconectar();
            return autores;

        } catch (Exception e) {
            return null;
        }
    }
    

    
    public boolean disponibleLibro(Libro aux) {
        conectar();
            Libro libro = (Libro) em.createQuery("SELECT lib FROM Libro lib where lib.isbn = :isbn").setParameter("isbn", aux.getIsbn()).getSingleResult();
        desconectar();
        return (libro.getEjemplares() - libro.getEjemplaresPrestados() > 0);
    }
    

}
