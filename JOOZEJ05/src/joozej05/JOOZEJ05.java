/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej05;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class JOOZEJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        //instancio el objeto servicio
        CuentaBancariaServicio sc = new CuentaBancariaServicio();
        System.out.println("Bienvenido al sistema Bancario ");
        System.out.println("Por favor cree una cuenta para continuar");
        //instancio objeto para alojar los datos del mertodo de alta
        CuentaBancaria c1 = sc.altaCuenta();
        System.out.println("Muchas gracias por crear una cuenta");
        System.out.println("");


        boolean bandera = false;

        do {
            System.out.println("Que desea realizar");
            System.out.println("");
            System.out.println("Ingrese una opcion");
            System.out.println("");
            System.out.println("1 - Ingreso de dinero");
            System.out.println("2 - Retiro de dinero");
            System.out.println("3 - Extraccion rapida");
            System.out.println("4 - Condulta de saldo");
            System.out.println("5 - Consulta de cuenta");
            System.out.println("6 - Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sc.ingreso(c1);
                    break;
                case 2:
                    sc.retiro(c1);
                    break;
                case 3:
                    sc.extraccionRapida(c1);
                    break;
                case 4:
                   sc.consultaSaldo(c1);
                    break;
                case 5:
                    sc.consultaCuenta(c1);
                    break;
                case 6:
                    System.out.println("Muchas Gracias!!!");
                    bandera = true;
                    break;
                default:
                    System.out.println(" Opcion no disponible ");
            }

        } while (bandera == false);

    }

}
