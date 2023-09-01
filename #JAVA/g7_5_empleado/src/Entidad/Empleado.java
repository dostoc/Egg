/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/
package Entidad;

/**
 *
 * @author jonak
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public double calcular_salario(int edad, double salario) {
    double nuevoSalario = 0;
        if (edad >=30) {
            nuevoSalario = salario*1.1;
        }else   {
            nuevoSalario = salario+1.05;
        }
    return  nuevoSalario;
}
}