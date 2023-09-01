/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto
puntos usando un método crearPuntos() que le pide al usuario los dos números y los 
ingresa en los atributos del objeto. Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package entidades;

import java.util.Scanner;


public class Puntos {
    
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public Puntos() {
    }

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar las coordenads del primer punto (x ; y) : ");
        this.x1= leer.nextDouble();
        this.y1= leer.nextDouble();
        
        System.out.println("Ingresar las coordenadas del segundo punto (x ; y) : ");
        
        this.x2= leer.nextDouble();
        this.y2= leer.nextDouble();

    }
    
    public void distanciaPuntos() {
        
        System.out.println("La distancia entre los puntos es de : " +Math.sqrt((Math.pow(this.x1-this.x2,2))+(Math.pow(this.y1-this.y2,2))));
        
    }
}
