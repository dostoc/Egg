/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:




A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.


 */
package g8_servicios_3;

import Entidad.Persona;
import PersonaServicio.PersonaServicio;

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona puente;
        int contBajoPeso = 0, contMedioPeso = 0, contAltoPeso = 0, contMayor =0, contMenor = 0;
        int muestras=5;
        Persona[] listadoPersona = new Persona[muestras];
        double[] pesoPersona = new double[muestras];
        boolean[] mayorPersona = new boolean[muestras];
        
        for (int i = 0; i < muestras; i++) {
            puente = ps.crearPersona();
            listadoPersona[i]=puente;
            pesoPersona[i]=ps.calcularIMC(puente);
            mayorPersona[i]=ps.esMayorDeEdad(puente);
            
            Persona auxList = listadoPersona[i];
            if (mayorPersona[i]=true) {
                contMayor++;
            }else {
                contMenor++;
            }
            ps.verPersona(auxList);
            
            switch ((int)(pesoPersona[i])) {
                case -1:
                    contBajoPeso++;
                    break;
                case 0:
                    contMedioPeso++;
                    break;
                case 1:
                    contAltoPeso++;
                    break;
            }
        }
        System.out.println("-------------------------");
        System.out.println("REPORTE:");
        System.out.println("Adultos: " +(contMayor*100/muestras) );
        System.out.println("Menores: " +(contMenor*100/muestras) );
        System.out.println("IMC Bajo: " +(contBajoPeso*100/muestras) );
        System.out.println("IMC Medio: " +(contMedioPeso*100/muestras) );
        System.out.println("IMC Alto: " +(contAltoPeso*100/muestras) );
        
        
    }
    
}
