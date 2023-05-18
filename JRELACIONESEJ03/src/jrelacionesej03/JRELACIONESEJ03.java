/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrelacionesej03;

import Entidad.Baraja;
import java.util.Scanner;

/**
 *
 * @author A308763 
 * Realizar una baraja de cartas españolas orientada a objetos.
 * Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un
 * palo (espadas, bastos, oros y copas). Esta clase debe contener un método
 * toString() que retorne el número de carta y el palo. La baraja estará
 * compuesta por un conjunto de cartas, 40 exactamente. Las operaciones que
 * podrá realizar la baraja son: 
 * • barajar(): cambia de posición todas las
 * cartas aleatoriamente. 
 * • siguienteCarta(): devuelve la siguiente carta que
 * está en la baraja, cuando no haya más o se haya llegado al final, se indica
 * al usuario que no hay más cartas. 
 * • cartasDisponibles(): indica el número de
 * cartas que aún se puede repartir. 
 * • darCartas(): dado un número de cartas que
 * nos pidan, le devolveremos ese número de cartas. En caso de que haya menos
 * cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al
 * usuario. 
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no
 * ha salido ninguna indicárselo al usuario 
 * • mostrarBaraja(): muestra todas las
 * cartas hasta el final. Es decir, si se saca una carta y luego se llama al
 * método, este no mostrara esa primera carta.
 */
public class JRELACIONESEJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        Baraja juego = new Baraja();
        juego.crearBaraja();
        juego.barajar();
        System.out.println("Cuantas cartas quiere dar:");
        juego.darCartas(leer.nextInt());
        System.out.println("La carta dada en la siguinete mano es: ");
        System.out.println(juego.siguienteCarta().toString());
        juego.mostrarBaraja();
        System.out.println("Las cartas del monton son: ");
        System.out.println(juego.cartasMonton().toString());

    }

}
