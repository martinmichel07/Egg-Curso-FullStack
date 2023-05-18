/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrelacionesejextra01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import jdk.nashorn.internal.ir.ContinueNode;

/**
 *
 * @author A308763
 */
public class JRELACIONESEJEXTRA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombrePersona = "";
        String nombrePerro = "";

        //Creo un mapa con los perros disponibles
        Map<String, Boolean> perrosDisponibles = new HashMap<>();
        perrosDisponibles.put("Toby", false);
        perrosDisponibles.put("Fido", false);
        perrosDisponibles.put("Luckky", false);
        perrosDisponibles.put("Max", false);

        //Creamos un mapa vacio para las personas interesadas en adoptar
        Map<String, String> personasInteresadas = new HashMap<>();

        //pedimos a cada persona que elija un perro
        while (true) {
            System.out.println("Ingrese su nombre (o 'salir' para terminar) : ");
            nombrePersona = leer.nextLine();
            if (nombrePersona.equals("salir")) {
                break;
            }

            //Verificamos si la persona ya eligio un perro
            if (personasInteresadas.containsKey(nombrePersona)) {
                System.out.println(nombrePersona + "ya eligio a " + personasInteresadas);
            }

            //pedimos al usuario que elija un perro.
            System.out.println("Ingrese el nombre del perro");
            nombrePerro = leer.nextLine();
            if (!perrosDisponibles.containsKey(nombrePerro)) {
                System.out.println("Lo siento, " + nombrePerro + " no esta disponible");
            } else if (perrosDisponibles.get(nombrePerro)) {
                System.out.println("Lo siento, " + nombrePerro + " ya fue adoptado");
            }

            //Asignamos el perro a la persona
            personasInteresadas.put(nombrePersona, nombrePerro);
            perrosDisponibles.put(nombrePerro, true);

        }
        
        //mostramos a las personas con sus respectivos perros
        System.out.println("Las siguinetes personas han adoptado un perro");
        for (Map.Entry<String, String> entry : personasInteresadas.entrySet()) {
            System.out.println(entry.getKey()+ ": " + entry.getValue());            
        }

    }

}
