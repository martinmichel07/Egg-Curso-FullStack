/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolectionej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class JCOLECTIONEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> mascota = new ArrayList(); //Se declara la lista
        Boolean bandera = false;

        //Ejercicio 1
        /**
         * Diseñar un programa que lea y guarde razas de perros en un ArrayList
         * de tipo String. El programa pedirá una raza de perro en un bucle, el
         * mismo se guardará en la lista y después se le preguntará al usuario
         * si quiere guardar otro perro o si quiere salir. Si decide salir, se
         * mostrará todos los perros guardados en el ArrayList
         */
        //Se carga los datos en la lista
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una raza de perro: ");
            mascota.add(leer.nextLine());
            System.out.println("");
            System.out.println("Desea guardar otro perro ?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.println("");

            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    bandera = false;
                    break;
                case 2:
                    bandera = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (bandera == false);
        System.out.println("");

        System.out.println("Las razas guardadas son: ");
        for (String var : mascota) {//Se imprime la lista
            System.out.println(var);
        }

        //Ejercicio 2
        /**
         * Continuando el ejercicio anterior, después de mostrar los perros, al
         * usuario se le pedirá un perro y se recorrerá la lista con un
         * Iterator, se buscará el perro en la lista. Si el perro está en la
         * lista, se eliminará el perro que ingresó el usuario y se mostrará la
         * lista ordenada. Si el perro no se encuentra en la lista, se le
         * informará al usuario y se mostrará la lista ordenada.
         */

        //Creamos el iterator para recorrer la lista
        Iterator iterator = mascota.iterator();
      
        Scanner leer = new Scanner(System.in); //Doy de alta el scaner de nuevo para que no falle la carga de datos.
        System.out.println("Ingrese una raza de perro:");
        String raza = leer.nextLine();

        //Armamos un bucle while, siempre que hasnet() devuelva true, eliminamos el objeto de la lista
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next.equals(raza)) {
                iterator.remove();
            }
        }
        
         //ordenamos la lista
        Collections.sort(mascota);

        //Imprimimos la lista
        System.out.println("Las razas guardadas y ordenadas son: ");
        for (String var : mascota) {//Se imprime la lista
            System.out.println(var);
        }

        
        
    }
}
