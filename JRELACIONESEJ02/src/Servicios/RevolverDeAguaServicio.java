/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RevolverDeAgua;

/**
 *
 * @author A308763
 */
public class RevolverDeAguaServicio {
    
    public RevolverDeAgua rv = new RevolverDeAgua();
    
    public RevolverDeAgua llenarRevolver(RevolverDeAgua rv){
        rv.setPocicionDeAgua((int)(Math.random()*(6)));
        return rv;
        
    }
    
    public boolean mojar(RevolverDeAgua rv){
        boolean mojado = false;
        if (rv.getPocicionDeAgua() == rv.getPocicionActual()) {
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro(RevolverDeAgua rv){
        if (rv.getPocicionActual()==6) {
            rv.setPocicionActual(1);
        }else{
            rv.setPocicionActual(rv.getPocicionActual()+1);
        }
    }
    
    public void imprimir(){
            System.out.println(rv.toString());
    }
    
    
}
