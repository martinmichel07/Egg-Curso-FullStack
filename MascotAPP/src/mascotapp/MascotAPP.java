/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author A308763
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);

        //declaro un objeto
        /*
        Mascota m1 = new Mascota();
        m1.apodo = "Chiquito";
        m1.nombre = leer.next();
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";
       //imprimo las propiedades
        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo);
         */
        //llamo al constructor por parametro
        //Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");
        //Asigno el nuevo nombre nombre por seter
        //m1.setNonbre("Pepe Chiquito");
        //System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo);
        //imprimo utilizando geter
        //System.out.println(m1.getNombre());
        //mostramos antes de llamar al metodo
        //System.out.println(m1);
        //retamos energia al pasear
        //m1.pasear(100);
        //m1.pasear(50, 3);
        //imprimo utilizando geter sin  especificar atributo para utilizar el metodo toString
        //System.out.println(m1);
        
        //llamamos al servicio mascotas
        ServicioMascota sm = new ServicioMascota();
        Mascota m1 = sm.crearMascota();
        System.out.println(m1.toString());
        
        Mascota m2 = new Mascota("ss", "ss", "Perro");
        System.out.println(m2);
            
        

        //Garbage collection para reciclar basura en memoria, ya que java elimina los objetos que no se usan despues de un tiempo o lo dejamo de utilizar.
        //m1 = null;
    }

}
