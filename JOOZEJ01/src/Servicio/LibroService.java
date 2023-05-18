/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class LibroService {

    Scanner leer = new Scanner(System.in);

    //metodo para cargar los datos del libro
    public Libro altaLibro() {

        //instancio un objetio de tipo libro
        Libro l1 = new Libro();

        //cargo los datos en el objeto l1
        System.out.println("Ingrese el titulo del libro");
        l1.setTitulo(leer.nextLine());

        System.out.println("Ingrese el Autor del libro");
        l1.setAutor(leer.nextLine());
        
        System.out.println("Ingrese el numero de ISBN");
        l1.setISBN(leer.nextInt());

        System.out.println("Ingre el numero de paginas del libro");
        l1.setPaginas(leer.nextInt());
        
        //retorno todos los datos del libro en el objeto l1
        return l1;

    }

    //metodo para mostrar los datos del libro
    public void mostrarLibro(Libro l1) {

        System.out.println("Los datos del libro son:");
        System.out.println(l1.toString());
    }

}
