/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2019supermercado;

/**
 *
 * @author Agus
 */
public class Articulo {
    private int nro;
    private String nombre;
    private double precio;

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Articulo(int nro, String nombre, double precio) {
        this.nro = nro;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nro=" + nro + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
