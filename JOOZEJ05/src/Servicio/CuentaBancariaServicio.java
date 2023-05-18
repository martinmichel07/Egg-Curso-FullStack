/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;
import static oracle.jrockit.jfr.events.Bits.doubleValue;

/**
 *
 * @author A308763
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    
    //metodo para crear el objeto y pedir los datos
    public CuentaBancaria altaCuenta() {
        
        CuentaBancaria c1 = new CuentaBancaria();
        
        System.out.println("Ingrese el numero de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI; ");
        c1.setDNI(leer.nextLong());
        c1.setSaldo(0);
        
        return c1;
    }
    
    //metodo para ingresar dinero
    public void ingreso(CuentaBancaria c1){
        System.out.println("Ingreso de dinero!!");
        System.out.println("¿Cuanto dinero desea ingresar ?");
        int ingreso = leer.nextInt();
        c1.setSaldo(c1.getSaldo() + ingreso);
        System.out.println("Su ingreso fue de: $ "  + ingreso);
        System.out.println("Su saldo actual es: $ " + c1.getSaldo());
    }
    
    //metodo para retirar dinero
    public void retiro(CuentaBancaria c1){
        System.out.println("Extraccion de dinero ");
        System.out.println("Su saldo actual es: $ " + c1.getSaldo());
        System.out.println("¿Cuanto dinero desea retirar? ");
        int retiro = leer.nextInt();
        boolean bandera = false;
        do {            
             if (retiro > c1.getSaldo()) {
                System.out.println("No tiene saldo suficiente!");
                System.out.println("por favor ingrese otro importe o $ 0 para salir");
                retiro = leer.nextInt();
             }else{
                 bandera = true;
             }
                        
        } while (bandera == false);
       
        c1.setSaldo(c1.getSaldo() - retiro);
        System.out.println("Su retiro fue de: $ " + retiro);
        System.out.println("Su saldo actual es: $ " + c1.getSaldo());
        
    }
    
    //Metodo extraccion rapida
    public void extraccionRapida(CuentaBancaria c1){
        System.out.println("Extraccion Rapida");
        System.out.println("Su extraccion sera solo el 20 % de su saldo");
        System.out.println("Su saldo actual es: $ " + c1.getSaldo());

        double retiroDisponible = c1.getSaldo()*0.2;
        
        //utilizo ((int)doubleValue(retiroDisponible)) para truncar y transformar en entero el valor de retiroDisponible
        if (((int)doubleValue(retiroDisponible)) < c1.getSaldo()) {
            System.out.println("Su retiro fue de: $ " + ((int)doubleValue(retiroDisponible)));
            c1.setSaldo(c1.getSaldo()-((int)doubleValue(retiroDisponible)));
            System.out.println("Su saldo actual es: $" + c1.getSaldo());
        }else
            System.out.println("No tiene saldo suficiente para hacer un retiro rapido");
        }
    
    //metodo para consulta de saldo
    public void consultaSaldo(CuentaBancaria c1){
        System.out.println("Su saldo actual es: $ " + c1.getSaldo() );
}
    
    //metodo para consyultar la cuenta
    public void consultaCuenta (CuentaBancaria c1){
        System.out.println("Los datos de su cuenta son: ");
        System.out.println(c1.toString());
    }

}
