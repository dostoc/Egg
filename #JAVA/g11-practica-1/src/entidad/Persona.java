package entidad;

import java.util.Comparator;

public class Persona {

    public void untitledMethod() {
    }

    private String nombre;

    private String apellido;

    private Integer edad;

    private Integer documento;

    private Perro perritoAdoptado;
    
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perritoAdoptado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perritoAdoptado = perritoAdoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerritoAdoptado() {
        return perritoAdoptado;
    }

    public void setPerritoAdoptado(Perro perritoAdoptado) {
        this.perritoAdoptado = perritoAdoptado;
    }
    
    
    public static class ordenaPersonas implements Comparator<Persona> {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Character.compare(p1.getNombre().charAt(0), p2.getNombre().charAt(0));
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perritoAdoptado=" + perritoAdoptado + '}';
    }
    
    
    
    
    
}
