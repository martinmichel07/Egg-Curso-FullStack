/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);
    public String frase2;

    public Cadena altaFrase() {
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase o palabra");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        return c1;
    }

    public void mostrarVocales(Cadena c1) {
        int vocalA = 0;
        int vocalE = 0;
        int vocalI = 0;
        int vocalO = 0;
        int vocalU = 0;
        for (int i = 0; i < c1.getFrase().length(); i++) {
            String opcion = c1.getFrase().toUpperCase().substring(i, i + 1);
            switch (opcion) {
                case "A":
                    vocalA = vocalA + 1;
                    break;
                case "E":
                    vocalE = vocalE + 1;
                    break;
                case "I":
                    vocalI = vocalI + 1;
                    break;
                case "O":
                    vocalO = vocalO + 1;
                    break;
                case "U":
                    vocalU = vocalU + 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("");
        if (vocalA != 0) {
            System.out.println("La cantidad de A son : " + vocalA);
        }
        if (vocalE != 0) {
            System.out.println("La cantidad de E son : " + vocalE);
        }
        if (vocalI != 0) {
            System.out.println("La cantidad de I son : " + vocalI);
        }
        if (vocalO != 0) {
            System.out.println("La cantidad de O son : " + vocalO);
        }
        if (vocalU != 0) {
            System.out.println("La cantidad de U son : " + vocalU);
        }
    }

    public void invertirFrase(Cadena c1) {
        int cantidad = c1.getLongitud();
        String invertir = "";

        for (int i = cantidad; i > 0; i--) {
            invertir = invertir + c1.getFrase().substring(i - 1, i);
        }
        System.out.println("");
        System.out.println("La frase al reves es : " + invertir);
        System.out.println("");
    }

    public void vecesRepetido(Cadena c1) {
        System.out.println("Ingrese un caracter: ");
        String caracter = leer.next();
        int contar = 0;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (caracter.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                contar = contar + 1;
            }
        }
        System.out.println("La cantidad de veces que se repite el caracter " + "' " + caracter + " '" + " es: " + contar);
        System.out.println("");
    }

    public void compararLogitud(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase: ");
        frase2 = leer.nextLine();
        if (frase2.length() == (c1.getFrase().length())) {
            System.out.println("tienen el mismo largo");
        } else {
            System.out.println("Son de largo diferente");
            System.out.println("La primer frase es de: " + c1.getFrase().length() + " caracteres");
            System.out.println("La segunda frase es de: " + frase2.length() + " caracteres");
        }

    }

    public void unirFrases(Cadena c1) {
        String unir;
        unir = c1.getFrase() + " " + frase2;
        System.out.println("");
        System.out.println("La frase unida es: " + unir);

    }

    public void reemplazar(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        String caracter = leer.next();
        char letra = caracter.charAt(0);
        String caracterARemplazar = "a";
        String fraseRemplazada = "";

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (caracterARemplazar.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                fraseRemplazada = fraseRemplazada + letra;
            } else {
                fraseRemplazada = fraseRemplazada + c1.getFrase().substring(i, i + 1);
            }
        }
        System.out.println("La cadena reemplazada quedo como: " + fraseRemplazada);
    }

    public void contiene(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        String letra = leer.next();
        boolean bandera = false;

        for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c1.getFrase().substring(i, i + 1))) {
                bandera = true;
            }
        }
        System.out.println("");
        System.out.println(bandera);
        System.out.println("");
    }
    
}
