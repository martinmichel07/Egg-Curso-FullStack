/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;

/**
 *
 * @author A308763
 */
public class JugadorServicio {

    public boolean disparo(RevolverDeAgua r, Jugador j) {

        RevolverDeAguaServicio rs = new RevolverDeAguaServicio();

        if (rs.mojar(r) == true) {
            j.setMojado(true);
        } else {
            rs.siguienteChorro(r);
        }

        return j.isMojado();

    }

}
