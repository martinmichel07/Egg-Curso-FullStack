/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    //metodo para pedir los datos
    public Operacion crearOperacion() {

        //instancio un objeto de tipo operacion
        Operacion o1 = new Operacion();

        //pido los datos
        System.out.println("Ingrese el primer valor");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo valor");
        o1.setNumero2(leer.nextInt());

        return o1;
    }

    //metodo para sumar los dos numeros
    public void sumar(Operacion o1) {
        System.out.println("La suma de los dos numeros es: " + (o1.getNumero1() + o1.getNumero2()));
    }

    //metodo para restar los dos numeros
    public void restar(Operacion o1) {
        System.out.println("La resta de los numeros es: " + (o1.getNumero1() - o1.getNumero2()));
    }

    //metodo para multiplicar
    public void multiplicar(Operacion o1) {
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0) {
            System.out.println("No se puede multiplicar por cero");
        } else {
            System.out.println("La multiplicacion de los numeros es: " + (o1.getNumero1() * o1.getNumero2()));
        }
    }

    //metodo para multiplicar
    public void dividir(Operacion o1) {
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("la division de los nuemeros es: " + (o1.getNumero1() / o1.getNumero2()));
        }
    }

}
