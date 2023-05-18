/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author A308763
 */
public class ServicioMascota {

    //.useDelimiter("\n") para que no salte el pedido de un string con espacios.
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Funcion para pedir los datos de las mascotas al hacer nacer el objeto
    /**
     * 
     * @return 
     */
    public Mascota crearMascota() {

        System.out.println("Intruducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        
        //alimento al constructor declarando el objeto
        //Mascota m = new Mascota(nombre, apodo, tipo);
        //return m;
        
        //otra forma es devolver el nacimiento de una mascota introduciendo sus atributos por teclado
        return new Mascota(nombre, apodo, tipo);
    }

}
