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
public class Televisor extends Electrodomestico {

    //Atributos
    private Integer pulgadas;
    private boolean sintonizador;

    //Constructores
    public Televisor() {
    }

    public Televisor(Integer pulgadas, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = false;
    }

    //Getter y Setter
    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    //Metodos
    public Televisor crearTelevisor(Televisor televisor) {
        Scanner leer = new Scanner(System.in);
        televisor.crearElectrodomestico();
        System.out.print("ingrese la cantidad de pulgadas: ");
        this.pulgadas = leer.nextInt();
        System.out.println("Igrese si tiende sintonizador (1-SI) : ");
        if (leer.nextInt() == 1) {
            this.sintonizador = true;
        }
        return televisor;

    }

    @Override
    public double precioFinal() {

        double precio = super.precioFinal();

        if (this.pulgadas > 40) {
            precio = (precio * 1.3);
        }

        if (sintonizador == true) {
            precio = precio + 500;
        }

        System.out.println("El precion final del electrodomestico es: " + precio);

        return 0;

    }

}
