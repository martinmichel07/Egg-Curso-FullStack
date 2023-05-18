/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int largo = leer.nextInt();
        
        mostrarvector(largo);
    }
    
    public static int[] cargavector(int largo){
        int[]vector= new int[largo];
        for (int i = 0; i < largo; i++) {
            vector[i] = (int)(Math.random() * 100000);
        }
        return vector;
        
    }
    
    public static int [] mostrarvector(int largo){
        int[] vector = cargavector(largo);
        
        int digito1 = 0, digito2 = 0, digito3 = 0,digito4 = 0, digito5 = 0;
        
        System.out.println("");
        for (int i = 0; i < largo; i++) {
            System.out.println(" [" + i + "]" + vector[i]);
            
            if (vector[i] > 0 && vector [i] < 10 ) {
                digito1 = digito1 + 1;
            } else if (vector[i] >= 10 && vector[i] < 100 ) {
                digito2 = digito2 + 1;
            }else if (vector[i] >= 100 && vector[i] < 1000) {
                digito3 = digito3 + 1;
            }else if (vector[i] >= 1000 && vector[i] < 10000) {
                digito4 = digito4 + 1;
            }else if (vector[i] >=10000 && vector[i] < 100000) {
                digito5 = digito5 + 1;
            }
        }
        
        System.out.println("");
        System.out.println("La cantidad de numeros con 1 digitos es : " + digito1);
        System.out.println("La cantidad de numeros con 2 digitos es : " + digito2);
        System.out.println("La cantidad de numeros con 3 digitos es : " + digito3);
        System.out.println("La cantidad de numeros con 4 digitos es : " + digito4);
        System.out.println("La cantidad de numeros con 5 digitos es : " + digito5);
        System.out.println("");
        return vector;
    }
}
