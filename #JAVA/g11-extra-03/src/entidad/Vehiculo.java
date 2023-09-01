/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Jona
 */
public class Vehiculo {
    
    
    /**
     * *
     * Gestión de vehículos. Se registra la información de cada vehículo
     * asegurado. Marca, modelo, año, número de motor, chasis, color, tipo
     * (camioneta, sedán, etc.).
     */
    
    private String marca;
    private String modelo;
    private Integer anio;
    private Integer nroMotor;
    private Integer nroChasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer anio, Integer nroMotor, Integer nroChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nroMotor = nroMotor;
        this.nroChasis = nroChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(Integer nroMotor) {
        this.nroMotor = nroMotor;
    }

    public Integer getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(Integer nroChasis) {
        this.nroChasis = nroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", nroMotor=" + nroMotor + ", nroChasis=" + nroChasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
