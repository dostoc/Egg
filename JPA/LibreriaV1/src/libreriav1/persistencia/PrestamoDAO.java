/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriav1.persistencia;

import java.util.List;
import libreriav1.entidades.Cliente;
import libreriav1.entidades.Prestamo;

/**
 *
 * @author jonak
 */
public class PrestamoDAO extends DAO<Prestamo> {

    @Override
    public void guardar(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    @Override
    public void eliminar(Prestamo prestamo) {
        super.eliminar(prestamo);
    }

    @Override
    public void editar(Prestamo prestamo) {
        super.editar(prestamo); 
    }
    
    

    public List<Prestamo> listarTodos() throws Exception {
        try {
            conectar();
                List<Prestamo> prestamoLista = ( List<Prestamo>) em.createQuery("SELECT a FROM Prestamo a").getResultList();
            desconectar();
            return prestamoLista;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    public List<Prestamo> prestamosPorCliente(Cliente cliente){
        try {
            conectar();
                List<Prestamo> prestamo = (List<Prestamo>) em.createQuery("Select pr from Prestamo pr where pr.cliente = :cliente").setParameter("cliente", cliente).getResultList();
            desconectar();
            return prestamo;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
//    public Prestamo buscarPorISBN(Integer id) throws Exception {
//        conectar();
//        Prestamo autor = em.find(Prestamo.class, id);
//        desconectar();
//        return autor;
//    }
//
//    public List<Prestamo> buscarCoincidenciasPorNombre(String titulo) throws Exception {
//        conectar();
//        List<Prestamo> autorBuscLado = (List<Prestamo>) em.createQuery("SELECT lib from Prestamo lib where lib.titulo Like :titulo").setParameter("titulo", titulo + "%").getResultList();
//        desconectar();
//        return autorBuscLado;
//    }
//
//    public List<Prestamo> buscarPorAutor(String autor) throws Exception {
//        conectar();
//        List<Prestamo> autorBuscLado = (List<Prestamo>) em.createQuery("SELECT lib FROM Prestamo lib INNER JOIN lib.autor a WHERE a.nombre LIKE :autor").setParameter("autor", autor + "%").getResultList();
//        desconectar();
//        return autorBuscLado;
//    }
//
//    public List<Prestamo> buscarPorEditorial(String editorial) throws Exception {
//        conectar();
//        List<Prestamo> autorBuscLado = (List<Prestamo>) em.createQuery("SELECT lib FROM Prestamo lib INNER JOIN lib.editorial ed WHERE ed.nombre LIKE :editorial").setParameter("editorial", editorial + "%").getResultList();
//        desconectar();
//        return autorBuscLado;
//    }
}
