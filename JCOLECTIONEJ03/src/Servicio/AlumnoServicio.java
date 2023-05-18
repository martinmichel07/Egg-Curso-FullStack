/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class AlumnoServicio {

    public ArrayList<Alumno> alumnos = new ArrayList();

    public Alumno altaAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.nextLine();
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + i);
            notas.add(leer.nextInt());
        }
        Alumno al = new Alumno();
        al.setNombre(nombre);
        al.setNotas(notas);
        alumnos.add(al);
        System.out.println("Desea crear otro alumno");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            altaAlumno();
        }
        return al;
    }

    public double notaFinal(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                ArrayList<Integer> notas = alumno.getNotas();
                int contador = 0;
                for (int i = 0; i < 3; i++) {
                    contador = contador + notas.get(i);
                }
                double promedio = contador / 3;
                return promedio;
            }
        }
        return -1;
    }

}
