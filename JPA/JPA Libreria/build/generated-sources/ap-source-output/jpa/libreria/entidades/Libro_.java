package jpa.libreria.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.libreria.entidades.Autor;
import jpa.libreria.entidades.Editorial;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-07-20T00:00:55")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, Editorial> editorial;
    public static volatile SingularAttribute<Libro, Integer> ejemplares;
    public static volatile SingularAttribute<Libro, Boolean> alta;
    public static volatile SingularAttribute<Libro, Long> isbn;
    public static volatile SingularAttribute<Libro, Integer> ejemplaresPrestados;
    public static volatile SingularAttribute<Libro, String> titulo;
    public static volatile SingularAttribute<Libro, Integer> ejemplaresRestantes;
    public static volatile SingularAttribute<Libro, Integer> anio;
    public static volatile SingularAttribute<Libro, Autor> autor;

}