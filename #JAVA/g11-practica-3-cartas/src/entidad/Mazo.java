/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonak
 */
public class Mazo {
    
    
    /**
     * Realizar una baraja de cartas españolas orientada a objetos. Una carta
     * tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo
     * (espadas, bastos, oros y copas). Esta clase debe contener un método
     * toString() que retorne el número de carta y el palo. La baraja estará
     * compuesta por un conjunto de cartas, 40 exactamente.
     */
    
    private Carta todoMazo;

    public Mazo() {
    }

    public Mazo(Carta todoMazo) {
        this.todoMazo = todoMazo;
    }

    public Carta getTodoMazo() {
        return todoMazo;
    }

    public void setTodoMazo(Carta todoMazo) {
        this.todoMazo = todoMazo;
    }
   
    @Override
    public String toString() {
        return "mazo{" + "todoMazo=" + todoMazo + '}';
    }
    
    
    
    
    
}
