/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
            
        System.out.println("Ingrese la cantidad de Euros a convertir: ");
        double euros = leer.nextInt();
        
        System.out.println("Ingre la moneda:");
        System.out.println("1: Libras");
        System.out.println("2: Pesos");
        System.out.println("3: Yenes");
        int opcion = leer.nextInt();
        String moneda = "";
        
        
       switch (opcion){
           case 1 :
               moneda = "Libras";
               break;
           case 2 :
               moneda = "Pesos";
               break;
           case 3: 
               moneda = "Yenes";
               break;
           default:
               System.out.println("La opcion ingresada no es valida");
           
       }
       
        conversion(euros, moneda);
        
        
        
    }
    
    public static String conversion (double euros, String moneda){
        
        double libras, pesos, yenes;
        
        libras = euros / 0.86;
        pesos =  euros / 1.28611;
        yenes =  euros /  129.852;
        
        String frase= moneda;
        
        
        if (frase == "Libras" ) {
            System.out.println(libras + " " + frase + " es " + euros + " €"); 
            
        }else if (frase == "Pesos") {
            System.out.println(pesos + " " + frase + " es " + euros + " €"); 
        }else
            System.out.println(yenes + " " + frase + " es " + euros + " €"); 
                
        
        return null;
                
        
    }
    
}
