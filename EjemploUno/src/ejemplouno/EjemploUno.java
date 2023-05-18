/*

* Creado por Martin Michel
* Version 1.0
* Creado 17/10/2019

*/
package ejemplouno;
//importo la libreria del scanner

import java.util.Scanner;

public class EjemploUno {

    public static void main(String[] args) {
        //declaro las variables
        String palabra = "", palabraInvertida = "";
        int longitudPablabra = 0;
        //declaro el Scanner
        Scanner entrada = new Scanner(System.in);

        //pido por pantalla la palabra
        System.out.print("Ingrese el texto: ");
        palabra = entrada.nextLine(); //me guardo el valor en la variable

        longitudPablabra = palabra.length();//cuento la palabra

        while (longitudPablabra != 0) {//mientras el valor es distinto de cero
            palabraInvertida += palabra.substring(longitudPablabra - 1, longitudPablabra); //voy guardando el caracter de la palabra desde el final al proncipio
            longitudPablabra--;//decremento el contador
        }

        System.out.println(" el valor es: " + palabraInvertida); // imprimo por pantalla

    }  

}
