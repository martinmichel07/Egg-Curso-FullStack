/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class CursoServicio {

    public Curso crearCurso() {
        Scanner leer = new Scanner(System.in);
        Curso c1 = new Curso();

        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese el turno del curso");
        c1.setTurno(leer.nextLine());
        System.out.println("Ingrese la cantidad de dias a la semana que se repite el curso");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("ingrese la cantidad de horas por dia del curso");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        c1.setPrecioPorHora(leer.nextInt());

        cargarAlumnos(c1);

        return c1;

    }

    public void cargarAlumnos(Curso c1) {
        Scanner leer = new Scanner(System.in);

        //Cargo los valores del objeto
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = leer.nextLine();
            c1.setAlumnos(alumnos);
        }
    }

    public void calcularGananciaSemanal(Curso c1) {

        int ganancia = c1.getCantidadHorasPorDia() * c1.getCantidadDiasPorSemana() * c1.getPrecioPorHora() * c1.getAlumnos().length;
        System.out.println("");
        System.out.println("La ganancia del curso es: " + ganancia);

        System.out.println("El curso es: " + c1.getNombreCurso());
        System.out.println("");
        System.out.println("Los alumnos son: ");
        
        String[] alumnos = c1.getAlumnos();
        for (int i = 0; i < 5; i++) {
            String alumnio = alumnos[i];
            System.out.println(alumnio);
        }

    }

}
