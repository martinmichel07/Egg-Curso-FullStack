/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author A308763
 */
public class PaisServicio {

    public TreeSet<String> paises = new TreeSet();

    public Pais altaPais() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un pais:");
        paises.add(leer.nextLine());
        System.out.println("¿ Desea agregar otro pais ? ");
        System.out.println("1.SI");
        System.out.println("2.NO");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            altaPais();
        } else {
            System.out.println("");
        }
        return null;
    }

    public void mostarPais() {
        //Ya sale ordenado por la implementacion del comparable en la clase pais
        paises.forEach((pais) -> {
            System.out.println(pais);
        });
        System.out.println("");
    }

    public void buscarPais() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un pais a buscar:");
        String nombre = leer.nextLine();
        Boolean bandera = false;

        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(nombre)) {
                it.remove();
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("No se encontro el pais");
        } else {
            System.out.println("");
            System.out.println("La lista despues de eliminar es: ");
            mostarPais();
            System.out.println("");
        }
    }
    
}
