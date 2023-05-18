/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class ProductoServicio {

    HashMap<String, Double> productos = new HashMap();

    public Producto altaProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.nextLine();
        System.out.println("Por favor ingrese el precio");
        Double precio = leer.nextDouble();
        productos.put(nombre, precio);
        return null;
    }

    public void buscarProductos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese el nombre del producto a buscar");
        String nombre = leer.nextLine();
        System.out.println("");

        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(nombre)) {
                System.out.println("El producto encontrado es el siguiente:");
                System.out.println(" Nombre= " + key + ", Precio= " + value);
                System.out.println("");
            }
        }
    }

    public void modificarProductos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Los productos son:");
        mostrarProductos();
        System.out.println("Ingrese el nombre que va a modificar");
        String nombreActual = leer.nextLine();
        System.out.println("ingrese el nuevo nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el  nuevo precio ");
        Double precio = leer.nextDouble();

        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(nombreActual)) {
                productos.remove(key);
                productos.put(nombre, precio);
                break;
            }
        }
        System.out.println("Los productos quedaron");
        mostrarProductos();

    }

    public void bajaProductos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Los productos son: ");
        mostrarProductos();
        System.out.println("");
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = leer.nextLine();
        System.out.println("");

        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if (key.equals(nombre)) {
                productos.remove(key);
                break;
            }
        }
        System.out.println("Los productos quedaron");
        mostrarProductos();

    }

    public void mostrarProductos() {
        System.out.println("Los productos cargados son: ");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(" Nombre= " + key + ", Precio= " + value);
        }
    }

    public void menu() {
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        do {
            System.out.println("");
            System.out.println("Bienvenido al Sistema");
            System.out.println("Por favor elija una opcion");
            System.out.println("1. Alta de un producto");
            System.out.println("2. Buscar un produco");
            System.out.println("3. modificar un producto");
            System.out.println("4. Baja de un producto");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Salir");
            System.out.println("");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    altaProducto();
                    break;
                case 2:
                    buscarProductos();
                    break;
                case 3:
                    modificarProductos();
                    break;
                case 4:
                    bajaProductos();
                    break;
                case 5:
                    mostrarProductos();
                    break;
                case 6:
                    System.out.println("Muchas gracias !!");
                    bandera = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (bandera == false);

    }

}
