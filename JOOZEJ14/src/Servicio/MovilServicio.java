/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class MovilServicio {
    
    public Movil cargarCelular(){
        
        Scanner leer = new Scanner (System.in);
        Movil m1 = new Movil();
        
        System.out.println("ingrese la marca");
        m1.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo");
        m1.setModelo(leer.nextLine());
        System.out.println("Ingrese el almacenamiento");
        m1.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese la memoria");
        m1.setMemoria(leer.nextInt());
        System.out.println("Ingrese el precio");
        m1.setPrecio(leer.nextInt());

        return m1;
    }
    
    public void ingresarCodigo(Movil m1){
          Scanner leer = new Scanner (System.in);
        int[]codigos = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el numero de codigo");
            codigos[i]= leer.nextInt();
            m1.setCodigo(codigos);
        }
    }
    
    public void mostrarCelular(Movil m1){
        
        System.out.println("Los datos del celular son: ");
        System.out.println(m1.toString());
        int[]codigo = m1.getCodigo();
        System.out.println("El codigo es: ");
        for (int i = 0; i < m1.getCodigo().length; i++) {
            int cod = codigo[i];
            System.out.print(cod);
        }
        System.out.println("");
    }
    
}
