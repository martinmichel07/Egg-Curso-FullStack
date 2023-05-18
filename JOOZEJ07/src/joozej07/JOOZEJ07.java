/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joozej07;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author A308763
 */
public class JOOZEJ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PersonaServicio sp = new PersonaServicio();

        int bajoPeso = 0;
        int pesoIdeal = 0;
        int pesoEnsima = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < 4; i++) {

           Persona p1 = sp.crearPersona();
            sp.calcularIMC();
            sp.mayorDeEdad();

            switch (p1.getImc()) {
                case 1:
                    pesoEnsima = pesoEnsima + 1;
                    break;
                case 0:
                    pesoIdeal = pesoIdeal + 1;
                    break;
                default:
                    bajoPeso = bajoPeso + 1;
                    break;
            }

            if (p1.isMayor() == true) {
                mayor = mayor + 1;
            } else {
                menor = menor + 1;
            }

        }

        System.out.println("el porcentaje de Bajo peso es: " + (bajoPeso * 100 / 4));
        System.out.println("El porcentaje de peso ideal es:" + (pesoIdeal * 100 / 4));
        System.out.println("El porcentaje de peso por encima es: " + (pesoEnsima * 100 / 4));
        System.out.println("El porcentaje de mayores es: " + (mayor * 100 / 4));
        System.out.println("El porcentaje de menores es " + (menor * 100 / 4));

    }

}
