/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        //Declaramos como double por que tenemos una division
        double numero1 = leer.nextInt();
        double numero2 = leer.nextInt();
        boolean bandera = false;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    double suma = numero1 + numero2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    double restar = numero1 - numero2;
                    System.out.println("La resta es: " + restar);
                    break;
                case 3:
                    double multiplicar = numero1 * numero2;
                    System.out.println("La multiplicacion es: " + multiplicar);
                    break;
                case 4:
                    double dividir = numero1 / numero2;
                    System.out.println("La divicion es: " + dividir);
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)?");
                    //Se usa next por que es solo un ncaracter que se pide
                    String salir = leer.next();
                    if (salir.equals("S")|| salir.equals("s")) {
                        System.out.println("Muchas gracias");
                        bandera = true;
                    }
                    break;

                default:
                    System.out.println("La opicion ingresada es incorrecta");
            }
            
        } while (bandera==false);
        
        
    }


}
