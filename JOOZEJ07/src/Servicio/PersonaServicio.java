/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona(); //Revisar... esta mal creado debe ir dentro del alta y pasarse por parametros

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in); //Duplico Escaner para que no salte en la segunda vuelta
        boolean bandera = false;

        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso de la persona en Kg");
        p1.setPeso(leer.nextInt());
        System.out.println("Ingrese la altura Cm");
        p1.setAltura(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro) ");
            String opcion = leer.next();
            switch (opcion) {
                case "H":
                    p1.setSexo(opcion);
                    bandera = true;
                    break;
                case "M":
                    p1.setSexo(opcion);
                    bandera = true;
                    break;
                case "O":
                    p1.setSexo(opcion);
                    bandera = true;
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (bandera == false);

        return p1;
    }

    public void calcularIMC() {
        double mt2 = p1.getAltura() / 100;
        double imc = p1.getPeso() / (mt2 * mt2);
        if (imc < 20) {
            p1.setImc(-1);
        } else if (imc >= 20 && imc <= 25) {
            p1.setImc(0);
        } else {
            p1.setImc(1);
        }
    }

    public void mayorDeEdad() {
        if (p1.getEdad() >= 18) {
            p1.setMayor(true);
        } else {
            p1.setMayor(false);
        }
    }

}
