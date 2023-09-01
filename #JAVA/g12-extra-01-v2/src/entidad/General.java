/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author jonak
 */
public class General {
    
    private ArrayList<Amarre> listaAmarres;
    private ArrayList<Cliente>listaClientes;

    public General() {
    }

    public General(ArrayList<Amarre> listaAmarres, ArrayList<Cliente> listaClientes) {
        this.listaAmarres = listaAmarres;
        this.listaClientes = listaClientes;
    }

    public ArrayList<Amarre> getListaAmarres() {
        return listaAmarres;
    }

    public void setListaAmarres(ArrayList<Amarre> listaAmarres) {
        this.listaAmarres = listaAmarres;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    
    
    
}
