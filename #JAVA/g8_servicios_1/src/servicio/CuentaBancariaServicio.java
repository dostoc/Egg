
package servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class CuentaBancariaServicio {
    
    
    // El principio de funcionamiento es definir un objeto y parametrizar y volver con los datos de ese objeto al "Objeto real"
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() { // acceso public // tipo CuentaBancaria (constructor de clase de dato) // nombre del metodo
        CuentaBancaria cuentaAux = new CuentaBancaria(); // nuevo objeto tipo CuentaBancaria (ver clase)
        System.out.print("Nro Cuenta: ");
        cuentaAux.setNumeroCuenta(leer.nextInt());
        System.out.print("Dni Cliente: ");
        cuentaAux.setDniCliente(leer.nextLong());
        System.out.print("Saldo Actual: ");
        cuentaAux.setSaldoActual(leer.nextDouble());
        return cuentaAux;
    }
    
    //Método ingresar(double): recibe una cantidad de dinero a ingresar
    //y se le sumará al saldo actual.
    
    public void ingresar(CuentaBancaria cuentaAux){
        System.out.print("Ingresar a Cuenta: ");
        System.out.print("(Saldo en cuenta $ "+cuentaAux.getSaldoActual()+"): ");
        cuentaAux.setSaldoActual(cuentaAux.getSaldoActual()+leer.nextDouble());
        System.out.println("Nuevo saldo $: "+cuentaAux.getSaldoActual());
    }
    
    //Método retirar(double): recibe una cantidad de dinero a retirar 
    //y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero 
    // a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    public void retirar(CuentaBancaria cuentaAux){
        double aux;
        System.out.print("Ingresar $$$ a retirar: ");
        if (cuentaAux.getSaldoActual()>= (aux=leer.nextDouble())) {
            cuentaAux.setSaldoActual(cuentaAux.getSaldoActual()-aux);
        }else {
            System.out.println("Saldo Insuficiente");
        }

    }
    
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    // Validar que el usuario no saque más del 20%.
    
    public void extraccionRapida(CuentaBancaria cuentaAux){
        System.out.println("Extrajo $ " + cuentaAux.getSaldoActual()*0.2);
        cuentaAux.setSaldoActual(cuentaAux.getSaldoActual()*0.80);
    }
    
    
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    
    public void consultaSaldo(CuentaBancaria cuentaAux){
        System.out.println("Su saldo es "+ cuentaAux.getSaldoActual());
    }
    
    // Método consultarDatos: permitirá mostrar todos los datos de la cuenta
    
    
     public void consultaDatos(CuentaBancaria cuentaAux){
         System.out.println("DNI CLIENTE...........:" + cuentaAux.getDniCliente());
         System.out.println("NUMERO CUENTA.........: " + cuentaAux.getNumeroCuenta());
         System.out.println("SALDO ACTUAL..........:" + cuentaAux.getSaldoActual());
    }


    
    

}
