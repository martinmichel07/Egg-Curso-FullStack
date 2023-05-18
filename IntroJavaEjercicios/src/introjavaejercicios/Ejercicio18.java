/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package introjavaejercicios;

/**
 *
 * @author A308763
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarmatriz();
    }
    
    public static int[][] cargarmatriz (){
        
        int[][] matriz= new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(Math.random()*10);
            }
        }
        
        return matriz;
    }
    
    public static int [][] mostrarmatriz(){
        
        int[][] matriz = cargarmatriz();
        
            //mostrar la matriz
            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("");
            }


            //traspuesta
            System.out.println("");  
            for (int j = 0; j < 4; j++) {

                 for (int i = 0; i < 4; i++) {
                     System.out.print("[" + matriz[i][j] + "]");
                 }
                 System.out.println("");
            }
            

            //Mostrar las coordenadas
                        System.out.println("");
            for (int i = 0; i < 4; i++) {

                 for (int j = 0; j < 4; j++) {
                     System.out.print("[" + i + j + "]");
                 }
                 System.out.println("");
            }
        return matriz;
    }
}
