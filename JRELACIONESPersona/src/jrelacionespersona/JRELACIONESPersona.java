/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrelacionespersona;

import Entidad.Dni;
import Entidad.Persona;
import java.util.ArrayList;

/**
 *
 * @author A308763
 */
public class JRELACIONESPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herein

        Dni dni = new Dni("M", 34);
        Dni dn2 = new Dni("M", 36);
        Persona persona = new Persona("Martin", "Michel",dni);
        Persona persona2 = new Persona("Juan", "Lopez",dn2);
        //System.out.println(persona.toString());
        
        ArrayList<Persona> persona1 = new ArrayList<Persona>();
        persona1.add(persona);
        persona1.add(persona2);
        
        for (Persona aux : persona1) {
            System.out.println(aux.toString());
            System.out.println(aux.getDni().getNumero());
        }
    }

}
