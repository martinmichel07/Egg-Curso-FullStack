/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jherenciatoria01;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author A308763
 */
public class JHERENCIATORIA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        ArrayList<Animal> lista = new ArrayList();
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        for (Animal animal : lista) {
            System.out.println(animal.hacerRuido());
        }
                
     
    }

}
