/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
y imprime el área del rectángulo.*/
package Entidad;

/**
 *
 * @author jonak
 */
public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void calcular_area(int lado1, int lado2) {
        System.out.println("AREA = " + lado1 * lado2);
    }
    
    public void rectangulo1(int base, int altura){
        for (int i = 0; i < base; i++) { // base
            for (int j = 0; j < altura; j++) { // altura
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("AREA = " + base * altura);
    
    }
        

    
    
}
