/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolectionej03;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author A308763
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
* 
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

* Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

* Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main
 */
public class JCOLECTIONEJ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoServicio sa = new AlumnoServicio();
        Alumno a1 = sa.altaAlumno();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a buscar ");
        String nombre = leer.nextLine();
        double resultado = sa.notaFinal( nombre);
        if (resultado == -1) {
            System.out.println("El alumno no existe !!");
        }else{
            System.out.println("El promedio es: " + resultado);
        }
    
        
    }
    
}
