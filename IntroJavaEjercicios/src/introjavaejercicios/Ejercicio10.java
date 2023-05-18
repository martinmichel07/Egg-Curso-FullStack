/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite para la suma");
        int limite = leer.nextInt();
        int suma =0;
        
        
        do {
            
            System.out.println("ingrese los numeros a sumar: ");
            int numeros = leer.nextInt();
            suma= suma + numeros;
            
        } while (suma < limite);
        
        
    }
    
}
