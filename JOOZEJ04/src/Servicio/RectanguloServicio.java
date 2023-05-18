/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author A308763
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    //metodo para pedir los datos y hacer el alta del objeto
    public Rectangulo altaRectangulo() {

        //instancio un objeto 
        Rectangulo r1 = new Rectangulo();

        //pido los datos
        System.out.println("Ingrese la base: ");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura: ");
        r1.setAltura(leer.nextInt());

        return r1;
    }

    //metodo para calcular la superficie
    public void superficie(Rectangulo r1) {
        System.out.println("La superfice del rectangulo es: " + (r1.getBase() * r1.getAltura()));
    }

    //metodo para calcular el perimetro
    public void perimetro(Rectangulo r1) {
        System.out.println("El perimetro del rectanguo es: " + ((r1.getBase() + r1.getAltura()) * 2));
    }

    //metodo para dibujar el rectangulo
    public void dibujoRectangulo(Rectangulo r1) {
        
        for (int i = 0; i < r1.getAltura(); i++) {
            
            System.out.print("*"); //imprimo la primer coluna de j
        
            for (int j = 0; j < r1.getBase() - 2; j++) { //recorro j menos la primer y ultima pocicion
            
                if (i == 0 || i == r1.getAltura()-1) { 
                    System.out.print("*"); //solo imprimo en la primera y anteultima  fila  de i
                } else {
                    System.out.print(" "); //no imprimo nada que este dentro del rectangulo

                }
            }
            System.out.print("*"); //imprimo la ultima columna de j
            System.out.println(""); //bajo una linea
        }
    }
}
