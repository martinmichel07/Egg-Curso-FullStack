/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author A308763
 */
public class Jugador {
    private String nombre;
    private String apellido;
    private Integer pocicion;
    private Integer numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, Integer pocicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pocicion = pocicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getPocicion() {
        return pocicion;
    }

    public void setPocicion(Integer pocicion) {
        this.pocicion = pocicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", pocicion=" + pocicion + ", numero=" + numero + '}';
    }
    
    
}
