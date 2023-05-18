/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;


/**
 *
 * @author A308763
 */
public class MatematicaServicio {
    
    public void  devolverMayor(Matematica m1){
        System.out.println("El primer nuemero es: " + m1.getNumero1());
        System.out.println("El segundo numero es: " + m1.getNumero2());
        System.out.println("El numero mayor es: " + Math.max(m1.getNumero1(),m1.getNumero2()));
        System.out.println("El numero menor es: "+ min(m1.getNumero1(), m1.getNumero2()));
    }
    
    public void calcularPotencia(Matematica m1){
        double mayor= max(m1.getNumero1(), m1.getNumero2());
        double menor = min(m1.getNumero1(), m1.getNumero2());
        double resultado;
        //Redondeo el valor con round y elevo a la potencia con pow
        resultado = round(pow(mayor, menor));
        System.out.println("El mayor numero elevado a la potencia del menor y redondeado es: " + resultado);
    }
    
    public void calcularRaiz(Matematica m1){
        double menor = Math.min(m1.getNumero1(), m1.getNumero2());
        double resultado;
        //Calculo la raiz cuadra del menor con sqrt y redondeo con round
        resultado=round(sqrt(menor));
        System.out.println("La raiz cuadrada del menor y redondeado es : " + resultado);
    }


    
}
