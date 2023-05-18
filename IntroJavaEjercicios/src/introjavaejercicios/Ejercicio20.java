/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarmatriz();
    }
    
    public static int [][] cargarmatriz(){
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        boolean bandera= true;
        int valor;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //Valido el ingreso de numeros entre 1 y 9
                do {
                   System.out.println("Ingrese el valor de la coordenada: " + "[" + i + j + "]");
                   valor = leer.nextInt();
                    if (valor > 0 && valor < 10) {
                        bandera= true;
                    }else{
                        bandera=false;
                    }
                } while (bandera==false);
                
                 matriz[i][j] = valor;

            }
        }
        return matriz;
    }
    
    public static int[][] mostrarmatriz(){
        int[][] matriz = cargarmatriz();
        
        //mostrar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
             }
            System.out.println("");
        }
        
        //coordenadas
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + j + "]");
            }
            System.out.println("");
        }
        
        //verifico si es magica
        boolean bandera= true;
        int contador = 0;
        
            //primero busco el valor de la diagional
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i - j == 0) {
                    contador = contador + matriz[i][j];
                }
            }
        }
            //Valido las horizontales
        for (int i = 0; i < 3; i++) {
            int contador1=0;
            for (int j = 0; j < 3; j++) {
                contador1=contador1 + matriz[i][j];
            }
            if (contador==contador1) {               
            }else{
                bandera = false;
            }
        }
            //valido las verticales
        for (int j = 0; j < 3; j++) {
            int contador2=0;
            for (int i = 0; i < 3; i++) {
                 contador2=contador2 + matriz[i][j];
            }
            if (contador==contador2) {               
            }else{
                bandera = false;
            }
        }
            //informo el resultado si es magica
         if (bandera==true) {
            System.out.println("La matriz es magica");            
        }else{
            System.out.println("La matriz NO es magica");
        }
       
        return matriz;
    }
}
