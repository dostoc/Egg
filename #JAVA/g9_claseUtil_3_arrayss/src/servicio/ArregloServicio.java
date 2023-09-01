/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números
aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
mostrar A y B.
*/
package servicio;

import java.util.Arrays;

/**
 *
 * @author jonak
 */
public class ArregloServicio {
    
    public double[] iniciarARRAY(double[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=Math.random()*100+1;
        }
    return array;
    }
    
    public void mostrar(double[] array){
        System.out.println("[" + Arrays.toString(array)+"]" );
    }
    
    public double[] ordenarArray(double[] array){
        Arrays.sort(array);
        return array;
    }
    
    //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
    //Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public double[] inicializarB(double[] array1){
    double[] arrayAux = new double[50];
    arrayAux= Arrays.copyOfRange(array1, 0, 50); // se modifica la dimencion a 9
    System.out.println(arrayAux.length);
    Arrays.fill(arrayAux, 10, 50, 0.5);
    return arrayAux;
    }
    
}
