/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class PersonaServicio {
    
    Scanner leer =new Scanner(System.in);
    
    
    public Persona altaPersona(){
        Scanner leer =new Scanner(System.in);
        Persona p1 = new Persona();
        
        int anio, mes, dia;
        
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese el año de nacimiento");
        anio= leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes=leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        dia= leer.nextInt();
        
        Date fechaNacimiento = new Date(anio-1900,mes-1, dia);
        p1.setFechaNacimiento(fechaNacimiento);

        return p1;
        
    }
    
    public void calcularEdad(Persona p1){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear()-p1.getFechaNacimiento().getYear();
        System.out.println("La edad de la persona es: " + edad);
    }
    

}
