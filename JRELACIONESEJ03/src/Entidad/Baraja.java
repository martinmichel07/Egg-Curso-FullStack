/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author A308763
 */
public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;
    private int cartaActual;
    private Random randon;

    public Baraja crearBaraja() {

        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        cartaActual = 0;
        randon = new Random();

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                cartas.add(new Carta(i, Palo.BASTOS));
                cartas.add(new Carta(i, Palo.COPAS));
                cartas.add(new Carta(i, Palo.ESPADAS));
                cartas.add(new Carta(i, Palo.OROS));
            }
        }
        System.out.println("Las cartas del mazo son: ");
        System.out.println(cartas.toString());
        return null;
    }

    public void barajar() {
        Collections.shuffle(cartas, randon);
        cartaActual = 0;
        monton.clear();
        System.out.println("Las cartas barajadas son");
        System.out.println(cartas.toString());
        System.out.println("en total " + cartas.size()); 
    }

    public Carta siguienteCarta() {
        if (cartaActual >= cartas.size()) {
            System.out.println("No hay mas cartas en la baraja");
            return null;
        } else {
            Carta siguiente = cartas.get(cartaActual);
            cartaActual++;
            monton.add(siguiente);
            return siguiente;
        }
    }

    public int cartasDisponibles() {
        return cartas.size() - cartaActual;
    }

    public ArrayList<Carta> darCartas(int numCartas) {
        if (numCartas > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas en la baraja");
            return null;
        }
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            mano.add(siguienteCarta());
        }
        System.out.println("Las cartas dada en la mano son :");
        System.out.println(mano.toString());
        return mano;
    }
    
    public ArrayList<Carta> cartasMonton(){
        if (monton.isEmpty()) {
            System.out.println("Todavia no ha salido ninguna carta");
        }       
        return monton;
    }
    
    public void mostrarBaraja(){
        System.out.println("La que queda en la baraja es:");
        for (int i = cartaActual; i < cartas.size(); i++) {
            System.out.println(cartas.get(i).toString());
        }
    }

}
