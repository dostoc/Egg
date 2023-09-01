package entidad;


public class Revolver {

    private Integer posicionActual;

    private Integer posicionAgua;

    public Revolver() {
        this.llenarRevolver(); // Se construye con un aleatorio de llenarRevolver
    }
    
    
    /**
     * llenarRevolver(): le pone los valores de posición actual y de posición
     * del agua. Los valores deben ser aleatorios.
     */
    public void llenarRevolver() {
        posicionActual = (int)(Math.random()*(6 - 1)+ 1);
        posicionAgua = (int)(Math.random()*(6 - 1)+ 1);
    }
    
    /**
     * mojar(): devuelve true si la posición del agua coincide con la posición
     * actual
     */
    
    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * siguienteChorro(): cambia a la siguiente posición del tambor 1 2 3 4* 5 6
     */
    
    public void siguienteChorro() {
        if (posicionActual < 6) {
            posicionActual= posicionActual+1;
        } else  {
            posicionActual = 1;
        }
    }
    
     @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    
}
