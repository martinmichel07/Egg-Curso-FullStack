/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño del cuadrado");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            
           System.out.print("*");
            
            for (int j = 0; j < cantidad-2; j++) {
                
                if (i==0 || i==cantidad-1) {
                    System.out.print("*");
                }else{
                       System.out.print(" ");
                          
                    }
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}
    

