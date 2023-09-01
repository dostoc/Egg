//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
//siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
//Agregar constructor vacío, con parámetros, getters y setters.

package Entidad;

/**
 *
 * @author jonak
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    
    
    
}
