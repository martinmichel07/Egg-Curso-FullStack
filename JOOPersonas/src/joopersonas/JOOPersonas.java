/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joopersonas;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author A308763
 */
public class JOOPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciacion utilizando el constructor vacio
        Persona primeraPersona = new Persona();
        
        //Instanciacion utilizando el constructor por parametros
        Persona segundaPersona = new Persona("Martin", 26310387, 44);
        
        primeraPersona.setDNI(12);
        System.out.println(primeraPersona.getDNI());
        
        int edad = segundaPersona.getEdad();
        System.out.println(segundaPersona.getNombre());
        System.out.println(edad);
        
        //Debemos instanciar un objeto del tipo servicio para acceder a sus metodos
        PersonaService persServicio = new PersonaService();
        
        //alojamos el retorno del metodo en un objeto
        Persona terceraPersona = persServicio.crearPersona();
        System.out.println("la tercera persona es:" + terceraPersona.getNombre());

    }

    
    
}
