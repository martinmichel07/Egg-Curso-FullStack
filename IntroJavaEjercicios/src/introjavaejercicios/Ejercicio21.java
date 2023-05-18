/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buscarmatriz();
    }
    
    
    public static int[][]Cargarmatriz10x10(){

        int[][] matriz = new int[10][10];
        
        //Cargo aleatoriamente la matriz de 10X10  
        for (int i = 0; i < 10; i++) {            
            for (int j = 0; j < 10; j++) {
                matriz[i][j]=(int)(Math.random()*10);                
            }
        } 
        //Imprimo la matriz 10x10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }  
        System.out.println("");
        return matriz;
    }  
    
             

    
    public static int[][] Cargarmatriz3x3(){
        Scanner leer = new Scanner(System.in); 
        
        int[][] matriz1 = new int[3][3];
        
         //Cargo la matriz de 3X3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la coordenada: " + "[" + i + j + "]");
                matriz1[i][j]=leer.nextInt();
            }
        }
        //Imprimo la matriz de 3X3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println("");
        }
        return matriz1;
    }


    public static int[][] Buscarmatriz(){
        
        int[][] matriz = Cargarmatriz10x10();
        int[][] matriz1 = Cargarmatriz3x3();
        
        int fila=0;
        int columna=0;
        int coincidencia=0;
        boolean bandera = false;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //utilizo una condicion para saber si concide la primera pocicion de la principal con la secundaria
                if ((matriz[i][j]==matriz1[0][0])&& bandera==false) {
                    
                    int k=i;
                    int l=j;
                    int m=0;
                    int n=0;
                    for (k = i; k < (i+3); k++) {
                        for (l = j; l < (j+3); l++) {
                            if (matriz[k][l]==matriz1[m][n]) {
                                fila=k-2; //Me guardo la primera posicion encontrada
                                columna=l-2; //Me guardo la primera posicion encontrada
                                coincidencia=1;
                                n=n+1;
                                //asigno bandera para validarla en la condicion de comparacion
                                bandera=true;
                             }else{
                                coincidencia=0;
                                k=i+3;
                                l=j+3;
                                fila=0;
                                columna=0;
                                bandera=false;
                            }
                        }
                        m=m+1;
                        n=0;
                    }
                
                }
            }
        }
        
        //imprimo las pociciones donde se encuentra la secundaria dentro de la principal con el valor gardado.
        if (coincidencia > 0) {
            System.out.println("La matriz principal contiene qa la secundaria");
            System.out.println("Se encuentra ubicada en: ");
            System.out.println("");
            for (int m = fila; m < fila + 3; m++) {
                for (int n = columna; n < columna + 3; n++) {
                    System.out.println("[" + m + "," + n + "] ");
                }
            }
                        
        }else{
            System.out.println("La matriz principal no contiene a la secundaria !!!");
        }



       return matriz ;
    }
}
