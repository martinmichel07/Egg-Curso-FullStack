/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrelacionesjugador;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

/**
 *
 * @author A308763
 */
public class JRELACIONESJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //primero creo los objetos de jugador
        Jugador jugador1 = new Jugador("Carlos","Moreno",9,10);
        Jugador jugador2 = new Jugador("Jose","Perez",11,20);
        
        //Completo la lista con los objetos creados
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        
        //creo el objeto equipo y le paso la lista
        Equipo equipo1 = new Equipo("Boca",jugadores);
        
        //imprimo
        System.out.println("El nombre de equipo es : " + equipo1.getNombre());
        
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
    }
    
}
