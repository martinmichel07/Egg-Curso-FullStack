/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados centigrados: ");
        double  gradosC = leer.nextInt();
        
        double gradosF = 32 + (gradosC * 9/5);
        System.out.println("Los grados Fahrenheit equivalentes son : " + gradosF);
        
    }
    
}
