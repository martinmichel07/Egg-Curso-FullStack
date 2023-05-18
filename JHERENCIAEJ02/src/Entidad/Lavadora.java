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
public class Lavadora extends Electrodomestico {

    //Atributo
    private int carga;

    //Constructores
    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //Getter y Setter
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    //Metodos
    public Lavadora crearLavadora(Lavadora lavadora) {
        Scanner leer = new Scanner(System.in);
        lavadora.crearElectrodomestico();
        System.out.print("ingrese la carga de la lavadora: ");
        this.carga = leer.nextInt();
        return lavadora;

    }

    @Override
    public double precioFinal() {
        if (this.carga > 30) {
            System.out.println("El precion final del electrodomestico es: " + (super.precioFinal() + 500));
         return 0;
        }
        System.out.println("El precion final del electrodomestico es: " + super.precioFinal());
        return 0;

    }

}
