/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro),
peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, 
getters y setters.
*/
package Entidad;

/**
 *
 * @author jonak
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private String hobby;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura, String hobby) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.hobby = hobby;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getHobby() {
        return hobby;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    
    
    
}
