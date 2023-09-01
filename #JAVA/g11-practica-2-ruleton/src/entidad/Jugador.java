package entidad;

public class Jugador {

    private Integer id;

    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, Boolean mojado) {
        this.id = id;
        this.mojado = mojado;
    }
    
    

    /**
     * disparo(Revolver r): el método, recibe el revolver de agua y llama a los
     * métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
     * aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
     * atributo mojado pasa a false y el método devuelve true, sino false.
     */
    
    public boolean disparo(Revolver r) {
        if (r.mojar()) {
            return true;
        } else {
            r.siguienteChorro();
            return false;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", mojado=" + mojado + '}';
    }
    
    
    
    /**
     * 
     */
    
    
    
}
