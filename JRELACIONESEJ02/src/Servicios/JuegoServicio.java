/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author A308763
 */
public class JuegoServicio {
    
    Juego juego = new Juego();
    
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r){
        juego.setJugadores(jugadores);
        juego.setRevolver(r);
        
        
    }
    
    public void siguienteRonda(){
        JugadorServicio js = new JugadorServicio();
        boolean resultado = false;
        
        while (resultado==false) {  
            
             for (int i = 0; i < juego.getJugadores().size(); i++) {
                
                Jugador aux = juego.getJugadores().get(i);
                
                if (js.disparo(juego.getRevolver(), aux)==true) {
                    System.out.println("El " + aux.getNombre() + " Se mojo");
                    resultado=true;
                    break;
                } else {
                    System.out.println("El " + aux.getNombre() +" Te Salvaste....");
                }
            }
        }
   }
    
}
