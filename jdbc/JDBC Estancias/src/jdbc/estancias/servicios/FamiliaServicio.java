package jdbc.estancias.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import jdbc.estancias.entidades.Familia;
import jdbc.estancias.persistencia.FamiliaDAO;

public class FamiliaServicio {

    Familia fam = new Familia();
    FamiliaDAO fDAO;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public FamiliaServicio(FamiliaDAO fDAO) {
        this.fDAO = fDAO;
    }

    //a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
    public void listarfamilia() {
        try {

            Collection<Familia> listaFam = new ArrayList();
            int cantHijos = 3;
            int edadMax = 10;
            listaFam = fDAO.listaFamilia(cantHijos, edadMax);

            if (listaFam == null) {
                throw new Exception("Listado nulo");
            }

            for (Familia familia : listaFam) {
                System.out.println(familia);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void listaFamiliaCorreo() {
        try {
            
            String email = "hotmail";
            Collection<Familia> listaFam = fDAO.buscarCorreo(email);
            
            for (Familia familia : listaFam) {
                System.out.println(familia);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}
