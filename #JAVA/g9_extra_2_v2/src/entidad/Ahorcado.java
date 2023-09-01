/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos en AhorcadoService:
*/
package entidad;

/**
 *
 * @author jonak
 */
public class Ahorcado {
   private char[] palabraArray;
   private int jugadasMaximas;
   private int letrasEncontradas;

    public Ahorcado() {
    }

    public Ahorcado(int jugadasMaximas, int letrasEncontradas) {
        this.jugadasMaximas = jugadasMaximas;
        this.letrasEncontradas = letrasEncontradas;
    }

    public char[] getPalabraArray() {
        return palabraArray;
    }

    public void setPalabraArray(char[] palabraArray) {
        this.palabraArray = palabraArray;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    

}
