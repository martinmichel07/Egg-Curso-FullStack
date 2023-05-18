/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej11;

import Entidad.CargaFecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class JOOZEJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();
       
        CargaFecha cargaFecha = new CargaFecha();
        System.out.println("Ingrese su año de nacimiento");
        cargaFecha.setAnio(leer.nextInt());
        System.out.println("Ingrese su mes de nacimiento");
        cargaFecha.setMes(leer.nextInt());
        System.out.println("Ingrese su dia de nacimiento");
        cargaFecha.setDia(leer.nextInt());
        
        int resultado= fechaActual.getYear() - cargaFecha.getAnio();
        
        System.out.println("la fecha actual es: " + fechaActual);
        System.out.println("la fecha ingresada es: " + cargaFecha.toString());
        System.out.println("Los años entre la fecha cargada y la actual es:  " + (resultado + 1900));
        

                    
    

        
        
    }


    
}
