/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    Cafetera c1 = new Cafetera(); //Revisar... esta mal creado debe ir dentro del alta y pasarse por parametros

    public void servirTaza() {
        System.out.println("Por favor ingrese el tamaño de la taza");
        int taza = 0;
        int maxLlenado = 250;
        taza = leer.nextInt();

        if (c1.getCantidadActual() == 0) {
            System.out.println("Priemro debe agregar cafe");

        } else if (taza > maxLlenado) {
            System.out.println("Lenado de taza...");
            System.out.println("Completado");
            System.out.println("Quedo disponible el :" + (((taza * 100) / 250) - 100) + " % de la totalidad de la taza");

        } else {
            System.out.println("Lenado de taza...");
            System.out.println("Completado");
            System.out.println("Se lleno el :" + ((taza * 100) / 250) + " % de la totalidad de la taza");
        }
    }

    public Cafetera llenarCafetera() {
        System.out.println("Se lleno la cefetera");
        c1.setCantidadActual(c1.getCapacidadMaxima());
        return c1;
    }

    public Cafetera vaciarCafetera() {
        System.out.println("La cafetera se ha vaciado");
        c1.setCantidadActual(0);
        return c1;
    }

    public Cafetera agregarCafe() {
        System.out.println("Por favor indique la cantidad de Cafe");
        int cafe = 0;
        cafe = leer.nextInt();

        if (c1.getCantidadActual() != 0) {
            System.out.println("Por favor primero vacie la cafetera");
        } else if (cafe > c1.getCapacidadMaxima()) {
            System.out.println("No puede supererar la capacidad maxima correspondiente a: " + c1.getCapacidadMaxima() + " ml, por favor ingrese de nuevo");
        } else {

            System.out.println("Se agrego el cafe");
            c1.setCantidadActual(cafe);
        }

        return c1;

    }

}
