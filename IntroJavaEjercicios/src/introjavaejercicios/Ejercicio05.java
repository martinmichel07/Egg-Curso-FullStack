/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero = leer.nextInt();
        
        System.out.println("");
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(numero));
        System.out.println("El valor doble del numero es: " + numero * 2);
        System.out.println("El valor triple del numero es: " + numero * 3);
        
    }
    
}
