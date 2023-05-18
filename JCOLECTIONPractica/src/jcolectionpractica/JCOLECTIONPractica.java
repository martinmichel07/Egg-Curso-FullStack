/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolectionpractica;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author A308763
 */
public class JCOLECTIONPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Listas
        ArrayList<Integer> numerosA = new ArrayList();

        int x = 20;
        numerosA.add(x); //Agregamos el numero 20 a la lista en la pocicion 0 
        numerosA.add(x); //Agregamos el numero 20 a la lista en la pocicion 1
        numerosA.add(x); //Agregamos el numero 20 a la lista en la pocicion 2
        numerosA.add(x); //Agregamos el numero 20 a la lista en la pocicion 4
        numerosA.add(x); //Agregamos el numero 20 a la lista en la pocicion 5
        numerosA.remove(4);
        for (Integer numero : numerosA) {
            System.out.println(numero);
        }
        System.out.println("");

        //Conjuntos
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 30;
        Integer o = 31;
        Integer p = 32;
        Integer r = 33;
        Integer a = 34;
        numerosB.add(y);
        numerosB.add(o);
        numerosB.add(p);
        numerosB.add(r);
        numerosB.add(a);
        numerosB.remove(31);

        for (Integer numero : numerosB) {
            System.out.println(numero);
        }
        System.out.println("");

        //Mapas
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 26310387;
        String nombre = "Martin";
        alumnos.put(dni, nombre);//Agregamos la llave y el valor

        int dni2 = 27310387;
        String nombre2 = "Martin";
        alumnos.put(dni2, nombre2);//Agregamos la llave y el valor

        int dni3 = 28310387;
        String nombre3 = "Martin";
        alumnos.put(dni3, nombre3);//Agregamos la llave y el valor

        int dni4 = 29310387;
        String nombre4 = "Martin";
        alumnos.put(dni4, nombre4);//Agregamos la llave y el valor

        int dni5 = 25310387;
        String nombre5 = "Martin";
        alumnos.put(dni5, nombre5);//Agregamos la llave y el valor

        alumnos.remove(25310387);

        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("Documento= " + entry.getKey() + " , nombre= " + entry.getValue());
        }

        HashSet<String> personas = new HashSet();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.add(n1);
        personas.add(n2);

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro();
        libros.add(libro);
        
        
        for(Libro ejmeplar: libros){
            System.out.println(ejmeplar);
        }
        
        



    }
    
}
