/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jherenciaej01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Loro;
import Entidad.Perro;

/**
 *
 * @author A308763
 */
public class JHERENCIAEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        Animal loro1 = new Loro("pepe", "alpiste", 1, "periquito");

        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
        loro1.alimentarse();
        

    }

}
