/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Electrodomestico {

    // Atributos
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;


    //Constructores
    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }


    //Getter y Setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    //metodos
    public String comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i < colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                return color.toLowerCase();
            }
        }
        return "blanco";
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        }
        return 'F';
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el color (blanco, negro, rojo, azul o gris): ");
        String color = sc.nextLine();
        this.color = comprobarColor(color);
        System.out.print("Introduce el consumo energético (letras entre A y F): ");
        char consumoEnergetico = sc.next().toUpperCase().charAt(0);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        System.out.print("Introduce el peso (en kg): ");
        this.peso = sc.nextDouble();
    }

    public double precioFinal() {
        double precioFinal = this.precio;
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            default:
                precioFinal += 100;
                break;
        }
        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else {
            precioFinal += 1000;
        }
        return precioFinal;
    }


}
