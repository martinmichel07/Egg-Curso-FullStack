/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej12;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class JOOZEJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       

        PersonaServicio sp = new PersonaServicio();
        Persona p1 = sp.altaPersona();
        sp.calcularEdad(p1);
        
        System.out.println("Ingrese una nueva edad: ");
        int edad = leer.nextInt();
        p1.menorQue(edad);
        boolean bandera = p1.menorQue(edad);
        System.out.println(bandera);
        
        System.out.println(p1.toString());

    }

}
