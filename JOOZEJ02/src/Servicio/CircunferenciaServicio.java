/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in);

    //Metodo para crear el objeto circunferencia y donde pido el valor y lo guardo en el atributo
    public Circunferencia crearCircunferencia() {

        //instancio un objeto de tipo circunferencia
        Circunferencia c1 = new Circunferencia();

        //pido los datos
        System.out.println("Ingrese el valor de la circunferencia");
        c1.setRadio(leer.nextDouble());

        return c1;

    }
    
    //metodo para calcular el area, donde paso el valor por argumento
    public void area(Circunferencia c1){
        System.out.println("El area es: ");
         System.out.println( (3.14 * (c1.getRadio()*c1.getRadio())));
    }
    
    //Metodo para calcular el perimetro
    public void perimetro(Circunferencia c1){
        System.out.println("El perimetro es: ");
        System.out.println(2*3.14*c1.getRadio());
    }

}
