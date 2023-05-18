/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author A308763
 */
public class Loro extends Animal {

    public Loro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
         System.out.println(this.nombre + " se animal se alimenta de " + this.alimento);
    }
    
    
}
