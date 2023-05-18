/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej06;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class JOOZEJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        CafeteraServicio sc = new CafeteraServicio();

        boolean bandera = false;
        boolean bandera1 = false;
        boolean bandera2 = false;

        do {

            System.out.println("Bienvenido");
            System.out.println("Primero debe llenar la cafetera");
            do {
                System.out.println("Presione: ");
                System.out.println("1- llenar");
                System.out.println("2- Salir");
                System.out.println("");
                int opcionLlenado = leer.nextInt();

                if (opcionLlenado == 1) {
                    Cafetera c1 = sc.llenarCafetera();
                    do {
                        System.out.println("");
                        System.out.println("Ingrese una Opcion");
                        System.out.println("1- Servir taza");
                        System.out.println("2- Vaciar cafetera");
                        System.out.println("3- Agregar cafe");
                        System.out.println("4- Salir");
                        System.out.println("");
                        int opcion = leer.nextInt();

                        switch (opcion) {
                            case 1:
                                sc.servirTaza();
                                break;
                            case 2:
                                sc.vaciarCafetera();
                                break;
                            case 3:
                                sc.agregarCafe();
                                break;
                            case 4:
                                System.out.println("Muchas gracias! por usar el servicio");
                                bandera = true;
                                bandera1 = true;
                                bandera2 = true;
                                break;
                            default:
                                System.out.println("La opcion no es valida");
                                break;
                        }
                    } while (bandera2 == false);

                } else if (opcionLlenado == 2) {
                    System.out.println("Muchas gracias!!!");
                    bandera = true;
                    bandera1= true;
                } else {
                    System.out.println("La opcion ingresada no es valida");
                    bandera1 = false;

                }

            } while (bandera1 == false);

        } while (bandera == false);

    }
}
