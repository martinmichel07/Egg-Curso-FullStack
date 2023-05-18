/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrelacionesej01;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author A308763
 */
public class JRELACIONESEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Perro perro1 = new Perro("Firulais", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Rex", "Pastor Aleman", 5, "Grande");

        Persona persona1 = new Persona("Juan", "Perez", 30, "123579", perro1);
        Persona persona2 = new Persona("Maria", "Garcia", 25, "357891", perro2);
        
        System.out.println(persona1);
        System.out.println(persona2);

    }

}
