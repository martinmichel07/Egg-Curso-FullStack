/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int largo = leer.nextInt();
        
        System.out.println("Ingrese el numero a buscar");
        int numero = leer.nextInt();
                
        mostrarvector(largo,numero);
        
    }
    
    
    public static int [] cargavector (int largo){
    
        int[] vector = new int[largo];
        
            for (int i = 0; i < largo; i++) {
             vector[i]=(int)(Math.random() * 100) ; //cargo nuemeros aleatorios
            }
            
        return vector;
    }
    
    
    public static int [] mostrarvector (int largo, int numero){
        
        int[] vector = cargavector(largo);
        int cont =0;
        
        for (int i = 0; i < largo; i++) {
            if (numero == vector[i]) {
                System.out.println("[" + i + " ]" + numero);   
                cont = cont +1;
            }
        }
        
        if (cont > 1) {
            System.out.println("El numero se encuentra repetido");
        }
        
        System.out.println("");
        return vector;
        
    }
    
}
