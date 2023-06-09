/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class VenderorServicio {

    Scanner leer = new Scanner(System.in);

    public Vendedor altaVendedor() {

        //instancian un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();

        //lleno los atributos
        System.out.println("Ingrese el nomgre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    //metodo para calcular las comisiones y el sueldo total
    //creamos  metodos void porque no necesitamos que retorne nada pero si le pasamos por parametros un objeto de tipo vendedor para que se realicen los calculos
    
    public void SueldoMensual(Vendedor v1) {
        System.out.println("Ingrese el importe de las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor "
                + v1.getNombre() + " es de $ " + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones");

        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 dias de vacaciones ");

        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias de vacaciones");

        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias de vacaciones");

        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }

}
