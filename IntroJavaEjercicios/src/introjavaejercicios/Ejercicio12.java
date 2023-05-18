/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package introjavaejercicios;

import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        int incorrectas =0;
        int correctas =0;
        
        
        System.out.println("");
            System.out.println("NOTA");
            System.out.println("Las cadenas deben llegar con un formato fijo: \n"+
                               "tienen que ser de un máximo de 5 caracteres de largo,\n"+
                               "el primer carácter tiene que ser X y el último tiene que ser una O.\n" +
                               "la secuencia especial “&&&&&” marca el final de los envíos");
            System.out.println("");

        do {
            System.out.println("ingrese la cadena a leer");
            String cadena = leer.nextLine();

            if (cadena.equals("&&&&&")) {
                bandera=true;
               //Pongo un break para salir del bucle
                break;
                
            }if (cadena.length()==5) {
                
                if ( cadena.charAt(0) == 'X' && cadena.charAt(4)== 'O') {
                        correctas = correctas +1;
                    }else{
                     incorrectas = incorrectas +1;
                }
                
            }else
                    incorrectas = incorrectas +1;
                
                                 
        } while (bandera=true);
        
        int total = correctas + incorrectas;
        
        System.out.println("Las lectura total es: " + total);
        System.out.println("Las lecturs correctas son: " + correctas);
        System.out.println("Las lecturas incorrectas son: " + incorrectas);

    }
    
}
