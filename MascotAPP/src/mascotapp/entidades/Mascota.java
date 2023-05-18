/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author A308763
 */
public class Mascota {

    //pongo privado los atributos
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    //Agreganos metodo de operacion
    private int energia;

    //creamos un constructor publico
    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }
        this.energia = 1000;
    }
    /**
     * 
     * @param nombre
     * @param apodo
     * @param tipo
     * @param color
     * @param edad
     * @param cola
     * @param raza 
     */
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    //utilizo seter para poder cambiar los valores de los atributos
    public void setNonbre(String nombre) {
        //condicion para validar si lo seteo, es para explicar que pueden tener logica
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //utilizo geter para mostrar los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    //agregamos metodo pasear para descontar energia
    /**
     *
     * @param energiaRestar
     * @return
     */
    public int pasear(int energiaRestar) {
        this.energia = energia - energiaRestar;
        //otra forma de restar
        //energia -= energiaRestar;
        return energia;
    }

    //agregamos otro metodo para tambien tener las vueltas
    /**
     *
     * @param energiaRestar
     * @param vueltas
     * @return
     */
    public int pasear(int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
    }

//utilizamos el metodo toString para captar los objetos y mostrarlos como una cadena de caracteres.
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

}
