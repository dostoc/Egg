/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.orien.obj;

import Clases.Rectangulo;

/**
 *
 * @author LogiC
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear una clase Rectángulo que modele rectángulos por medio de un
         * atributo privado base y un atributo privado altura. La clase incluirá
         * un método para crear el rectángulo con los datos del Rectángulo dados
         * por el usuario. También incluirá un método para calcular la
         * superficie del rectángulo y un método para calcular el perímetro del
         * rectángulo. Por último, tendremos un método que dibujará el
         * rectángulo mediante asteriscos usando la base y la altura. Se deberán
         * además definir los métodos getters, setters y constructores
         * correspondientes.
         */
        
        Rectangulo r1 = new Rectangulo();
        
        // creamos el rectángulo
        r1.crearRectangulo();
        
        // superficie
        System.out.println("La superficie del rectángulo es: " 
                + r1.superficieRectangulo(r1.getBase(), r1.getAltura()));
        
        // perimetro
        System.out.println("El perímetro del rectángulo es: " 
                + r1.perimetroRectangulo(r1.getBase(), r1.getAltura()));
        
        System.out.println("El rectángulo queda: ");
        r1.dibujarRectangulo();
        
        
    }

}
