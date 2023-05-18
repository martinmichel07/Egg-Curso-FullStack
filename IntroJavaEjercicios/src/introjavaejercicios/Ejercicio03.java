/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("La frase en minusculas es: " + frase.toLowerCase());
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
    }
    
}
