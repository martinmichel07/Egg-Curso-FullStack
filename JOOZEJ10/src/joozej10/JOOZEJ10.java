/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej10;

import java.util.Arrays;

/**
 *
 * @author A308763
 */
public class JOOZEJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarArreglo();
    }

    public static double[] altaArregloA() {

        double[] arreglo = new double[50];
        //lo cargo
        for (int i = 0; i < 50; i++) {
            arreglo[i] = (double) (Math.random() * 10);
        }
        return arreglo;
    }

    public static double[] mostrarArreglo() {

        double[] arreglo = altaArregloA();
        double[] arreglo2 = new double [20];
        
        //Imprimo el vector original
        System.out.println("Imprimo el vector de 50 original");
        for (int i = 0; i < 50; i++) {
          System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("");
        
        //Ordeno el vector
        Arrays.sort(arreglo);
        System.out.println("Imprimo el vector de 50 ordenado");
        System.out.println("");
        //imprimo el vector de de 50
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + arreglo[i] + "]");
            //Cargo los primeros 10 nuemeros del vector de 50 ordenados
            if (i<10) {
                arreglo2[i]=arreglo[i];
            }
        }
        
        System.out.println("");
        //Cargo el vector de 20
        for (int i = 10; i < 20; i++) {
            arreglo2[i]=0.5;
        }
        
        
        System.out.println("imprimo el vector de 20");
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.println("[" + arreglo2[i] + "]");
        }
        
          System.out.println("");      

        return arreglo;

    }

}
