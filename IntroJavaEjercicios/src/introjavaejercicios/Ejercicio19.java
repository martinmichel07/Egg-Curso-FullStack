/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mostrarmatriz();
    }
    
    public static int [][] cargarmatriz(){
        
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la siguiente coordenada: " + "[" + i + j + "]");
                matriz[i][j]= leer.nextInt();
            }
        }
                        
        return matriz;
    }
    
  
    public static int[][] mostrarmatriz(){
        
        int[][] matriz = cargarmatriz();
        int[][] matriz2 = new int [3][3];
        
        //mostrar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        //traspuesta
        boolean bandera = true;
        
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j]= matriz[j][i];
                System.out.print("[" + matriz2[i][j] + "]");
                //verifico si es anti simetrica
                if ( matriz[i][j] + matriz2[i][j] == 0) {
                }else
                    bandera = false;
            }
            System.out.println("");
        }
        
        //imprimo mensaje de anti simetrica
        if (bandera==true) {
            System.out.println("La matriz SI es anti simetrica");
            
        }else{
            System.out.println("La matriz NO es anti simetrica");
        }
        

        //coordenadas
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ i + j + "]");
            }
            System.out.println("");
        }
        
        return matriz;
    }
}
