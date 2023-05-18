/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.PeliculaComparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class PeliculaServicio {

    ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula altaPelicula() {
        Scanner leer = new Scanner(System.in);
        Pelicula peli = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula");
        peli.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del director de la pelicula");
        peli.setDirector(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas de la pelicula");
        peli.setHoras(leer.nextInt());

        peliculas.add(peli);
        System.out.println("Desea ingresar otra pelicula: ");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            altaPelicula();
        }
        return null;
    }

    public void mostrarPelicula() {
        System.out.println("La lista de peliculas es: ");
        peliculas.forEach((pelicula) -> {
            //Impresion por medio del ForEach
            System.out.println(pelicula);
        });
        System.out.println("");

        System.out.println("La lista de peliculas ordenadas por tiempo mayor es: ");
        Collections.sort(peliculas, PeliculaComparador.ordenarPorTiempoMayor);
        peliculas.forEach((e) -> System.out.println(e)); //Otra manera de imprimir en un ForEach
        System.out.println("");

        System.out.println("La lista de peliculas ordenadas por tiempo menor es: ");
        Collections.sort(peliculas, PeliculaComparador.ordenarPorTiempoMenor);
        peliculas.forEach((e) -> System.out.println(e)); //Otra manera de imprimir en un ForEach
        System.out.println("");

        System.out.println("La lista de peliculas ordenadas por titulo es: ");
        Collections.sort(peliculas, PeliculaComparador.ordenarPorTitulo);
        peliculas.forEach((e) -> System.out.println(e)); //Otra manera de imprimir en un ForEach
        System.out.println("");

        System.out.println("La lista de peliculas ordenadas por director es: ");
        Collections.sort(peliculas, PeliculaComparador.ordenarPorDirector);
        peliculas.forEach((e) -> System.out.println(e)); //Otra manera de imprimir en un ForEach
        System.out.println("");

        ArrayList<Pelicula> peliculas2 = new ArrayList();
        peliculas.stream().filter((pelicula) -> (pelicula.getHoras() > 1)).forEachOrdered((pelicula) -> {
            peliculas2.add(pelicula);
        });
        System.out.println("Las peliculas de mas de una hora son: ");
        peliculas2.forEach((e) -> System.out.println(e)); //Otra manera de imprimir en un ForEach

    }

}
