/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package introjavaejercicios;

/**
 *
 * @author A308763
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarvector();
        
        
    }
    
    
    public static int[] cargarvector (){
    
        int [] vector = new int [200];
        
        for (int i = 0; i < 200; i++) {
            vector[i] = i;          
        }
        
      return vector;
        
    }
    
    public static int[] mostrarvector(){
        
        int[] vector = cargarvector();
        int valor = 0;
        int posicion = 0;
        
        for (int i = 200; i > 0; i--) {
             if (i % 2 == 0){
                 posicion = posicion+1;
                System.out.println(posicion + " = [" + i + "] " );
             }
             valor = valor + 1;
           
        }
          System.out.println("");
            
        return vector;
    }
    
}
