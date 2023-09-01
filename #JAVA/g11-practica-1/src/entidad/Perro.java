package entidad;

import java.util.Comparator;

public class Perro {

    private String nombre;

    private String raza;

    private Integer edad;

    private Integer tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Integer tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public static class ordenarPerros implements Comparator<Perro> {

        @Override
        public int compare(Perro o1, Perro o2) {
            return Integer.compare(o1.getNombre().charAt(0), o2.getNombre().charAt(0));
        }
    }

    @Override
        public String toString() {
            return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
        }

    }
