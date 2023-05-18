/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
       //Instanciamos un objeto persona con sis atributos vacios
       Persona personaCompleta = new Persona();
       
       //Pedimos al usuario que ingrese la informacion
       //y con el scanner recibimos la informacion
        System.out.println("Ingrese el nombre");
       personaCompleta.setNombre(leer.next());
        
       
       //Este metodo retorna un objeto con sus atributos llenos
       return personaCompleta;
    }


}
